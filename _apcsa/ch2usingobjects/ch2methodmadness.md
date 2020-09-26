---
layout: project
category: ch2usingobjects
title: Ch2 Method Madness
---
Combine these 3 parts to create one big Method Madness program.

##Part 1:

Use Math.min() and Math.max() to create the following. This is a sample transcript of what your program should do. The numbers 15 and 25 are user input and should not be put on the screen by your program.
<pre>
Enter your first number: 15
Enter your second number: 25
25 is larger than 15
</pre>
A second run of the code might give this output:
<pre>
Enter your first number: 6
Enter your second number: 4
6 is larger than 4
</pre>
##Part 2:

Your program will determine the correct [lexicographic ordering](https://en.wikipedia.org/wiki/Lexicographic_order) of those strings. For this exercise you will need to use the compareTo() String method. Look up the compareTo method in the API docs. This is a sample transcript of what your program should do. The words "apple" and "bananas" are user input and should not be put on the screen by your program.
<pre>
Enter the first string: apple
Enter the second string: bananas
apple comes before bananas lexicographically
</pre>
A second run of this code might produce the following output:
<pre>
Enter the first string: bananas
Enter the second string: apple
apple comes before bananas lexicographically
</pre>
##Part 3:

Your program will use the two numbers from Part 1 and then ask a series of math questions. Each question will be evaluated as to whether it is the right or wrong answer. In the end a final score should be reported for the user. This is a sample transcript of what your program should do. User input always comes after a colon : and should not be put on the screen by your program.
<pre>
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
</pre>

Your code will behave differently based on the numbers from Part 1 and the answers provided by the user. Here is a second possible execution of this code:
<pre>
Enter your name: Bob
Welcome Bob! Please answer the following questions...
5 + 3: 0
Wrong!
The correct answer is 6
5 * 3: 6
Wrong!
The correct answer is 15
5 / 3: 0
Wrong!
The correct answer is 1
5 % 3: 1
Wrong!
The correct answer is 2
You got 0 correct answers
That's 0.0%!
</pre>

##Expected Output

Here is an example of the expected output that shows all 3 parts together...
<pre>
Enter your first number: 3
Enter your second number: 7
7 is larger than 3
Enter the first string: coconut
Enter the second string: dragonfruit
coconut comes before dragonfruit lexicographically
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
</pre>
