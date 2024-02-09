import unittest

from PyPhoneRepairCalc import *


class Tests_PyPhoneRepairCalc(unittest.TestCase):

    def test_calculateProfit(self):
        # Enter code here
        self.assertAlmostEqual(calculateProfit(101, 40, 10 , 250), 400.0)
        self.assertAlmostEqual(calculateProfit(600, 20, 15, 200), 2805.0)

    def test_buyPhones(self):
        # Enter code here
        self.assertEquals(buyPhones(101, 50), 2)
        self.assertEquals(buyPhones("600", "51"), 11)
        
    def test_sellPhones(self):
        self.assertAlmostEqual(sellPhones(2, 5), 10.0)
        self.assertAlmostEqual(sellPhones("6", "4"), 24.0)


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
