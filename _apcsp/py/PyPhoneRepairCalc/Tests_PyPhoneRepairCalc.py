from PyPhoneRepairCalc import *
import unittest

class AutomaticTester(unittest.TestCase):

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