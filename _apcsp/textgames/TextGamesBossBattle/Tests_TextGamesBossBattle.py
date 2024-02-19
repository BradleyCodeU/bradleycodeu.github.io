from ConsoleTipCalc import *
import unittest


class AutomaticTester(unittest.TestCase):

    def test_hitPlayer(self):
        # Enter code here
        nums = []
        reps = 100
        counter = 0
        for i in range(reps):
            nums.append(hitPlayer(5))
            self.assertEquals(1 <= nums[i] <= 6, True)
        nums = []
        reps = 100
        counter = 0
        for i in range(reps):
            nums.append(hitPlayer(50))
            self.assertEquals(2 <= nums[i] <= 12, True)
            if nums[i] > 6:
            counter += 1
        self.assertEquals(counter > 0, True)

    def test_hitBoss_fire_spell_true_false(self):
        # Enter code here
        # fire spell true false
        nums = []
        reps = 100
        counter = 0
        for i in range(reps):
            nums.append(hitBoss("fire spell",True,False))
            # check range
            self.assertEquals(1 <= nums[i] <= 6, True,"Failed hitBoss(\"fire spell\",True,False) should return numbers in the range 1 <= nums <= 6")
        for i in range(6):
            self.assertEquals(nums.count(i+1) > 0, True,"Failed hitBoss(\"fire spell\",True,False) should return numbers in the range 1 <= nums <= 6")
        
    def test_diceRoll(self):
        # Enter code here
        nums = []
        reps = 900
        for i in range(reps):
            nums.append(diceRoll())
            self.assertEquals(1 <= nums[i] <= 6, True)
        for i in range(6):
            self.assertEquals(nums.count(i+1)/reps > .08, True)

    def test_randomTrueFalse(self):
        # Enter code here
        bools = []
        reps = 100
        for i in range(reps):
            bools.append(randomTrueFalse())
        self.assertEquals(bools.count(True)/reps > .25, True)
        self.assertEquals(bools.count(False)/reps > .25, True)

    def test_randomHealth(self):
        # Enter code here
        reps = 100
        for i in range(reps):
            self.assertEquals(30<=randomHealth()<=50, True)

    def test_whoWins(self):
        # Enter code here
        #   whoWins(1,0)`   | returns "You Win"  |
        # |`whoWins(0,1)`   | returns "You Lose"  |
        # |`whoWins(1,1)`   | returns None 
        self.assertEquals(whoWins(1,1), None)
        self.assertEquals(whoWins(51,91), None)
        self.assertEquals(whoWins(91,51), None)
        self.assertEquals(whoWins(11,91), None)
        self.assertEquals(whoWins(91,11), None)
        self.assertIsNone(whoWins(1, 1))
        self.assertIsNone(whoWins(51, 51))
        self.assertIsNone(whoWins(91, 91))
        self.assertIsNone(whoWins(11, 11))
        self.assertIsNone(whoWins(91, 91))
        self.assertIsNone(whoWins(100, 50))
        self.assertIsNone(whoWins(75, 25))
        self.assertIsNone(whoWins(20, 5))
        self.assertTrue("you won" in whoWins(1, 0).lower() or "you win" in whoWins(1, 0).lower())
        self.assertTrue("you won" in whoWins(51, 0).lower() or "you win" in whoWins(51, 0).lower())
        self.assertTrue("you won" in whoWins(1, -5).lower() or "you win" in whoWins(1, -5).lower())
        self.assertTrue("you won" in whoWins(100, -50).lower() or "you win" in whoWins(100, -50).lower())
        self.assertTrue("you lose" in whoWins(0, 1).lower() or "you lost" in whoWins(0, 1).lower())
        self.assertTrue("you lose" in whoWins(-1, 51).lower() or "you lost" in whoWins(-1, 51).lower())
        self.assertTrue("you lose" in whoWins(-5, 100).lower() or "you lost" in whoWins(-5, 100).lower())

    def test_hitBoss_ice_sword_false_true(self):
        # Enter code here
        # ice sword false true
        nums = []
        reps = 100
        counter = 0
        for i in range(reps):
            nums.append(hitBoss("ice sword",False,True))
            # check range
            self.assertEquals(1 <= nums[i] <= 6, True,'Failed hitBoss("ice sword",False,True) should return numbers in the range 1 <= nums <= 6')
        for i in range(6):
            self.assertEquals(nums.count(i+1) > 0, True,'Failed hitBoss("ice sword",False,True) should return numbers in the range 1 <= nums <= 6')

    def test_hitBoss_fire_sword_false_false(self):
        # Enter code here
        # fire sword false false
        nums = []
        reps = 100
        counter = 0
        for i in range(reps):
            nums.append(hitBoss("fire sword",False,False))
            self.assertEquals(3 <= nums[i] <= 18, True,'Failed hitBoss("fire sword",False,False) should return numbers in the range 3 <= nums <= 18')
            if nums[i] > 12:
            counter += 1
        self.assertEquals(counter > 0, True,'Failed hitBoss("fire sword",False,False) should return numbers in the range 3 <= nums <= 18')

    def test_hitBoss_ice_spell_true_true(self):
        # Enter code here
        # ice spell true true
        nums = []
        reps = 100
        counter = 0
        for i in range(reps):
            nums.append(hitBoss("ice spell",True,True))
            self.assertEquals(3 <= nums[i] <= 18, True,'Failed hitBoss("ice spell",True,True) should return numbers in the range 3 <= nums <= 18')
            if nums[i] > 12:
            counter += 1
        self.assertEquals(counter > 0, True,'Failed hitBoss("ice spell",True,True) should return numbers in the range 3 <= nums <= 18')

    def test_hitBoss_other_tests(self):
        # hitBoss other tests
        self.assertEquals(hitBoss("ice",False,True), 0)
        self.assertEquals(hitBoss("s",False,True), 0)
        self.assertEquals(hitBoss("",False,True), 0)







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