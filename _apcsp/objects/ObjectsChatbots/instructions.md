# Chatbots

Read this w3schools tutorial about [Python dictionaries](https://www.w3schools.com/python/python_dictionaries.asp). Notice that dictionary items are presented in key/value pairs. Here is also a [realpython.com tutorial](https://realpython.com/python-dicts/)

For this assignment you will create two or more chatbots that respond to keywords. Each chatbot will be a separate dictionary. Each keyword is a key in the dictionary. Each value is the chatbot's response to the keyword.

For example, you might add the keyword "game" by creating the follow key/value pair:
```
'game':'My favorite game is Foobar The Bazbarian.',
```

The starter template has been provided. Type `talkTo(dan)` in the console to see the demo.


REQUIREMENTS:
  - Create 2 dictionary-based chatbots (if you are working with a partner then create 4 chatbots). 
      - Each chatbot must have 8 key/value pairs. 
      - Each chatbot must have 8 *unique* responses. 
      - Each chatbot must have a "name" key with their name as the value.
  - Create a validNumber() function that take one argument: userString. It will return true if the userString is an integer number that is greater than zero. Otherwise false. Use try-except so that it doesn't crash.
  - Create a getChatbotList() function that takes no arguments. It just returns a list that contains all of your chatbots. Do not include the demo chatbot `dan` in the list.
  - Create a main() function that will...
    - Ask the player who they want to chat with. For example, "Who would you like to chat with? 1 = amandaBot, 2 = Thomas Edison, 3 = Pac-Man, 4 = Pirate Ghost"
    - Collect the player input and check if it is a valid integer.
    - Based on the player input, call the talkTo() function and pass the variable name of the dictionary as an argument. For example, talkTo(amandaBot) or maybe talkTo(myArray[userinput])