import unittest



def canCarGo(traffic_light_color, voice_command):
  True







class AutomaticTester(unittest.TestCase):


  def test_green_light(self):
    """Tests if car can go with green light (regardless of voice command)"""
    self.assertTrue(canCarGo("green", "turn left"), "Green light should allow going forward")
    self.assertTrue(canCarGo("green", "let's have pizza for dinner"), "Green light should allow going forward")
    self.assertTrue(canCarGo("green", "any command"), "Green light should allow going forward")
    

  def test_flashing_light(self):
    """Tests if car can go with flashing light (regardless of voice command)"""
    self.assertTrue(canCarGo("flashing", "stop here"), "Flashing light should allow going forward")
    self.assertTrue(canCarGo("flashing", "let's have pizza for dinner"), "Flashing light should allow going forward")
    self.assertTrue(canCarGo("flashing", "any command"), "Flashing light should allow going forward")
    

  def test_yellow_light_right_turn(self):
    """Tests if car can go with yellow light and right turn command"""
    self.assertTrue(canCarGo("yellow", "go right"), "Yellow light with right turn command should allow going forward")
    self.assertTrue(canCarGo("yellow", "now go right"), "Yellow light with right turn command should allow going forward")
    self.assertTrue(canCarGo("yellow", "turn right"), "Yellow light with right turn command should allow going forward")
    self.assertTrue(canCarGo("yellow", "please take a right up here"), "Yellow light with right turn command should allow going forward")

  def test_yellow_light_other_command(self):
    """Tests if car stops with yellow light and no right turn command"""
    self.assertFalse(canCarGo("yellow", "go straight"), "Yellow light without right turn should stop the car")
    self.assertFalse(canCarGo("yellow", "left turn"), "Yellow light without right turn should stop the car")
    self.assertFalse(canCarGo("yellow", "abcdefghijklmnopqrstuvwxyz"), "Yellow light without right turn should stop the car")


  def test_red_light_right_turn(self):
    """Tests if car can go with red light and right turn command"""
    self.assertTrue(canCarGo("red", "turn right at the light"), "Red light with right turn command should allow going forward")
    self.assertTrue(canCarGo("red", "go right"), "Red light with right turn command should allow going forward")
    self.assertTrue(canCarGo("red", "now go right"), "Red light with right turn command should allow going forward")
    self.assertTrue(canCarGo("red", "please take a right up here"), "Red light with right turn command should allow going forward")

  def test_red_light_other_command(self):
    """Tests if car stops with red light and no right turn command"""
    self.assertFalse(canCarGo("red", "turn left at the light"), "Red light without right turn should stop the car")
    self.assertFalse(canCarGo("red", "volume up"), "Red light without right turn should stop the car")
    self.assertFalse(canCarGo("red", "abcdefghijklmnopqrstuvwxyz"), "Red light without right turn should stop the car")

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
