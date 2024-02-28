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

    def test_getChatbotList_count_bots(self):
        chatbots = getChatbotList()
        self.assertTrue(len(chatbots) >= 2, "There should be at least 2 chatbots in the list.")
        countNonDanBots = 0
        countOfDanBots = 0
        for eachChatbot in chatbots:
            if eachChatbot['name'] != "Cowboy Dan":
                countNonDanBots += 1
            else:
                countOfDanBots += 1
        self.assertTrue(countOfDanBots > 0, "Do not include the demo chatbot dan in the list.")
        self.assertTrue(countNonDanBots >= 2, "There should be at least 2 non-Dan chatbots in the list.")

    def test_getChatbotList_count_phrases(self):
        chatbots = getChatbotList()
        self.assertTrue(len(chatbots) >= 2, "There should be at least 2 chatbots in the list.")
        for eachChatbot in chatbots:
            self.assertTrue('name' in eachChatbot.keys(), "Each chatbot must have a \"name\" key with their name as the value")
            self.assertTrue(len(eachChatbot) >= 8, "Each chatbot must have at least 8 key/value pairs.")
            uniquePhrases = []
            for key, val in eachChatbot.items():
                if val not in uniquePhrases:
                    uniquePhrases.append(val)
            self.assertTrue(len(uniquePhrases) >= 8, "Each chatbot must have at least 8 *unique* responses.")





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