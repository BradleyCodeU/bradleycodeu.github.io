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
        self.assertEquals(10 <= wins <= 50 and 50 <= fails <= 90, 1)
    def test_validInput(self):
        #validInput(0)| False |
        #|validInput(1)| True |
        #|validInput("4")| True |
        #|validInput(5)| False |
        #|validInput("one")| False |
        self.assertEquals(validInput(0), False)
        self.assertEquals(validInput(1), True)
        self.assertEquals(validInput("4"), True)
        self.assertEquals(validInput(5), False)
        self.assertEquals(validInput("one"), False)
    def test_isPlayerAlive(self):
        self.assertEquals(isPlayerAlive(-1), False)
        self.assertEquals(isPlayerAlive(0), False)
        self.assertEquals(isPlayerAlive(1), True)
    def test_playerLoseHealth(self):
        x = makeEnemy("x",50,60)
        for i in range(100):
            self.assertEquals(50<=playerLoseHealth(100,x)<=99, True)
            self.assertEquals(0<=playerLoseHealth(50,x)<=49, True)
    def test_enemyLoseHealth(self):
        x = makeEnemy("x",1,200)
        x['weakness'] = 2
        #enemyLoseHealth(2,x)|Only returns 182 - 197
        for i in range(100):
            self.assertEquals(182<=enemyLoseHealth(2,x)<=197, True)
            self.assertEquals(188<=enemyLoseHealth(5,x)<=198, True)
    def test_rollDice(self):
        #|rollDice(0)| 0 |
        #|rollDice(1)| Only returns 1 - 6 |
        #|rollDice(2)| Only returns 2 - 12 |
        #|rollDice(10)| Only returns 10 - 60 |
        for i in range(100):
            self.assertEquals(rollDice(0), 0)
            self.assertEquals(1<=rollDice(1)<=6, True)
            self.assertEquals(2<=rollDice(2)<=12, True)
            self.assertEquals(10<=rollDice(10)<=60, True)
    def test_makeEnemy(self):
        # |x = makeEnemy("Shrek",10,20)<br>x['power']|10|
        # |x = makeEnemy("Donkey",50,60)<br>x['health']|60|
        # |x = makeEnemy("Fiona",70,77)<br>x['name']|"Fiona"|
        # |x = makeEnemy("Fiona",70,77)<br>x['weakness']|Only returns 1 - 3|
        x1 = makeEnemy("Shrek",10,20)
        self.assertEquals(x1['power'], 10)
        x2 = makeEnemy("Donkey",50,60)
        self.assertEquals(x2['health'], 60)
        x3 = makeEnemy("Fiona",70,77)
        self.assertEquals(x3['name'], "Fiona")
        for i in range(10):
            x3 = makeEnemy("Fiona",70,77)
            self.assertEquals(1<=x3['weakness']<=3, True)

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
