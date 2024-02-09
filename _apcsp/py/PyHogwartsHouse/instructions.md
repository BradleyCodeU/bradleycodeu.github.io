# Hogwarts House

Read these tutorials:
- [Python Conditionals](https://www.w3schools.com/python/python_conditions.asp)
- [How to use AND Operator in Python IF?](https://pythonexamples.org/python-if-and/)

In this project, you will create an app that:
- prompts the user for "Bravery Score (1-10)"
- collects user input
- prompts the user for "Teamwork Score (1-10)"
- collects user input
- tells the user their Hogwarts House

Directions:

Create a function called validateNumber, that requires one argument: userInput. It *returns* True or False if userInput is 1-10.
- Convert userInput from string to float
- If userInput is less than 1 return False
- If userInput is greater than 10 return False
- If userInput is between 1 & 10 (inclusive) then return True

Create a function called getHouse that requires two arguments: bravery & teamwork. It *returns* a string.
- Convert bravery from string to float
- Convert teamwork from string to float
- If bravery & teamwork are both above 5 then return "Gryffindor"
- If bravery is 5 or less & teamwork is above 5 then return "Hufflepuff"
- If bravery & teamwork are both 5 or less then return "Ravenclaw"
- If bravery is above 5 & teamwork is 5 or less then return "Slytherin"

| Slytherin  | High Bravery | Gryffindor |
| Low Teamwork | | High Teamwork |
| Ravenclaw | Low Bravery | Hufflepuff |

```
   Slytherin │ High Bravery │ Gryffindor
─────────────┼──────────────┼──────────────
Low Teamwork │              │ High Teamwork
─────────────┼──────────────┼──────────────
   Ravenclaw │ Low Bravery  │ Hufflepuff
```

The starter code already has a function called main. This function will:
- collect the user input for bravery
- collect the user input for teamwork
- validate that both user inputs are numbers 1-10
- If either is invalid, print an error message
- If both are valid numbers, call the getHouse function & print the result

-------
STARTER CODE:
```python

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
  if bravery > 5 & ???:
    return ???
  # If bravery is 5 or less & teamwork is above 5 return "Hufflepuff"
  if bravery <= 5 & ???:
    return ???
  # If bravery & teamwork are both 5 or less then return "Ravenclaw"
  if bravery <= 5 & ???:
    return ???
  # If bravery is above 5 & teamwork is 5 or less return "Slytherin"
  if bravery > 5 & ???:
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
main()
```
-------

GOLD MEDAL CHALLENGE:

Create your own quiz with four (or more) possible outcomes. The result must NOT be random. For example:
- Which My Little Pony are you?
- Which superhero are you?
- Which meme/advice animal are you?
- Which Spongebob character are you?
- Which emoji are you?
- Which princess are you?
- Which season are you?
- Which planet are you?
- Which sport are you?
- Which Starbucks drink are you?
- Which app are you?
- Which sandwich are you?
- Which phone are you?
- Which Pokemon are you?
- Which dog breed are you?
  