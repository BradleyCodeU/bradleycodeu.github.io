from TextGamesHighLowWord import *
import unittest



class AutomaticTester(unittest.TestCase):

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
        self.stream.write("❌")
        self.stream.writeln(f" {test._testMethodName}")

    def startTestRun(self):
        super().startTestRun()
        self.success_count = 0
        self.failure_count = 0

    def stopTestRun(self):
        if self.failure_count > 0:
            self.stream.writeln(
                f"❌  {self.success_count}/{self.success_count + self.failure_count} passed, see errors below"
            )
        else:
            self.stream.writeln(
                f"✅  {self.success_count}/{self.success_count + self.failure_count} passed!"
            )


if __name__ == "__main__":
    result = unittest.TextTestRunner(resultclass=MyTestResult, verbosity=1).run(
        unittest.TestLoader().loadTestsFromTestCase(AutomaticTester)
    )
    if result.failures:
        failed_test_names = [test._testMethodName for test, _ in result.failures]
        failed_test_names = [name for name in failed_test_names]
        for each in failed_test_names:
            print(f"❌  {each}")
        print()
    else:
        print("✅  All tests passed!\n")