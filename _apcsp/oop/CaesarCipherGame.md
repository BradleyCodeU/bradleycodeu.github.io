---
layout: project
category: oop
title: Caesar Cipher Game
---




Caesar Cipher (or Caesar Shift) is one of the simplest encryption techniques. It is a type of substitution in which each letter is replaced by a letter a set number away. For example, with a left shift of 3, D -> A, E -> B, and so on. Decrypt by shifting the same number in the opposite direction. The method is named after Julius Caesar.

![Caesar shift example](/apcsp\oop\Caesar_cipher_left_shift_of_3.png)

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

Define a function named randomSecretCode that requires 3 arguments: list1, list2, list3. Concatenate the arrays just like you would concatenate strings: combinedList = list1 + list2 + list3. Use the [random choice function](https://www.w3schools.com/python/ref_random_choice.asp) to randomly select one word from the combined list. Concatenate THREE random words and return the result. For example, testing this function out five times could give the following result...
```
"redlimeMiami"
"graybananabanana"
"NYCDaytonpeach"
"yellowLAgray"
"neonParisblack"
```

Define a function named validInt that requires 1 argument: userInput. Try to convert userInput to an int. If it works, return True. If there is an exception, return False.

# Define a function named addScore that requires 3 arguments: name, score, and a highScores array. Creates a new dictionary object with keys for 'name' and 'score' and then appends a the new dictionary to the highScores array. Returns the highScores array.

Define a function named showHighScores that requires 1 argument: a highScores array. Loops through the array and prints each name and score. Returns nothing.

Here is the pseudocode for the main function:
```
# notice that highScores is outside of the main function
highScores = [{'name':'JR','score':9},{'name':'Bradley','score':8}]

def main():
  # create a variable for score and set it to 0
  # create a variable for name, ask the user to type their name
  # create three arrays with 10 words in each array
  # call randomSecretCode and save what is returned in secretString
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

## TESTS

|Test|Expected Output|
|---|---|
|caesarEncrypt("apple",1)|bqqmf|
|caesarEncrypt("Banana",2)|Dcpcpc|
|caesarDecrypt("hthtszy",5)|coconut|
|caesarDecrypt("^iphe",4)|Zelda|
|randomSecretCode(['a'],['a'],['a'])|aaa|
|randomSecretCode(['b'],['b'],['b'])|bbb|
|validInt(13)|True|
|validInt("one")|False|
|list=[]<br>addScore("Ann",3,list)|[{'name':'Ann','score':3}]|
|list=[{'name':'Ann','score':3}]<br>addScore("Bob",4,list)|[{'name':'Ann','score':3},{'name':'Bob','score':4}]|


## STARTER TEMPLATE
```




def caesarEncrypt(myString,shiftNum):
  result = ""
  # loop thru the string saving each letter in the var each
  for each in myString:
    # # use ord(each) convert each letter to number, save in var

    # # shift the letter number by adding shiftNum, save in var

    # # use chr() to convert the number back to character, save in var

    # # use str() to convert the character to string, add to result
    result = result + str( ??? )
  return result


# Define a caesarDecrypt function based on the above encryption algorithm. It requires 2 arguments: myString, myNumber. It returns a string that has been shifted -myNumber places.


# Define a function named randomSecretCode that requires 3 arguments: list1, list2, list3. Concatenate the arrays just like you would concatenate strings: combinedList = list1 + list2 + list3. Use the random choice function to randomly select one word from the combined list. Concatenate THREE random words and return the result. For example, testing this function out five times could give the following result...
# "redlimeMiami"
# "graybananabanana"
# "NYCDaytonpeach"
# "yellowLAgray"
# "neonParisblack"


# Define a function named validInt that requires 1 argument: userInput. Try to convert userInput to an int. If it works, return True. If there is an exception, return False.


# Define a function named addScore that requires 3 arguments: name, score, and a highScores array. Creates a new dictionary object with keys for 'name' and 'score' and then appends a the new dictionary to the highScores array. Returns the highScores array.


# Define a function named showHighScores that requires 1 argument: a highScores array. Print --HIGH SCORES--. Loop through the array and print each name and a space and their score. Returns nothing.
# --HIGH SCORES--
# JR 9
# Bradley 8



# Main

# notice that highScores is outside of the main function
highScores = [{'name':'JR','score':9},{'name':'Bradley','score':8}]

# def main():
  # create a variable for score and set it to 0
  # create a variable for name, ask the user to type their name
  # create three arrays with 10 words in each array
  # call randomSecretCode(list1,list2,list3) and save what returns in secretString
  # generate a random int between 1 and 20 and save it in secretNumber
  # call caesarEncrypt with arguments secretString and secretNumber, save what returns in a variable named gibberish
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


tests:
```

listA=[]
listB=[{'name':'Ann','score':3}]
self.assertEqual(addScore("Ann",3,listA)[0],listB[0])
list2=[{'name':'Ann','score':3}]
list3=addScore("Bob",4,list2)
list2=[{'name':'Ann','score':3},{'name':'Bob','score':4}]
self.assertEqual(list2[0], list3[0])
self.assertEqual(list2[1], list3[1])


self.assertEqual(validInt(13),	True)
self.assertEqual(validInt("one"),	False)


self.assertEqual(randomSecretCode(['a'],['a'],['a']),"aaa")
self.assertEqual(randomSecretCode(['b'],['b'],['b']),"bbb")


self.assertEqual(caesarDecrypt("hthtszy",5),"coconut")
self.assertEqual(caesarDecrypt("^iphe",4),"Zelda")


self.assertEqual(caesarEncrypt("apple",1), "bqqmf")
self.assertEqual(caesarEncrypt("Banana",2), "Dcpcpc")

```
