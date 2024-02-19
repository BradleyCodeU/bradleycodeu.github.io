from ObjectsCastlesAndCreatures import *
import unittest



class AutomaticTester(unittest.TestCase):
    def test_valid_integer(self):
        self.assertTrue(validNumber("10"))
        self.assertTrue(validNumber("100"))
    
    def test_invalid_integer(self):
        self.assertFalse(validNumber("-5"))
        self.assertFalse(validNumber("0"))
        self.assertFalse(validNumber("abc"))
        self.assertFalse(validNumber("3.14"))

    def test_getChatbotList(self):
        self.assertTrue(len(getChatbotList()) >= 2)
        for eachChatbot of getChatbotList():
            self.assertTrue(len(eachChatbot) >= 8,"Each chatbot must have 8 key/value pairs.")
            uniquePhrases = []
            for key, val in eachChatbot.items():
                if val not in uniquePhrases:
                    uniquePhrases.append(val)
            self.assertTrue(len(uniquePhrases) >= 8,"Each chatbot must have 8 *unique* responses.")





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
