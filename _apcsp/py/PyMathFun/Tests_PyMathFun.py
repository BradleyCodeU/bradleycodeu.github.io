import os
from PyMathFun import *
import unittest


class AutomaticTester(unittest.TestCase):

    def test_maximumValue(self):
        self.assertTrue(maximumValue(1, 3, -5) == 3)
        self.assertTrue(maximumValue("7", "2", "9") == 9)

    def test_anyNegative(self):
        self.assertTrue(anyNegative(0, 5, 99, 10) == False)
        self.assertTrue(anyNegative("-7", "-5", "7", "5") == True)

    def test_smallest(self):
        self.assertTrue(smallest(3, -5) == -5)
        self.assertTrue(smallest("-9", "-2") == -9)

    def test_slope(self):
        self.assertTrue(slope(0, 0, 0, 10) == "undefined")
        self.assertTrue(slope("-7", "-5", "7", "5") == 0.7142857142857143)

    def test_absoluteValue(self):
        self.assertTrue(absoluteValue(-55) == 55)
        self.assertTrue(absoluteValue("42") == 42)

# CustomTestResult version 240225
class CustomTestResultV240225(unittest.TextTestResult):
    def __init__(self, stream, descriptions, verbosity):
        super().__init__(stream, descriptions, verbosity)
        self.stream = stream
        self.verbosity = verbosity
        self.success_count = 0
        self.failure_count = 0
        self.error_count = 0

    def addSuccess(self, test):
        self.success_count += 1
        if self.verbosity > 0:
            self.stream.write("✅  ")
        else:
            super().addSuccess(test)
        self.stream.writeln(test._testMethodName)

    def addFailure(self, test, err):
        super().addFailure(test, err)
        self.failure_count += 1
        self.stream.write("❌ ")
        self.stream.writeln(f"{test._testMethodName}")

    def addError(self, test, err):  # Define addError method
        super().addError(test, err)
        self.error_count += 1
        self.stream.write("🐝 ")
        self.stream.writeln(f"{test._testMethodName}")

    def startTestRun(self):
        super().startTestRun()
        self.success_count = 0
        self.failure_count = 0
        self.error_count = 0

    def stopTestRun(self):
        super().stopTestRun()
        total_failures = self.failure_count + self.error_count
        if total_failures > 0:
            self.stream.writeln(
                f"❌  {self.success_count}/{self.success_count + total_failures} passed, see failures and errors"
            )
        else:
            self.stream.writeln(
                f"✅  {self.success_count}/{self.success_count + total_failures} passed!"
            )

if __name__ == "__main__":
    result = unittest.TextTestRunner(resultclass=CustomTestResultV240225, verbosity=1).run(
        unittest.TestLoader().loadTestsFromTestCase(AutomaticTester)
    )
    if result.failures or result.errors:
        failed_test_names = [test._testMethodName for test, _ in result.failures]
        error_test_names = [test._testMethodName for test, _ in result.errors]
        for each in failed_test_names:
            print(f"❌  {each}")
        for each in error_test_names:
            print(f"🐝  {each}")
        print()
    else:
        print(os.path.basename(__file__))
        print("✅"*result.success_count + "  All tests passed!\n")