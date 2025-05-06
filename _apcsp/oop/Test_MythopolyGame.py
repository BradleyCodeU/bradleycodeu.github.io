import unittest
from unittest.mock import patch
import Mythopoly
from Player import Player
from Property import Property
from colorama import Back

# === Test Class ===
class AutomaticTester(unittest.TestCase):
    def test_player_initial_values(self):
        player = Player()
        self.assertIsNone(player.name, "Player name should be None by default")
        self.assertEqual(player.money, 1500, "Player should start with $1500")
        self.assertEqual(player.location, 0, "Player should start at location 0")
        self.assertEqual(player.assets, [], "Player should start with no assets")
        self.assertIn(player.color, [Back.RED, Back.GREEN, Back.YELLOW, Back.BLUE, Back.MAGENTA, Back.CYAN],
                      "Player color should be a valid background color")

    def test_player_str_representation(self):
        player = Player()
        player.name = "Zeus"
        expected = f"Name=Zeus, Money=1500, Assets=[]"
        self.assertEqual(str(player), expected, "__str__ output is incorrect")
    
    def test_property_initial_values(self):
        prop = Property()
        self.assertIsNone(prop.name, "Property name should be None by default")
        self.assertIsInstance(prop.price, int, "Property price should be an integer")
        self.assertEqual(prop.rent, int(prop.price * 0.05), "Rent should be 5% of price")
        self.assertEqual(prop.houses, 0, "Property should start with 0 houses")
        self.assertEqual(prop.hotels, 0, "Property should start with 0 hotels")
        self.assertIsNone(prop.owner, "Property owner should be None")

    def test_property_str_representation(self):
        prop = Property()
        prop.name = "Atlantis"
        expected = f"Name= Atlantis"
        self.assertTrue(str(prop).startswith(expected), "__str__ output should include property name")

    def test_rollTwoDice_range(self):
        for _ in range(100):
            result = Mythopoly.rollTwoDice()
            self.assertIn(result, range(2, 13), "Dice roll must be between 2 and 12")

    def test_validNumber(self):
        self.assertTrue(Mythopoly.validNumber("1"), "Should return True for '1'")
        self.assertTrue(Mythopoly.validNumber("100"), "Should return True for '100'")
        self.assertFalse(Mythopoly.validNumber("0"), "Should return False for '0'")
        self.assertFalse(Mythopoly.validNumber("-5"), "Should return False for negative numbers")
        self.assertFalse(Mythopoly.validNumber("abc"), "Should return False for non-numeric string")
        self.assertFalse(Mythopoly.validNumber("3.14"), "Should return False for floats")

    @patch("builtins.input", side_effect=["2", "Alice", "Bob"])
    def test_addPlayers_valid(self, mock_input):
        players = Mythopoly.addPlayers()
        self.assertEqual(len(players), 2, "Should return 2 players")
        self.assertIsInstance(players[0], Player)
        self.assertEqual(players[0].name, "Alice")
        self.assertEqual(players[1].name, "Bob")

    @patch("builtins.input", side_effect=["notanumber", "0", "3", "Zeus", "Hera", "Apollo"])
    def test_addPlayers_invalid_then_valid(self, mock_input):
        # Expect retries until a valid number is entered
        players = Mythopoly.addPlayers()
        self.assertEqual(len(players), 3)
        self.assertEqual(players[0].name, "Zeus")
        self.assertEqual(players[1].name, "Hera")
        self.assertEqual(players[2].name, "Apollo")

    @patch("time.sleep", return_value=None)
    def test_bankrupt(self, mock_sleep):
        removals = []
        player = Player()
        player.name = "Hermes"
        updated_removals = Mythopoly.bankrupt(player, removals)
        self.assertIn(player, updated_removals)
        self.assertEqual(len(updated_removals), 1)
        self.assertEqual(updated_removals[0].name, "Hermes")

    def test_checkForWinner(self):
        # Setup players and removals
        player1 = Player()
        player2 = Player()
        player3 = Player()
        all_players = [player1, player2, player3]

        # 2 bankrupt
        removals = [player1, player2]
        self.assertTrue(Mythopoly.checkForWinner(all_players, removals),
                        "Should return True when only 1 player remains")

        # only 1 bankrupt
        removals = [player1]
        self.assertFalse(Mythopoly.checkForWinner(all_players, removals),
                         "Should return False when more than 1 player remains")

        # no bankrupt
        removals = []
        self.assertFalse(Mythopoly.checkForWinner(all_players, removals),
                         "Should return False when all players are still in")

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