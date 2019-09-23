---
layout: project
category: py
title: Hogwarts House
---
Create a Tkinter app that:
- says "Bravery Score (1-10)"
- has a box for user input
- says "Teamwork Score (1-10)"
- has a box for user input
- has a submit button

Create a function called hogwartsHouse that requires two arguments: bravery and teamwork. It *returns* a string.
- Convert bravery from string to number
- Convert teamwork from string to number
- If bravery and teamwork are both above 5 then return "Gryffindor"
- If bravery is 5 or less and teamwork is above 5 then return "Hufflepuff"
- If bravery and teamwork are both 5 or less then return "Ravenclaw"
- If bravery is above 5 and teamwork is 5 or less then return "Slytherin"

| Slytherin  | High Bravery | Gryffindor |
| Low Teamwork | | High Teamwork |
| Ravenclaw | Low Bravery | Hufflepuff |

The starter code has an event listener function called buttonPressed. This function will:
- collect the user input for bravery
- collect the user input for teamwork
- verify that both user inputs are numbers 1-10
- If not correct, popup an error message *(do NOT use print() to display the error message)*
- call the hogwartsHouse function
- popup the quiz result *(do NOT use print() to display the result)*


-=-=-=-=-=-=-=-=-=-

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
- What is your spirit animal?
