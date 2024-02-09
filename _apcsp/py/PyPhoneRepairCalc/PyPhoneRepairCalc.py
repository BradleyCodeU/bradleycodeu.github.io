# Fill in ALL 10 blanks with the correct code.
# Blanks look like this: ???
# You will also WRITE TESTS starting on line 62

# the sellPhones function tells you how much money you can earn
# requires two arguments: myPhones, salePrice
def sellPhones(myPhones, salePrice):
  #convert myPhones to an int
  myPhones = int(myPhones)
  #convert salePrice to a float
  ???
  #myPhones multiplied by salePrice equals myMoney
  ???
  #if myMoney is less than 0
  if ???:
      #then myMoney equals 0
      myMoney = 0
  return myMoney


# the buyPhones function tells you how many phones you can afford to buy
# requires two arguments: myDollars, phonePrice
def buyPhones(myDollars, phonePrice):
  #convert myDollars to a float
  myDollars = float(myDollars)
  #convert phonePrice to a float
  ???
  #create new variable amountOfPhones, set it to 0
  amountOfPhones = 0
  #if phonePrice is greater than 0
  if ???:
      #then myDollars divided by phonePrice equals amountOfPhones
      amountOfPhones = myDollars / phonePrice
  #if amountOfPhones is less than 0
  if ???:
      #then amountOfPhones equals 0
      amountOfPhones = 0
  #convert amountOfPhones to an int
  ???
  return amountOfPhones


# this function calculates and returns the profit
# requires 4 arguments: investMoney, usedPrice, repairPrice, salePrice
def calculateProfit(investMoney, usedPrice, repairPrice, salePrice):
  #create a new variable named cost.
  #usedPrice plus repairPrice equals cost
  ???
  #find out how many phones you can buy
  numberPhones = buyPhones(investMoney, cost)
  #create a new variable named moneySpent.
  #usedPrice*numberPhones plus repairPrice*numberPhones equals moneySpent
  ???
  #find out how much money you earned
  moneyEarned = sellPhones(numberPhones, salePrice)
  #create a new variable named profit.
  #profit is moneyEarned minus moneySpent
  ???
  return profit


# Write test #2 for each function
print("Tests for sellPhones")
print("Test 1")
print("Selling 2 phones, price 5 -> expected 10")
print("Actual")
actual = sellPhones(2,5)
print(actual)
print("Test 2")
# you write test #2 here

print("Tests for buyPhones")
print("Test 1")
print("Buying with 101 dollars, price 50 -> expected 2")
print("Actual")
actual = buyPhones(101,50)
print(actual)
print("Test 2")
# you write test #2 here

print("Tests for calculateProfit")
print("Test 1")
print("Invest 101 dollars, used price 40, repair price 10, sale price 250 -> expected 400 (500 - 80 spent on used phones & - 20 spent on repair kits)")
print("Actual")
actual = calculateProfit(101,40,10,250)
print(actual)
print("Test 2")
# you write test #2 here


# ------------------------------------
# YOU ARE DONE!
# do NOT edit the following code!
def main():
  print("\n$-$-$-$-$-$-$-$-$-$-$-$\nPhone Repair Calculator\n$-$-$-$-$-$-$-$-$-$-$-$\n")
  print("How much $ can you invest: ")
  investMoney = float(input())
  print("Cracked-screen phone price: ")
  usedPrice = float(input())
  print("Repair kit price: ")
  repairPrice = float(input())
  print("Sale price for fixed phone: ")
  salePrice = float(input())
  profit = calculateProfit(investMoney, usedPrice, repairPrice, salePrice)
  print("-----Re$ult-----\nYou earned $"+str(round(profit,2))+" in profit")
#main()