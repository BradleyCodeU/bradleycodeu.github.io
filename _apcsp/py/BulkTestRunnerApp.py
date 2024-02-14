import unittest
import os
import sys
import importlib.util
from tkinter import Tk, filedialog

class TestFolder(unittest.TestCase):
    def test_folder(self):
        # Prompt user to select a folder
        root = Tk()
        root.withdraw()  # Hide the root window

        folder_path = filedialog.askdirectory(title="Select a folder")
        root.destroy()  # Close the root window after selection

        if not folder_path:
            sys.exit("No folder selected. Exiting...")

        # Prompt user to select a unittest file
        root = Tk()
        root.withdraw()  # Hide the root window

        unittest_file_path = filedialog.askopenfilename(title="Select a unittest file", filetypes=[("Python files", "*.py")])
        root.destroy()  # Close the root window after selection

        if not unittest_file_path:
            sys.exit("No unittest file selected. Exiting...")

        # Load the unittest module dynamically
        unittest_module = self.load_unittest_module(unittest_file_path)

        if unittest_module is None:
            sys.exit("Unable to load unittest module. Exiting...")

        # Dynamically import modules from the selected folder
        folder_files = [f for f in os.listdir(folder_path) if f.endswith('.py')]
        for file_name in folder_files:
            module_name = os.path.splitext(file_name)[0]
            module_path = os.path.join(folder_path, file_name)
            module_spec = importlib.util.spec_from_file_location(module_name, module_path)
            imported_module = importlib.util.module_from_spec(module_spec)
            module_spec.loader.exec_module(imported_module)

            # Print "Testing filename"
            print(f"Testing {file_name}")

            # Import necessary functions from the module being tested
            self.import_functions(imported_module, unittest_module)

            # Run tests from the loaded unittest module
            loader = unittest.TestLoader()
            suite = loader.loadTestsFromModule(unittest_module)
            runner = unittest.TextTestRunner()
            result = runner.run(suite)

            if not result.wasSuccessful():
                print(f"Tests failed in file: {file_name}")

    def load_unittest_module(self, file_path):
        try:
            spec = importlib.util.spec_from_file_location("unittest_module", file_path)
            unittest_module = importlib.util.module_from_spec(spec)
            spec.loader.exec_module(unittest_module)
            return unittest_module
        except Exception as e:
            print(f"Error loading unittest module: {e}")
            return None

    def import_functions(self, imported_module, unittest_module):
        # Import necessary functions from the module being tested
        functions_to_import = ['kilogramsToPounds', 'poundsToKilograms', 'validNumber']
        for function_name in functions_to_import:
            setattr(unittest_module, function_name, getattr(imported_module, function_name))

if __name__ == '__main__':
    unittest.main()
