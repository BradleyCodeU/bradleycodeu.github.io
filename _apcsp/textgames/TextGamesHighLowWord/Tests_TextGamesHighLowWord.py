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
        print("✅"*result.success_count + "  All tests passed!\n")