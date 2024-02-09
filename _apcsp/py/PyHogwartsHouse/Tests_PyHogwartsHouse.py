import unittest

from PyHogwartsHouse import *


class Tests_PyHogwartsHouse(unittest.TestCase):

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
