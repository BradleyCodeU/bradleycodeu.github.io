from PySellPhones import *
import unittest


class AutomaticTester(unittest.TestCase):
    def test_sellPhones_string_input(self):
        myMoney = sellPhones('1')
        self.assertEqual(myMoney, 399)

    def test_sellPhones_zero_input(self):
        myMoney = sellPhones(0)
        self.assertEqual(myMoney, 0)

    def test_sellPhones_integer_input(self):
        myMoney = sellPhones(2)
        self.assertEqual(myMoney, 798)

    def test_sellPhones_float_input(self):
        myMoney = sellPhones(2.5)
        self.assertEqual(myMoney, 798)

    def test_sellPhones_negative_integer_input(self):
        myMoney = sellPhones(-3)
        self.assertEqual(myMoney, -1197)

    def test_sellPhones_negative_float_input(self):
        myMoney = sellPhones(-2.5)
        self.assertEqual(myMoney, -798)  # Since it's converted to -2, the result would be -2 * 399 = -798



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