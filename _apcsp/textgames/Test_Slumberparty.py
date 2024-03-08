import unittest




def slumberparty(day_of_the_week, grade):
  True







class AutomaticTester(unittest.TestCase):
    def test_yes(self):
        self.assertEqual(slumberparty("Saturday", "A-").lower(), "yes")
    def test_yes_bplus(self):
        self.assertEqual(slumberparty("Friday", "B+").lower(), "yes")

    def test_no_bad_grade_d(self):
        self.assertEqual(slumberparty("Friday", "D-").lower(), "no! bad grade")
    def test_no_bad_grade_f(self):
        self.assertEqual(slumberparty("Saturday", "F").lower(), "no! bad grade")

    def test_no_school_night_sunday(self):
        self.assertEqual(slumberparty("Sunday", "B+").lower(), "no! school night")
    def test_no_school_night_monday(self):
        self.assertEqual(slumberparty("Monday", "A+").lower(), "no! school night")

    def test_no_school_night_and_bad_grade_d(self):
        self.assertEqual(slumberparty("Tuesday", "D+").lower(), "no! school night and bad grade")
    def test_no_school_night_and_bad_grade_f(self):
        self.assertEqual(slumberparty("Wednesday", "F").lower(), "no! school night and bad grade")
    def test_no_school_night_and_bad_grade_c(self):
        self.assertEqual(slumberparty("Thursday", "C").lower(), "no! school night and bad grade")

    def test_weird_tricky_examples(self):
        self.assertEqual(slumberparty("chicken", "Blue"), "yes")
        self.assertEqual(slumberparty("not school night", "HAM!!!"), "yes")
        self.assertEqual(slumberparty("anything", "contains A or B"), "yes")
        self.assertEqual(slumberparty("lkjasdfdfas", "BANANA"), "yes")
        self.assertEqual(slumberparty("qwerty", "HILLIARD"), "yes")


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
