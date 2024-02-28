from ConsoleStringsAndScreams import *
import unittest


class AutomaticTester(unittest.TestCase):
    def test_getLength(self):
        self.assertEqual(getLength("John"), 4)
        self.assertEqual(getLength("Alice"), 5)
        self.assertEqual(getLength(""), 0)

    def test_firstLetter(self):
        self.assertEqual(firstLetter("John"), "J")
        self.assertEqual(firstLetter("Alice"), "A")
        self.assertEqual(firstLetter(""), None)

    def test_lastLetter(self):
        self.assertEqual(lastLetter("John"), "n")
        self.assertEqual(lastLetter("Alice"), "e")
        self.assertEqual(lastLetter(""), None)

    def test_printDetails(self):
        self.assertEqual(printDetails("John"), "John")
        self.assertEqual(printDetails("Alice"), "Alice")
        self.assertEqual(printDetails(""), "")

    def test_getNickname(self):
        self.assertEqual(getNickname("Doe"), "DoDo")
        self.assertEqual(getNickname("Smith"), "SmSm")

    def test_scream(self):
        self.assertEqual(scream("John", "Doe"), "AAAAAAA!")
        self.assertEqual(scream("", ""), "!")
        self.assertEqual(scream("Alice", "Smith"), "AAAAAAAAAA!")


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
        print("✅"*result.success_count + "  All tests passed!\n")