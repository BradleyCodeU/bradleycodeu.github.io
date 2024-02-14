# Console Strings and Screams
---
Concepts: concatenation, len(), string indexing, string slice

Read this article about [how to slice a string in Python](https://www.w3schools.com/python/python_strings_slicing.asp)

Define a function named getLength which take a name as an argument. Returns the length of the name

Define a function named firstLetter which takes a name as an argument. Returns the first letter of the name

Define a function named lastLetter which takes a name as an argument. Returns the last letter of the name

Define a function named printDetails which takes a name as an argument. Use the getLength, firstLetter and lastLetter functions to print the length, first letter and last letter. Return the name.

Define a function named getNickname with lastname as an argument. Create a variable named nickname and set it to the first 2 letters of lastname plus the first 2 letters of lastname. Print nickname (For example, Your nickname is JoJo). Return nickname. NOTE: Read this article about [how to slice a string in Python](https://www.w3schools.com/python/python_strings_slicing.asp).

Define a function named scream with 2 arguments: firstname and lastname. Create a variable named myScream that contains empty string. Make a loop that repeats for the length of the first name + the length of the second name, concatenating an "A" to myScream each repetition. After the loop, concatenate an "!" to myScream. Print myScream. Return myScream. 

Inside of the main function...

Write a code to prompt the user to enter their first name. Your program will respond with a welcome message for the user (Hello Steve!) and then call the printDetails function with the user's first name as an argument which will print some information about the user's first name (length, starts with, ends with).

Next, prompt the user to enter their last name. Call the printDetails function with the user's last name as an argument which will print some information about the user's last name (length, starts with, ends with).

Print the full name (Your full name is Steve Jobs).

Call the getNickname function with the user's LAST name as an argument which will print it (Your nickname is JoJo)

Finally, scream! Call the scream function which will print a scream the length of the first name plus length of the last name

Sample Output 1 (notice the length of the scream at the end):
```
Enter your first name: Steve
Hello Steve!
Length is
5
Starts with
S
Ends with
e
Enter your last name: Jobs
Length is
4
Starts with
J
Ends with
s
Your full name is Steve Jobs
Your nickname is JoJo
AAAAAAAAA!
```
Sample Output 2  (notice the length of the scream at the end):
```
Enter your first name: Bradley
Hello Bradley!
Length is
7
Starts with
B
Ends with
y
Enter your last name: Highschool
Length is
10
Starts with
H
Ends with
l
Your full name is Bradley Highschool
Your nickname is HiHi
AAAAAAAAAAAAAAAAA!
```

## Starter Template
```
# define a function named getLength which take a name as an argument. Returns the length of the name

# define a function named firstLetter which takes a name as an argument. Returns the first letter of the name

# define a function named lastLetter which takes a name as an argument. Returns the last letter of the name

# define a function named printDetails which takes a name as an argument. Use the getLength, firstLetter and lastLetter functions to print the length, first letter and last letter. Return the name.

# define a function named getNickname with lastname as an argument. Create a variable named nickname and set it to the first 2 letters of lastname plus the first 2 letters of lastname. Print nickname (For example, Your nickname is JoJo). Return nickname.

# define a function named scream with 2 arguments: firstname and lastname. Create a variable named myScream that contains empty string. Make a loop that repeats for the length of the first name + the length of the second name, concatenating an "A" to myScream each repetition. After the loop, concatenate an "!" to myScream. Print myScream. Return myScream. 

def main():
    print("Enter your first name:")
    # Collect input
    # Respond with a welcome message for the user. For example, Hello Steve!
    
    # Call the printDetails function with the user's first name as an argument.
    
    print("Enter your last name:")
    # Collect input
    
    # Call the printDetails function with the user's last name as an argument.
    
    # Print the full name (For example, Your full name is Steve Jobs).
    
    # Call the getNickname function with the user's LAST name as an argument.
    
    # Finally, scream! Call the scream function which will print a scream the length of the first name plus length of the last name
```