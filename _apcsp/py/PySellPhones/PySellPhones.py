# Fill in ALL 12 blanks with the correct code.
# Blanks look like this: ???

# define a function called sellPhones
# this function calculates how much money you will make 
# by selling all of your phones, assuming each phone 
# sells for $399.
# requires one argument: myPhones
def sellPhones(myPhones):
    # Convert myPhones to an int & save it back in myPhones
    ???
    # Let's assume that 1 phone = 399 dollars
    # Create variable myMoney & set it to myPhones multiplied by 399
    ???
    # Return the variable myMoney
    return ???

# define a function named sellLemonade
# this function looks at the price per cup of lemonade
# and the number of customers to calculate how much money you earned.
# requires two arguments: pricePerCup, numCustomers
def sellLemonade(???, ???):
    # Convert pricePerCup to float (decimal number) & save back in pricePerCup
    ???
    # Convert numCustomers to int & save back in numCustomers
    ???
    # Assume that each customer buys 1 cup of lemonade
    # Create variable moneyEarned and calculate the money you earned
    ???
    # Return the money you earned
    return ???

# define a function named getLemonadeGallons
# this function calculates the maximum number of gallons of lemonade 
# that can be made based on the amount of sugar and lemons available.
# requires two arguments: bagsOfSugar, lemons
def getLemonadeGallons(bagsOfSugar, lemons):
    # Convert bags of sugar to a float to ensure we can handle fractional values.
    bagsOfSugar = float(bagsOfSugar)
    # Convert lemons to an integer to ensure we are working with whole numbers of lemons.
    lemons = int(lemons)
    # Calculate maximum gallons of lemonade that can be made based on amount of sugar.
    # 1 bag of sugar makes 2 gallons of lemonade, so divide total bags of sugar by 0.5.
    maxGallonsFromSugar = ???
    # Calculate maximum gallons of lemonade that can be made based on lemons.
    # 6 lemons are needed to make 1 gallon of lemonade, so divide total lemons by 6.
    maxGallonsFromLemons = ???
    # Use min() function to determine maximum gallons of lemonade we can make,
    # which is limited by smaller of two resources: sugar or lemons.
    maxGallons = ???
    # Convert maximum gallons to an integer to ensure we only count whole gallons.
    # This cuts off any fractional part and gives us largest whole gallons we can make.
    maxGallons = int(maxGallons)
    # Return maximum gallons of lemonade that can be made with given resources.
    return maxGallons



# do not edit the following code
myMoney = sellPhones('1')
print("Expected :'1'→ 399 \nYour code:'1'→ " + str(myMoney))
myMoney = sellPhones(0)
print("Expected : 0 → 0   \nYour code: 0 → " + str(myMoney))
myMoney = sellPhones(2)
print("Expected : 2 → 798 \nYour code: 2 → " + str(myMoney))
myMoney = sellPhones(2.5)
print("Expected :2.5→ 798 \nYour code:2.5→ " + str(myMoney))
moneyEarned = sellLemonade(2.5, 2)
print("Expected : 2.5, 2 → 5.0 \nYour code: 2.5, 2 → " + str(moneyEarned))
moneyEarned = sellLemonade(1.5, 3)
print("Expected : 1.5, 3 → 4.5 \nYour code: 1.5, 3 → " + str(moneyEarned))