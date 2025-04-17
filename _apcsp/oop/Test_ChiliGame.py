import unittest
import random
# === Include or import your game functions here ===
# For example... from your_game_file import *
from ChiliGame import *


# === Test Class ===
class TestChiliGame(unittest.TestCase):
    def test_validInteger(self):
        self.assertTrue(validInteger(0))
        self.assertTrue(validInteger("5"))
        self.assertFalse(validInteger("two"))
        self.assertFalse(validInteger(-1))
        self.assertFalse(validInteger(6))
        self.assertFalse(validInteger(99))

    def test_bananaPepper_range(self):
        for _ in range(100):
            self.assertTrue(0 <= getBananaPepper() <= 500)

    def test_poblanoPepper_range(self):
        for _ in range(100):
            self.assertTrue(1000 <= getPoblanoPepper() <= 2000)

    def test_jalapenoPepper_range(self):
        for _ in range(100):
            self.assertTrue(2500 <= getJalapenoPepper() <= 8000)

    def test_calculateChiliScore(self):
        self.assertEqual(calculateChiliScore({'numBanana': 0, 'numPoblano': 0, 'numJalapeno': 0}), 0)
        for _ in range(100):
            score = calculateChiliScore({'numBanana': 1, 'numPoblano': 1, 'numJalapeno': 1})
            self.assertTrue(3500 <= score <= 10500)
        for _ in range(100):
            score = calculateChiliScore({'numBanana': 10, 'numPoblano': 10, 'numJalapeno': 10})
            self.assertTrue(35000 <= score <= 105000)

    def test_getChefGrade_ranges(self):
        for _ in range(100):
            grade = getChefGrade(7000, 5000)
            self.assertTrue(70.704 <= grade <= 71.725)

            grade = getChefGrade(7000, 8000)
            self.assertTrue(42.74 <= grade <= 43.76)

            grade = getChefGrade(14000, 14000)
            self.assertTrue(99.0 <= grade <= 100.0)

            grade = getChefGrade(14000, 14001)
            self.assertTrue(48.986 <= grade <= 50.999)

    def test_getRoundResults(self):
        result1 = getRoundResults([{'name': 'Alex', 'chefGrade': 99.9, 'heatGoal': 7000},
                                  {'name': 'Steve', 'chefGrade': 88.8, 'heatGoal': 7000}])
        self.assertEqual(result1, "Alex Wins This Round!")

        result2 = getRoundResults([{'name': 'Alex', 'chefGrade': 0.111, 'heatGoal': 7000},
                                  {'name': 'Steve', 'chefGrade': 0.999, 'heatGoal': 7000}])
        self.assertEqual(result2, "Steve Wins This Round!")

if __name__ == '__main__':
    unittest.main()
