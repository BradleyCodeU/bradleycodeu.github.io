
# Fill in ALL 15 blanks with the correct code.
# Blanks look like this: ???

# Create a function called validateNumber, that requires one
# argument: userInput. It *returns* True or False if userInput is 1-10.
def validateNumber(userInput):
  # Convert userInput from string to float
  userInput = float(userInput)
  # If userInput is less than 1 return False
  if ???:
    return ???
  # If userInput is greater than 10 return False
  if ???:
    return ???
  # If userInput between 1 & 10 (inclusive) then return True
  if ???:
    return ???


# Create a function called getHouse that requires two
# arguments: bravery & teamwork. It *returns* a string.
def getHouse(bravery, teamwork):
  # Convert bravery from string to float
  bravery = float(bravery)
  # Convert teamwork from string to float
  ???
  # If bravery & teamwork are both above 5 then return "Gryffindor"
  if bravery > 5 also? teamwork? ???:
    return ???
  # If bravery is 5 or less & teamwork is above 5 return "Hufflepuff"
  if bravery <= 5 and? ???:
    return ???
  # If bravery & teamwork are both 5 or less then return "Ravenclaw"
  if bravery <= 5 &? ???:
    return ???
  # If bravery is above 5 & teamwork is 5 or less return "Slytherin"
  if bravery > 5 also? ???:
    return ???


def main():
  print("Bravery Score (1-10): ")
  braveryStr = input()
  print("Teamwork Score (1-10): ")
  teamworkStr = input()
  if validateNumber(braveryStr) == False:
    print("Invalid Bravery")
  if validateNumber(teamworkStr) == False:
    print("Invalid Teamwork")
  if validateNumber(braveryStr) == True & validateNumber(teamworkStr) == True:
    result = getHouse(braveryStr, teamworkStr)
    print(result)

# main()