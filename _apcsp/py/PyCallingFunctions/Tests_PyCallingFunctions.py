import unittest
from PyCallingFunctions import *


class Tests_PyCallingFunctions(unittest.TestCase):
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



class MyTestResult(unittest.TextTestResult):

    def __init__(self, stream, descriptions, verbosity):
        super().__init__(stream, descriptions, verbosity)
        self.stream = stream
        self.verbosity = verbosity
        self.success_count = 0
        self.failure_count = 0

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
        if self.verbosity > 0:
            self.stream.write("❌  ")
        else:
            self.stream.writeln(f"FAIL: {test._testMethodName}")
        self.stream.writeln(f"{test._testMethodName}")
        # self.stream.writeln("Stack Trace:")
#         self.stream.writeln("Traceback (most recent call last):")
#         self.stream.writeln("  File \"/home/runner/1212-Weight-On-Planets-KevinAcosta16/_test_runnertest_suite.py\", line 17, in test_validNumber")
#         self.stream.writeln(f"    {err}")


    def startTestRun(self):
        super().startTestRun()
        self.success_count = 0
        self.failure_count = 0

    def stopTestRun(self):
        if self.failure_count > 0:
            self.stream.writeln(f"\n❌  {self.success_count}/{self.success_count + self.failure_count} passed, see errors below")
        else:
            self.stream.writeln(f"\n✅  {self.success_count}/{self.success_count + self.failure_count} passed!")


if __name__ == '__main__':
    unittest.main(testRunner=unittest.TextTestRunner(resultclass=MyTestResult, verbosity=1), exit=False)
