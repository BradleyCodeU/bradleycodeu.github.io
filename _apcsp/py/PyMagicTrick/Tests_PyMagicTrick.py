from PyMagicTrick import *
import unittest

class AutomaticTester(unittest.TestCase):

    def test_double(self):
        # Test the double function
        self.assertEqual(double(5), 10)  # 5 doubled is 10
        self.assertEqual(double(0), 0)    # 0 doubled is 0
        self.assertEqual(double(-3), -6)   # -3 doubled is -6

    def test_plusTen(self):
        # Test the plusTen function
        self.assertEqual(plusTen(5), 15)   # 5 plus 10 is 15
        self.assertEqual(plusTen(-3), 7)   # -3 plus 10 is 7
        self.assertEqual(plusTen(0), 10)   # 0 plus 10 is 10

    def test_halve(self):
        # Test the halve function
        self.assertEqual(halve(10), 5)     # 10 halved is 5
        self.assertEqual(halve(15), 7.5)   # 15 halved is 7.5
        self.assertEqual(halve(3), 1.5)    # 3 halved is 1.5

    def test_magicTrick(self):
        # Test the magicTrick function
        result = float(magicTrick())  # Convert the result to a float
        self.assertAlmostEqual(result, 5.0, delta=0.001)  # Check if result is close


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