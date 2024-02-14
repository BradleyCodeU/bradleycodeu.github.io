from ConsoleStringsAndScreams import *
import unittest


class AutomaticTester(unittest.TestCase):
    def test_getLength(self):
        self.assertEqual(getLength("John"), 4)
        self.assertEqual(getLength("Alice"), 5)
        self.assertEqual(getLength(""), 0)

    def test_firstLetter(self):
        self.assertEqual(firstLetter("John"), "J")
        self.assertEqual(firstLetter("Alice"), "A")
        self.assertEqual(firstLetter(""), None)

    def test_lastLetter(self):
        self.assertEqual(lastLetter("John"), "n")
        self.assertEqual(lastLetter("Alice"), "e")
        self.assertEqual(lastLetter(""), None)

    def test_printDetails(self):
        self.assertEqual(printDetails("John"), "John")
        self.assertEqual(printDetails("Alice"), "Alice")
        self.assertEqual(printDetails(""), "")

    def test_getNickname(self):
        self.assertEqual(getNickname("Doe"), "DoDo")
        self.assertEqual(getNickname("Smith"), "SmSm")

    def test_scream(self):
        self.assertEqual(scream("John", "Doe"), "AAAAAAA!")
        self.assertEqual(scream("", ""), "!")
        self.assertEqual(scream("Alice", "Smith"), "AAAAAAAAAA!")



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