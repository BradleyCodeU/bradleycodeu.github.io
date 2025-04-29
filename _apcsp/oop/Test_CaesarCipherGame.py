import unittest
import random
# === Include or import your game functions here ===
# For example... from your_game_file import *
from CaesarCipherGame import *

# === Test Class ===
class AutomaticTester(unittest.TestCase):
    def test_addScore(self):
        listA=[]
        listB=[{'name':'Ann','score':3}]
        self.assertEqual(addScore("Ann",3,listA)[0],listB[0])
        list2=[{'name':'Ann','score':3}]
        list3=addScore("Bob",4,list2)
        list2=[{'name':'Ann','score':3},{'name':'Bob','score':4}]
        self.assertEqual(list2[0], list3[0])
        self.assertEqual(list2[1], list3[1])

    def test_validInt(self):
        self.assertEqual(validInt(13),	True)
        self.assertEqual(validInt("one"),	False)

    def test_randomSecretCode(self):
        self.assertEqual(randomSecretCode(['a'],['a'],['a']),"aaa")
        self.assertEqual(randomSecretCode(['b'],['b'],['b']),"bbb")
        self.assertEqual(randomSecretCode(['x'],['y'],['z']),"xyz")

    def test_caesarDecrypt(self):
        self.assertEqual(caesarDecrypt("hthtszy",5),"coconut")
        self.assertEqual(caesarDecrypt("^iphe",4),"Zelda")

    def test_caesarEncrypt(self):
        self.assertEqual(caesarEncrypt("apple",1), "bqqmf")
        self.assertEqual(caesarEncrypt("Banana",2), "Dcpcpc")

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