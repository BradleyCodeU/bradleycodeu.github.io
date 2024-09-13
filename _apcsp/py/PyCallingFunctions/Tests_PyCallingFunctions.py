import os
from PyCallingFunctions import *
import unittest


class AutomaticTester(unittest.TestCase):
    def test_test_1_findFirstVowel(self):
        self.assertEqual(test_1_findFirstVowel(), 2)
        # print("Test 1 findFirstVowel\nExpected 'Steve' -> 2")
        # test_1_findFirstVowel()
    def test_test_2_findFirstVowel(self):
        self.assertEqual(test_2_findFirstVowel(), 1)
        # print("Test 2 findFirstVowel\nExpected 'Hilliard' -> 1")
        # test_2_findFirstVowel()
    def test_test_3_getVowelName(self):
        self.assertEqual(test_3_getVowelName(), 'istine')
        # print("Test 3 getVowelName\nExpected 'Christine' -> 'istine'")
        # test_3_getVowelName()
    def test_test_4_getVowelName(self):
        self.assertEqual(test_4_getVowelName(), 'brynn')
        # print("Test 4 getVowelName\nExpected 'Name' -> 'ame'\nExpected 'Brynn' -> 'brynn'")
        # test_4_getVowelName()
    def test_test_5_playNameGame(self):
        result = test_5_playNameGame()
        self.assertTrue(len(result) >= 49)
        self.assertTrue("Bonana-fanna" in result)
        # print("Test 3 playNameGame")
        # test_5_playNameGame()

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