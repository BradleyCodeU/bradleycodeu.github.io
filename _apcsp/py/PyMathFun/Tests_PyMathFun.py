import unittest

from PyMathFun import *


class Tests_PyMathFun(unittest.TestCase):

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
