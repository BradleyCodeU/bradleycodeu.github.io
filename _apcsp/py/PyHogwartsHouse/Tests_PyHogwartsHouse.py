import os
from PyHogwartsHouse import *
import unittest

class AutomaticTester(unittest.TestCase):

    def test_validateNumber(self):
        self.assertEquals(validateNumber("1"), True)
        self.assertEquals(validateNumber(5), True)
        self.assertEquals(validateNumber("10"), True)
        self.assertEquals(validateNumber("0"), False)
        self.assertEquals(validateNumber("11"), False)
        self.assertEquals(validateNumber(-1), False)
        self.assertEquals(validateNumber(9999), False)

    def test_getHouse_Gryffindor(self):
        self.assertEquals(getHouse(9, 6), "Gryffindor")
        self.assertEquals(getHouse("7", "8"), "Gryffindor")

    def test_getHouse_Hufflepuff(self):
        self.assertEquals(getHouse(5, 6), "Hufflepuff")
        self.assertEquals(getHouse("1", "9"), "Hufflepuff")

    def test_getHouse_Ravenclaw(self):
        self.assertEquals(getHouse(5,5), "Ravenclaw")
        self.assertEquals(getHouse("2","1"), "Ravenclaw")

    def test_getHouse_Slytherin(self):
        self.assertEquals(getHouse(6,5), "Slytherin")
        self.assertEquals(getHouse("10","1"), "Slytherin")

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