from ConsoleFunctionPractice import *
import unittest


class AutomaticTester(unittest.TestCase):

    def test_firstAndLast(self):
        # Enter code here
        self.assertEqual(firstAndLast("Apple"), "Ae")
        self.assertEqual(firstAndLast("alaska"), "aa")
        self.assertEqual(firstAndLast("Ohio"), "Oo")
        self.assertEqual(firstAndLast("lkjasdf"), "lf")
        self.assertEqual(firstAndLast("lf"), "lf")
        self.assertEqual(firstAndLast("qkjsdfkjsdq"), "qq")


    def test_middleLetter(self):
        # Enter code here
        self.assertEqual(middleLetter("Apple"), "p")
        self.assertEqual(middleLetter("alaska"), "s")
        self.assertEqual(middleLetter("Ohio"), "i")
        self.assertEqual(middleLetter("qwerty"), "r")
        self.assertEqual(middleLetter("qwert"), "e")
        self.assertEqual(middleLetter("qw"), "w")
        self.assertEqual(middleLetter("123456789"), "5")

    def test_startsWithA(self):
        # Enter code here
        self.assertEqual(True, startsWithA("Apple"))
        self.assertEqual(True, startsWithA("alaska"))
        self.assertEqual(False, startsWithA("Ohio"))
        self.assertEqual(True, startsWithA("aaa"))
        self.assertEqual(True, startsWithA("AAA"))
        self.assertEqual(False, startsWithA("lkjasdf"))
        
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