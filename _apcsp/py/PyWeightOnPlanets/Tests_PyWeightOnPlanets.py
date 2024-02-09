import unittest

from PyWeightOnPlanets import *


class Tests_PyWeightOnPlanets(unittest.TestCase):

    def test_kilogramsToPounds(self):
        self.assertAlmostEqual(kilogramsToPounds(101), 222.6668848018,places=0)
        self.assertAlmostEqual(kilogramsToPounds(321), 707.6838615978,places=0)

    def test_poundsToKilograms(self):
        self.assertAlmostEqual(poundsToKilograms(103), 46.72001411103365,places=0)
        self.assertAlmostEqual(poundsToKilograms(211), 95.70799007211747,places=0)
            
    def test_validNumber(self):
        self.assertEquals(validNumber(0), False)
        self.assertEquals(validNumber(150), True)
        self.assertEquals(validNumber(250), True)
        self.assertEquals(validNumber(9999999999), False)


class MyTestResult(unittest.TextTestResult):

    def __init__(self, stream, descriptions, verbosity):
        super().__init__(stream, descriptions, verbosity)
        self.stream = stream
        self.verbosity = verbosity

    def addSuccess(self, test):
        if self.verbosity > 0:
            self.stream.write("✅")
        else:
            super().addSuccess(test)

    def addFailure(self, test, err):
        super().addFailure(test, err)
        if self.verbosity > 0:
            self.stream.write("🛑")
        else:
            self.stream.writeln(f"FAIL: {test._testMethodName}")
            self.stream.writeln(err)

    def startTest(self, test):
        unittest.TestResult.startTest(self, test)
        if self.verbosity > 1:
            self.stream.write(f"{test._testMethodName}")
            self.stream.flush()

if __name__ == '__main__':
    unittest.main(testRunner=unittest.TextTestRunner(resultclass=MyTestResult, verbosity=1),exit=False)
    #unittest.main(verbosity=1,exit=False)
