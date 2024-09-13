import os
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

    def test_sellLemonade_positive_values(self):
        # Test with typical valid inputs
        self.assertEqual(sellLemonade(1.50, 10), 15.0)
        self.assertEqual(sellLemonade(2.25, 4), 9.0)
    
    def test_sellLemonade_string_inputs(self):
        # Test with string inputs (should still work due to conversion)
        self.assertEqual(sellLemonade("2.00", "5"), 10.0)
        self.assertEqual(sellLemonade("3.75", "8"), 30.0)
    
    def test_sellLemonade_zero_values(self):
        # Test with zero customers
        self.assertEqual(sellLemonade(1.50, 0), 0.0)
        self.assertEqual(sellLemonade(0.0, 10), 0.0)

    def test_getMaxGallons_exactly_sufficient_resources(self):
        # Test when both sugar and lemons exactly match the requirement for a specific number of gallons.
        self.assertEqual(getMaxGallons(1, 6), 1)  # 1 bag of sugar and 6 lemons should make exactly 1 gallon.

    def test_getMaxGallons_more_sugar_than_lemons(self):
        # Test when there is more sugar than lemons available.
        self.assertEqual(getMaxGallons(2, 6), 1)  # 2 bags of sugar but only 6 lemons (1 gallon max).

    def test_getMaxGallons_more_lemons_than_sugar(self):
        # Test when there are more lemons than sugar available.
        self.assertEqual(getMaxGallons(1, 15), 2)  # 1 bag of sugar but 12 lemons (2 gallon max).

    def test_getMaxGallons_more_sugar_and_lemons(self):
        # Test when both sugar and lemons are in excess of what's needed for a specific number of gallons.
        self.assertEqual(getMaxGallons(2, 12), 2)  # 2 bags of sugar and 12 lemons should make 2 gallons.

    def test_getMaxGallons_fractions_of_resources(self):
        # Test with fractional bags of sugar and lemons.
        self.assertEqual(getMaxGallons(1.5, 10), 1)  # 1.5 bags of sugar and 10 lemons (1 gallon max).

    def test_getMaxGallons_zero_resources(self):
        # Test with zero resources.
        self.assertEqual(getMaxGallons(0, 0), 0)  # No sugar and no lemons should make 0 gallons.

    def test_getMaxGallons_non_integer_inputs(self):
        # Test with non-integer and non-float values for resources.
        self.assertEqual(getMaxGallons('3', "18"), 3)  # String input for bagsOfSugar should be converted to float.


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
        print(os.path.basename(__file__))
        print("✅"*result.success_count + "  All tests passed!\n")