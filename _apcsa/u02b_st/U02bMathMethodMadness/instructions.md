---
layout: project
category: u02b-strings
title: U02b Math Method Madness
---
Math Method Madness


Combine these 3 parts to create one big Method Madness program.

## Part 1:
Create a public static method named whichIsLarger that takes two int arguments and returns a String. Use Math.min() and Math.max() to create the following. This is a sample transcript of what your program should do. The numbers 15 and 25 are user input and should not be put on the screen by your program.
```
whichIsLarger(15, 25) --> "25 is larger than 15"
whichIsLarger(6, 4) --> "6 is larger than 4"
```

## Part 2:
Create a public static method named funFacts that takes two int aguments and returns a String. You will use Math.abs(), Math.pow(), Math.sqrt(), and Math.random().
Use \n to insert line breaks between each sentence.
See the example inputs and outputs below.
```
funFacts(3,4) --> "Absolute value of 3 is 3.\n3 to the power of 4 is 81.0.\nSquare root of 3 is 1.7320508075688772.\nRandom number between -3 and 4 is 3.7556221204278137"
funFacts(-3,4) --> "Absolute value of -3 is 3.\n-3 to the power of 4 is -81.0.\nSquare root of -3 is NaN.\nRandom number between -3 and 4 is -0.14515833567916303"
funFacts(9,5) --> "Absolute value of 9 is 9.\n9 to the power of 5 is 59049.0.\nSquare root of 9 is 3.0.\nRandom number between 9 and 5 is 8.102658047778291"
funFacts(-9,-5) --> "Absolute value of -9 is 9.\n-9 to the power of -5 is -1.6935087808430286E-5.\nSquare root of -9 is NaN.\nRandom number between -9 and -5 is -7.81863598457924"
```

## Part 3:
Create a public static method named textOrder that takes two String arguments and returns a String. This method will determine the correct [lexicographic ordering](https://en.wikipedia.org/wiki/Lexicographic_order) of those strings. For this exercise you will need to use the compareTo() String method. 
You will need to use a conditional with an if and an else. [Read this tutorial](https://www.w3schools.com/java/java_conditions_else.asp)
Look up the compareTo method in the API docs. This is a sample transcript of what your program should do. The words "apple" and "bananas" are user input and should not be put on the screen by your program.
```
textOrder("apple", "banana") --> "apple comes before banana lexicographically"
textOrder("dragonfruit", "coconut") --> "coconut comes before dragonfruit lexicographically"
```

## Part 4:
Next, your program will use the two numbers from Part 1 and then ask a series of math questions. 
Each question will be evaluated as to whether it is the right or wrong answer. 
You will need to use a conditional with an if and an else. [Read this tutorial](https://www.w3schools.com/java/java_conditions_else.asp)
In the end a final score should be reported for the user. This is a sample transcript of what your program should do. User input always comes after a colon : and should not be put on the screen by your program.
```
Part 4-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
Enter your name: Jeremy
Welcome Jeremy! Please answer the following questions...
6 + 4: 1
Wrong!
The correct answer is 10
6 * 4: 24
Correct!
6 / 4: 1
Correct!
6 % 4: 2
Correct!
You got 3 correct answers
That's 75.0%!
```

Your code will behave differently based on the numbers from Part 1 and the answers provided by the user. Here is a second possible execution of this code:
```
Part 4-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
Enter your name: Bob
Welcome Bob! Please answer the following questions...
15 + 25: 1
Wrong!
The correct answer is 40
15 * 25: 2
Wrong!
The correct answer is 375
15 / 25: 3
Wrong!
The correct answer is 0
15 % 25: 4
Wrong!
The correct answer is 15
You got 0 correct answers
That's 0.0%!
```

## Expected Output

Here is an example of the expected output that shows all 3 parts together...
```
Part 1-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
Enter your first number: 3
Enter your second number: 7
7 is larger than 3
Part 2-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
Fun Facts!
Absolute value of 3 is 3. 
3 to the power of 7 is 2187.0. 
Square root of 3 is 1.7320508075688772. 
Random number between 3 and 7 is 6.403731591667578
Part 3-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
Gimme a word: coconut
Gimme another word: dragonfruit
coconut comes before dragonfruit lexicographically
Part 4-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
Enter your name: Amy
Welcome Amy! Please answer the following questions...
3 + 7: 10
Correct!
3 * 7: 22
Wrong!
The correct answer is 21
3 / 7: 2
Wrong!
The correct answer is 0
3 % 7: 0
Wrong!
The correct answer is 3
You got 1 correct answers
That's 25.0%!
```

