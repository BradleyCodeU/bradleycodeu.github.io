from ObjectsFoobarV1 import *
import unittest



class AutomaticTester(unittest.TestCase):
    def test_makeRoom(self):
        x = makeRoom()
        self.assertTrue(type(x) is dict)
        self.assertTrue(len(x) >= 6)

    def test_doesRoomExist(self):
        roomArray1 = [{'name':'Kitchen'}, None, None]
        self.assertTrue(doesRoomExist(roomArray1, 0))
        self.assertFalse(doesRoomExist(roomArray1, 2))
        self.assertFalse(doesRoomExist(roomArray1, 9999))

    def test_doesItemExist(self):
        roomArray1 = [{'name':'Basement', 'item':'Key'}, None]
        roomArray2 = [{'name':'Basement', 'item':None}, None]
        self.assertTrue(doesItemExist(roomArray1, 0))
        self.assertFalse(doesItemExist(roomArray2, 0))

    def test_move_n(self):
        roomArray2 = [{'name':'Kitchen'}, {'name':'Hallway'}, None]
        self.assertEqual(move(roomArray=roomArray2, mylocation=1, direction="n"), 1)

    def test_move_s(self):
        roomArray2 = [{'name':'Kitchen'}, {'name':'Hallway'}, None]
        self.assertEqual(move(roomArray=roomArray2, mylocation=0, direction="s"), 0)

    def test_move_e(self):
        roomArray2 = [{'name':'Kitchen'}, {'name':'Hallway'}, None]
        self.assertEqual(move(roomArray=roomArray2, mylocation=0, direction="e"), 1)

    def test_move_w(self):
        roomArray2 = [{'name':'Kitchen'}, {'name':'Hallway'}, None]
        self.assertEqual(move(roomArray=roomArray2, mylocation=1, direction="w"), 0)



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