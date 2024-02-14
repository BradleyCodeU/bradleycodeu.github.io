from ConsoleFunctionPractice import *
import unittest


class AutomaticTester(unittest.TestCase):

    def test_firstAndLast(self):
        # Enter code here
        self.assertEquals(firstAndLast("Apple"), "Ae")
        self.assertEquals(firstAndLast("alaska"), "aa")
        self.assertEquals(firstAndLast("Ohio"), "Oo")
        self.assertEquals(firstAndLast("lkjasdf"), "lf")
        self.assertEquals(firstAndLast("lf"), "lf")
        self.assertEquals(firstAndLast("qkjsdfkjsdq"), "qq")


    def test_middleLetter(self):
        # Enter code here
        self.assertEquals(middleLetter("Apple"), "p")
        self.assertEquals(middleLetter("alaska"), "s")
        self.assertEquals(middleLetter("Ohio"), "i")
        self.assertEquals(middleLetter("qwerty"), "r")
        self.assertEquals(middleLetter("qwert"), "e")
        self.assertEquals(middleLetter("qw"), "w")
        self.assertEquals(middleLetter("123456789"), "5")

    def test_startsWithA(self):
        # Enter code here
        self.assertEquals(True, startsWithA("Apple"))
        self.assertEquals(True, startsWithA("alaska"))
        self.assertEquals(False, startsWithA("Ohio"))
        self.assertEquals(True, startsWithA("aaa"))
        self.assertEquals(True, startsWithA("AAA"))
        self.assertEquals(False, startsWithA("lkjasdf"))

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