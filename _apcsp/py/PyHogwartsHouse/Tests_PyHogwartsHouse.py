from PyHogwartsHouse import *
import unittest

class AutomaticTester(unittest.TestCase):

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