from ObjectsCastlesAndCreatures import *
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
        self.assertEqual(10 <= wins <= 50 and 50 <= fails <= 90, 1)
    def test_validInput(self):
        #validInput(0)| False |
        #|validInput(1)| True |
        #|validInput("4")| True |
        #|validInput(5)| False |
        #|validInput("one")| False |
        self.assertEqual(validInput(0), False)
        self.assertEqual(validInput(1), True)
        self.assertEqual(validInput("4"), True)
        self.assertEqual(validInput(5), False)
        self.assertEqual(validInput("one"), False)
    def test_isPlayerAlive(self):
        self.assertEqual(isPlayerAlive(-1), False)
        self.assertEqual(isPlayerAlive(0), False)
        self.assertEqual(isPlayerAlive(1), True)
    def test_playerLoseHealth(self):
        x = makeEnemy("x",50,60)
        for i in range(100):
            self.assertEqual(50<=playerLoseHealth(100,x)<=99, True)
            self.assertEqual(0<=playerLoseHealth(50,x)<=49, True)
    def test_enemyLoseHealth(self):
        x = makeEnemy("x",1,200)
        x['weakness'] = 2
        #enemyLoseHealth(2,x)|Only returns 182 - 197
        for i in range(100):
            self.assertEqual(182<=enemyLoseHealth(2,x)<=197, True)
            self.assertEqual(188<=enemyLoseHealth(5,x)<=198, True)
    def test_rollDice(self):
        #|rollDice(0)| 0 |
        #|rollDice(1)| Only returns 1 - 6 |
        #|rollDice(2)| Only returns 2 - 12 |
        #|rollDice(10)| Only returns 10 - 60 |
        for i in range(100):
            self.assertEqual(rollDice(0), 0)
            self.assertEqual(1<=rollDice(1)<=6, True)
            self.assertEqual(2<=rollDice(2)<=12, True)
            self.assertEqual(10<=rollDice(10)<=60, True)
    def test_makeEnemy(self):
        # |x = makeEnemy("Shrek",10,20)<br>x['power']|10|
        # |x = makeEnemy("Donkey",50,60)<br>x['health']|60|
        # |x = makeEnemy("Fiona",70,77)<br>x['name']|"Fiona"|
        # |x = makeEnemy("Fiona",70,77)<br>x['weakness']|Only returns 1 - 3|
        x1 = makeEnemy("Shrek",10,20)
        self.assertEqual(x1['power'], 10)
        x2 = makeEnemy("Donkey",50,60)
        self.assertEqual(x2['health'], 60)
        x3 = makeEnemy("Fiona",70,77)
        self.assertEqual(x3['name'], "Fiona")
        for i in range(10):
            x3 = makeEnemy("Fiona",70,77)
            self.assertEqual(1<=x3['weakness']<=3, True)

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