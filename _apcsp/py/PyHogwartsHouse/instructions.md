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

PART ONE Directions:

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

| Slytherin    | High Bravery | Gryffindor    |
| Low Teamwork |              | High Teamwork |
| Ravenclaw    | Low Bravery  | Hufflepuff    |

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

--------------------

PART TWO DIRECTIONS:

Copy/paste your PyHogwartsHouse code into a new file. Create your own personality quiz with FIVE (or more) possible outcomes. The result must NOT be random. For example:
- Which My Little Pony are you?
- Which superhero are you?
- Which meme/advice animal are you?
- Which Spongebob character are you?
- Which emoji are you?
- Which princess are you?
- Which sport are you?
- Which Starbucks drink are you?
- Which Rick and Morty are you?
- Which season are you?
- Which planet are you?
- Which app are you?
- Which sandwich are you?
- Which phone are you?
- Which Pokemon are you?
- Which dog breed are you?
  
