---
layout: project
category: textgames
title: Caesar Cipher
permalink: /apcsp/textgames/caesarCipher/
---

Caesar Cipher (or Caesar Shift) is one of the simplest encryption techniques. It is a type of substitution in which each letter is replaced by a letter a set number away. For example, with a left shift of 3, D -> A, E -> B, and so on. Decrypt by shifting the same number in the opposite direction. The method is named after Julius Caesar.

![Caesar shift example](/apcsp/textgames/Caesar_cipher_left_shift_of_3.png)

Here is the encryption algorithm you will use:
```
def caesarEncrypt(myString,shiftNum):
  result = ""
  # loop thru the string saving each letter in the var each
  for each in myString:
  # # use ord(each) convert each letter to number, save in var

  # # shift the letter number by adding shiftNum, save in var

  # # use chr() to convert the number back to character, save in var

  # # use str() to convert the character to string, add to result
      result = result + str(  )
  return result
```

Define a caesarDecrypt function based on the above encryption algorithm. It requires 2 arguments: myString, myNumber. It returns a string that has been shifted -myNumber places.

Define a function named randomSecretCodeWords that requires 3 arguments: list1, list2, list3. Concatenate the arrays just like you would concatenate strings: combinedList = list1 + list2 + list3. Use the [random choice function](https://www.w3schools.com/python/ref_random_choice.asp) to randomly select one word from the combined list. Concatenate THREE random words and return the result. For example, testing this function out five times could give the following result...
```
"redlimeMiami"
"graybananabanana"
"NYCDaytonpeach"
"yellowLAgray"
"neonParisblack"
```

Define a function named validInt that requires 1 argument: userInput. Try to convert userInput to an int. If it works, return True. If there is an exception, return False.

Define a function named addScore that requires 3 arguments: name, score, and a highScores array. Creates a dictionary object with keys for 'name' and 'score' and then appends that dictionary to the highScores array. Returns the highScores array.

Define a function named showHighScores that requires 1 argument: a highScores array. Loops through the array and prints each name and score. Returns nothing.

Here is the pseudocode for the main function:
```
# notice that highScores is outside of the main function
highScores = [{'name':'JR','score':50},{'name':'Bradley','score':15}]

def main():
  # create a variable for score and set it to 0
  # create a variable for name, ask the user to type their name
  # create three arrays with 10 words in each array
  # call randomSecretCodeWords and save what is returned in secretString
  # generate a random int between 1 and 20 and save it in secretNumber
  # call caesarEncrypt with arguments secretString and secretNumber
  # then save what it returns in a variable named gibberish
  # output The gibberish message is: and concatenate the gibberish variable
  # create a forever loop
  # # output Shift by how much? Type 1-20
  # # collect the user input
  # # if the user input is valid
  # # # convert the user input to an int
  # # # call caesarDecrypt with arguments gibberish and user input
  # # # then save what it returns in a variable named newText
  # # # output the new decrypted text
  # # # if the userInput is the secretNumber
  # # # # say You Win!
  # # # # say Your Score Is __
  # # # # use addScore put user's name and score in highScore list
  # # # # show high scores
  # # # # ask Do You Wanna Play Again? y or n?
  # # # # if y, call the main() function again
  # # # # else, break
```
