---
layout: project
category: py
title: Fruit Salad
---

I kind of hate online recipes. They start off with a long rambling story... "It's the perfect side dish for a summer BBQ, or enjoy it as a healthy dessert." Then they talk about all the different alternative substitutions you could make... "It's also delightful served over vanilla ice cream for dessert, topped with a dollop of whipped cream." Where is the recipe?! Just give me the recipe!

For this assignment you will look-up a recipe for Fruit Salad. You will make a recipe calculator based on the recipe that you find online.

IMPORTANT:

- The recipe that you use MUST have at least 3 different ingredients
- If necessary, use Python's ceiling function to round up. I can't buy 0.25 whole bananas at the grocery store, so round up to the nearest whole number. A little extra banana will be fine.
- Display the final results and be sure to include the unit. For example, 5 ounces of banana, 5 cups of banana, or 5 whole bananas

```
def main():
    # cite your source
    print("The following recipe comes from https://example.com/fruitsalad/")

    # prompt the user
    print("How many people are you serving?")

    # collect user input
    servingSize = input()

    # turn str into int   
    servingSize = ???

    # banana
    banana = servingSize / 2 # just an example, use amounts in your recipe

    # if necessary, use Python's ceiling function to round up

    # apple
    apple = servingSize * 0.75 # just an example, use amounts in your recipe

    # display the final results and be sure to include the unit!!!
    # for example, 5 ounces of banana, 5 cups of banana, or 5 whole bananas
    print("You will need " + banana)
    print("You will need " + cherry)
```