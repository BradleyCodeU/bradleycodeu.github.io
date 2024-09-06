# Fill in ALL 9 blanks with the correct code.
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