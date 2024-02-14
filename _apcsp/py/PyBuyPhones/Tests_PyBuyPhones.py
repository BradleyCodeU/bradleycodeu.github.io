from PyBuyPhones import *
import unittest


class AutomaticTester(unittest.TestCase):
    def test_buyPhones_399_399(self):
        amountOfPhones = buyPhones('399', '399')
        self.assertEqual(amountOfPhones, 1)

    def test_buyPhones_398_99_399(self):
        amountOfPhones = buyPhones(398.99, 399)
        self.assertEqual(amountOfPhones, 0)

    def test_buyPhones_600_199_99(self):
        amountOfPhones = buyPhones(600, 199.99)
        self.assertEqual(amountOfPhones, 3)

    def test_buyPhones_799_199_99(self):
        amountOfPhones = buyPhones(799, 199.99)
        self.assertEqual(amountOfPhones, 3)

    def test_buyPhones_0_199_99(self):
        amountOfPhones = buyPhones(0, 199.99)
        self.assertEqual(amountOfPhones, 0)

    def test_buyPhones_200_100_50(self):
        amountOfPhones = buyPhones(200, 100)
        self.assertEqual(amountOfPhones, 2)

    def test_buyPhones_259_5(self):
        amountOfPhones = buyPhones(259, 5)
        self.assertEqual(amountOfPhones, 51)

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