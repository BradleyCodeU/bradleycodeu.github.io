import unittest
from PyWeightOnPlanets import *


class Tests_PyWeightOnPlanets(unittest.TestCase):

    def test_kilogramsToPounds(self):
        self.assertAlmostEqual(kilogramsToPounds(101), 222.6668848018, places=0)
        self.assertAlmostEqual(kilogramsToPounds(321), 707.6838615978, places=0)

    def test_poundsToKilograms(self):
        self.assertAlmostEqual(poundsToKilograms(103), 46.72001411103365, places=0)
        self.assertAlmostEqual(poundsToKilograms(211), 95.70799007211747, places=0)

    def test_validNumber(self):
        self.assertTrue(validNumber(0))
        self.assertTrue(validNumber(150))
        self.assertTrue(validNumber(250))
        self.assertFalse(validNumber(9999999999))


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
