import unittest

def addYesOrNo(string1):
    True







class AutomaticTester(unittest.TestCase):

    def test_add_yes(self):
        self.assertEqual("yes" in addYesOrNo('x'), True)
        self.assertEqual("yes" in addYesOrNo('hat'), True)
        self.assertEqual("yes" in addYesOrNo('chicken soup'), True)

    def test_already_there(self):
        self.assertEqual(addYesOrNo('no x'), 'no x')
        self.assertEqual(addYesOrNo('no cap'), 'no cap')
        self.assertEqual(addYesOrNo('yes sir'), 'yes sir')
        self.assertEqual(addYesOrNo('oh no bro'), 'oh no bro')
        self.assertEqual(addYesOrNo('oh yes sister'), 'oh yes sister')

    def test_tricky_length_condition(self):
        self.assertEqual(addYesOrNo('dog'), "yes dog")
        self.assertEqual(addYesOrNo('hola'), "no hola")
        self.assertEqual(addYesOrNo('12345678'), "no 12345678")
        self.assertEqual(addYesOrNo('123456789'), "yes 123456789")
        self.assertEqual(addYesOrNo('Bradley High'), "yes Bradley High")
        self.assertEqual(addYesOrNo('uno'), 'yes uno')
        self.assertEqual(addYesOrNo('noodle soup'), 'yes noodle soup')
        self.assertEqual(addYesOrNo('yesterday'), 'yes yesterday')
        self.assertEqual(addYesOrNo('lyes'), 'no lyes')
        self.assertEqual(addYesOrNo('grayest'), 'no grayest')

    def test_add_no(self):
        self.assertEqual('no' in addYesOrNo('ball'), True)
        self.assertEqual('no' in addYesOrNo('stamps'), True)
        self.assertEqual('no' in addYesOrNo('candy'), True)

class MyTestResult(unittest.TextTestResult):
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
        self.stream.write("❌ ")
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
    result = unittest.TextTestRunner(resultclass=MyTestResult, verbosity=1).run(
        unittest.TestLoader().loadTestsFromTestCase(AutomaticTester)
    )
    if result.failures or result.errors:
        failed_test_names = [test._testMethodName for test, _ in result.failures]
        failed_test_names += [test._testMethodName for test, _ in result.errors]
        for each in failed_test_names:
            print(f"❌  {each}")
        print()
    else:
        print("✅"*result.success_count + "  All tests passed!\n")
