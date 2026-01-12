# replace ALL 17 blanks with the correct code
# blanks look like this: ???

# define a function named buyPhones
# this function looks at how much money you have
# and how much a used phone costs and tells you 
# how many used phones you can buy.
# requires two argument: myDollars, phonePrice
def buyPhones( ??? , ??? ):
    # convert myDollars to a float
    ???
    # convert phonePrice to a float
    ???
    # create a new variable amountOfPhones
    # myDollars divided by phonePrice equals amountOfPhones
    ???
    # convert amountOfPhones to an int
    ???
    return ???

# define a function named buyLemons
# this function looks at how much money you have
# and how much lemons cost and tells you 
# whether you can afford a certain number of lemons.
# requires three arguments: myMoney, numLemons, costPerLemon
??? ???(???, ???, ???):
    # convert myMoney to a float
    ???
    # convert numLemons to an int
    ???
    # convert costPerLemon to a float
    ???
    # create a new variable totalCost
    # total cost is number of lemons times cost per lemon
    ???
    # if the totalCost is too high, return -1
    if totalCost > myMoney:
        return -1
    else:
        # my money is my money minus the total cost
        ???
        # return my money
        ???

# do not edit the following code
amountOfPhones = buyPhones('399','399')
print("\nExpected :'399','399' -> 1 \nYour code:'399','399' -> " + str(amountOfPhones))
amountOfPhones = buyPhones(398.99,399)
print("\nExpected : 398.99,399 -> 0 \nYour code: 398.99,399 -> " + str(amountOfPhones))
amountOfPhones = buyPhones(600,199.99)
print("\nExpected : 600,199.99 -> 3 \nYour code: 600,199.99 -> " + str(amountOfPhones))
amountOfPhones = buyPhones(799,199.99)
print("\nExpected : 799,199.99 -> 3 \nYour code: 799,199.99 -> " + str(amountOfPhones))
myMoney = buyLemons(799.99,2,0.52)
print("\nExpected : 799.99,2,0.52 -> 798.95 \nYour code: 799.99,2,0.52 -> " + str(myMoney))
myMoney = buyLemons(0.10,2,0.52)
print("\nExpected : 0.10,2,0.52 -> -1 \nYour code: 0.10,2,0.52 -> " + str(myMoney))