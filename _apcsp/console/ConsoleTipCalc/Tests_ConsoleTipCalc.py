from ConsoleTipCalc import *
import unittest


class AutomaticTester(unittest.TestCase):
    def test_valid_input(self):
        self.assertTrue(validNumber("0"))
        self.assertTrue(validNumber("10"))
        self.assertTrue(validNumber("3.14"))
    
    def test_invalid_input(self):
        self.assertFalse(validNumber("banana"))
        self.assertFalse(validNumber("-5"))
        self.assertFalse(validNumber(""))

    def test_calculate_tip(self):
        self.assertAlmostEqual(calculateTip(50.00, 15), 7.50, places=2)
        self.assertAlmostEqual(calculateTip(100.00, 20), 20.00, places=2)
        self.assertAlmostEqual(calculateTip(25.50, 10), 2.55, places=2)




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