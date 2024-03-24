from TextGamesCastlesAndCreatures import *

import unittest

class AutomaticTester(unittest.TestCase):

    def test_tryToSteal(self):
        wins = 0
        fails = 0
        for i in range(100):
            if tryToSteal():
                wins += 1
            else:
                fails += 1
        self.assertEqual(10 <= wins <= 50 and 50 <= fails <= 90, 1, "Try to steal: Wins should be between 10-50 and fails between 50-90")

    def test_validInput(self):
        self.assertEqual(validInput(0), False, "validInput(0) should return False")
        self.assertEqual(validInput(1), True, "validInput(1) should return True")
        self.assertEqual(validInput("4"), True, "validInput('4') should return True")
        self.assertEqual(validInput(5), False, "validInput(5) should return False")
        self.assertEqual(validInput("one"), False, "validInput('one') should return False")

    def test_isPlayerAlive(self):
        self.assertEqual(isPlayerAlive(-1), False, "isPlayerAlive(-1) should return False")
        self.assertEqual(isPlayerAlive(0), False, "isPlayerAlive(0) should return False")
        self.assertEqual(isPlayerAlive(1), True, "isPlayerAlive(1) should return True")
        self.assertEqual(isPlayerAlive(99), True, "isPlayerAlive(99) should return True")
        self.assertEqual(isPlayerAlive(-99), False, "isPlayerAlive(-99) should return False")

    def test_playerLoseHealth(self):
        x = makeEnemy("x", 50, 60)
        for i in range(100):
            self.assertEqual(50 <= playerLoseHealth(100, x) <= 99, True, "playerLoseHealth(100, x) should be between 50 and 99")
            self.assertEqual(0 <= playerLoseHealth(50, x) <= 49, True, "playerLoseHealth(50, x) should be between 0 and 49")

    def test_enemyLoseHealth(self):
        x = makeEnemy("x", 1, 200)
        x['weakness'] = 2
        for i in range(100):
            self.assertEqual(182 <= enemyLoseHealth(2, x) <= 197, True, "enemyLoseHealth(2, x) should be between 182 and 197")
            self.assertEqual(188 <= enemyLoseHealth(5, x) <= 198, True, "enemyLoseHealth(5, x) should be between 188 and 198")

    def test_rollDice_check_range(self):
        for i in range(100):
            self.assertEqual(rollDice(0), 0, "rollDice(0) should return 0")
            self.assertEqual(1 <= rollDice(1) <= 6, True, "rollDice(1) should return a value between 1 and 6")
            self.assertEqual(2 <= rollDice(2) <= 12, True, "rollDice(2) should return a value between 2 and 12")
            self.assertEqual(10 <= rollDice(10) <= 60, True, "rollDice(10) should return a value between 10 and 60")
            self.assertEqual(100 <= rollDice(100) <= 600, True, "rollDice(100) should return a value between 100 and 600")

    def test_rollDice_check_for_six_unique_values(self):
        mylist = []
        for i in range(100):
            mylist.append(rollDice(1))
        self.assertEqual(len(set(mylist)), 6, "rollDice(1) should generate six unique values")

    def test_makeEnemy(self):
        x1 = makeEnemy("Shrek", 10, 20)
        self.assertEqual(x1['power'], 10, "makeEnemy('Shrek', 10, 20)['power'] should be 10")
        x2 = makeEnemy("Donkey", 50, 60)
        self.assertEqual(x2['health'], 60, "makeEnemy('Donkey', 50, 60)['health'] should be 60")
        x3 = makeEnemy("Fiona", 70, 77)
        self.assertEqual(x3['name'], "Fiona", "makeEnemy('Fiona', 70, 77)['name'] should be 'Fiona'")
        for i in range(10):
            self.assertEqual(2 <= x3['weakness'] <= 4, True, "makeEnemy('Fiona', 70, 77)['weakness'] should be between 2 and 4")




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