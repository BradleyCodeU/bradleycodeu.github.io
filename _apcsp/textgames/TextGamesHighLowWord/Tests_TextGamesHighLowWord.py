import unittest

from main import *


class TextGamesHighLowWord_Tests(unittest.TestCase):

    def test_checkGuess_secretTests(self):
        self.assertEqual( "You got it".lower() in checkGuess("5","5").lower(),True)
        self.assertEqual(checkGuess("zzz","nnn").lower() , "The secret word is after nnn".lower())
        self.assertEqual(checkGuess("aaa","nnn").lower() , "The secret word is before nnn".lower())

    def test_checkGuess_cat_cat(self):
        self.assertEqual( "You got it".lower() in checkGuess("cat","cat").lower() , True)

    def test_checkGuess_cat_dog(self):
        self.assertEqual(checkGuess("cat","dog").lower(), "The secret word is before dog".lower())

    def test_checkGuess_cat_ant(self):
        self.assertEqual(checkGuess("cat","ant").lower() , "The secret word is after ant".lower())

    def test_randomSecret_cat(self):
        for i in range(10):
            self.assertEqual(randomSecret( ["Cat", "Cat"], ["CAT", "CAT"], ["cAt", "cAt"]), "cat")
            self.assertEqual(randomSecret( ["Cat", "Cat","CAT", "CAT","cAt", "cAt"],[],[]), "cat")

    def test_randomSecret_oops(self):
        for i in range(10):
            self.assertEqual(randomSecret( [ ], [ ], [ ]) , "oops")

    def test_randomSecret_secretTests(self):
        for i in range(10):
            self.assertEqual(randomSecret( ["xYz"], ["xYz", "xYz"], ["xYz", "xYz","xYz"]), "xyz")

    def test_randomSecret_rat(self):
        for i in range(10):
            self.assertEqual(randomSecret( ["RAT"], [ ], [ ]), "rat")
            self.assertEqual(randomSecret( [],["RAT"], [ ]), "rat")
            self.assertEqual(randomSecret( [],[],["RAT"]), "rat")

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
