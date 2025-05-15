import unittest
import HomeRunGame
from BaseballPlayer import BaseballPlayer
from colorama import init,Back

# === Test Class ===
class AutomaticTester(unittest.TestCase):
    def test_isBallHit(self):
        # isballhit
        self.assertEqual(isBallHit(False, False).lower(), "ball")
        self.assertEqual(isBallHit(True, False).lower(), "strike looking")
        self.assertEqual(isBallHit(False, True).lower(), "strike swinging")
        self.assertEqual(isBallHit(True, True).lower(), "hit")

    def test_validIndex(self):
        mylist = [1,2,3]
        self.assertEqual(validIndex(mylist, -1), False)
        self.assertEqual(validIndex(mylist, 0), True)
        self.assertEqual(validIndex(mylist, 2), True)
        self.assertEqual(validIndex(mylist, 3), False)
        mylist = [1,2,3,4,5,6,7]
        self.assertEqual(validIndex(mylist, -1), False)
        self.assertEqual(validIndex(mylist, 0), True)
        self.assertEqual(validIndex(mylist, 6), True)
        self.assertEqual(validIndex(mylist, 7), False)
    
    def test_addPlayers(self):
        mylist = addPlayers()
        foo = BaseballPlayer()
        self.assertEqual(5<=len(mylist)<=10, True)
        for each in mylist:
            self.assertEqual(type(foo) is type(each),True)

    def test_getBatSwing(self):
        # getbatswing
        x = BaseballPlayer()
        x.battingAccuracy = -1
        for i in range(100):
            # swings at bad pitches
            self.assertEqual(x.getBatSwing(False), True)
            # doesn't swing at good
            self.assertEqual(x.getBatSwing(True), False)
        x.battingAccuracy = 11
        for i in range(100):
            self.assertEqual(x.getBatSwing(True), True)
            self.assertEqual(x.getBatSwing(False), False)
        x.battingAccuracy = 7.5
        mylist = []
        for i in range(100):
            mylist.append(x.getBatSwing(True))
        self.assertEqual(True in mylist, True)
        self.assertEqual(False in mylist, True)
 
    def test_getIfGoodPitch(self):
        x = BaseballPlayer()
        x.pitchingAccuracy = -1
        for i in range(100):
          self.assertEqual(x.getIfGoodPitch(), False)
        x.pitchingAccuracy = 11
        for i in range(100):
          self.assertEqual(x.getIfGoodPitch(), True)
        x.pitchingAccuracy = 5
        mylist = []
        for i in range(100):
          mylist.append(x.getIfGoodPitch())
        self.assertEqual(True in mylist, True)
        self.assertEqual(False in mylist, True)
            

    def test_getName(self):
        x = BaseballPlayer()
        first = x.firstName
        self.assertEqual(first in x.getName(), True)
        last = x.lastName
        self.assertEqual(last in x.getName(), True)
        x.firstName = "abababbabaababbabaaba"
        self.assertEqual("abababbabaababbabaaba" in x.getName(), True)
        x.lastName = "bcaccacaacaccacaac"
        self.assertEqual("bcaccacaacaccacaac" in x.getName(), True)
        
    def test_getPitchingGrade(self):
        # getPitchingGrade
        x = BaseballPlayer()
        x.pitchingStrength = 1
        x.pitchingAccuracy = 3
        self.assertEqual(x.getPitchingGrade(), 2)
        x.pitchingStrength = 7
        x.pitchingAccuracy = 3
        self.assertEqual(x.getPitchingGrade(), 5)

    def test_getBattingGrade(self):
        # getBattingGrade
        x = BaseballPlayer()
        x.battingStrength = 1
        x.battingAccuracy = 3
        self.assertEqual(x.getBattingGrade(), 2)
        x.battingStrength = 7
        x.battingAccuracy = 3
        self.assertEqual(x.getBattingGrade(), 5)

    def test_boostPitching(self):
        # boostPitching_boostBatting
        x = BaseballPlayer()
        pStr = x.pitchingStrength
        pAcc = x.pitchingAccuracy
        bStr = x.battingStrength
        bAcc = x.battingAccuracy
        x.boostPitching()
        self.assertEqual(pStr < x.pitchingStrength, True)
        self.assertEqual(pAcc < x.pitchingAccuracy, True)

    def test_boostBatting(self):
        # boostPitching_boostBatting
        x = BaseballPlayer()
        pStr = x.pitchingStrength
        pAcc = x.pitchingAccuracy
        bStr = x.battingStrength
        bAcc = x.battingAccuracy
        x.boostBatting()
        self.assertEqual(bStr < x.battingStrength, True)
        self.assertEqual(bAcc < x.battingAccuracy, True)


    def test_init(self):
        # init
        x = BaseballPlayer()
        self.assertEqual(0<=x.pitchingStrength<=10, True)
        self.assertEqual(0<=x.battingStrength<=10, True)
        self.assertEqual(0<=x.pitchingAccuracy<=10, True)
        self.assertEqual(0<=x.battingAccuracy<=10, True)


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