---
layout: project
category: ch1-introduction
title: Unit 1 Test Review
---
Testing123
<pre>
AP CS A
Unit 1 Test Topic List

Literal values:  
“R” – String literal
‘R’ – character literal (char)
4.0 – double literal
3 – int literal

Number literals cannot contain: $, commas, %

Assignment statements (types on left and right must be compatible):
	int1 = int1 + 4.2;  	//invalid because an int + double is a double
	int1 = 6.0/3;   		//invalid because a double/int is a double
	double1 = int1;  	//valid because all ints can be stored as doubles
	String1 = char1;  	//Invalid because a String variable cannot be assigned a character

Evaluating expressions/order of operations:
+, -, *, /, %
int/int will result in an int (answer will be truncated)
int/double or double/int will result in a double answer
% is the remainder (mod) operator.

Type casting
 	To force floating-point division:    (double)9/2 or 9/(double)2

	The following is an example of downcasting (from a “larger” type to a “smaller” type)
		To convert a double to an int: (int)35.7   would result in a value of 35

Integer overflow
	Give a range of ints calculate the result.   Example: if the range is  [-16, 15], what is 13 + 4?

Floating-point overflow – result is Infinity or -Infinity

Truncating –    5/4 = 1  (1.25 is truncated) or (int)45.75 = 45

Underflow – value too close to zero for the data type to represent, so the result is 0.0

Error types:
Syntax/compile-time error (typo) – Examples include: missing ;, missing parenthesis, misspelled variable
Logic/run-time error – compiles successfully, but output is incorrect or a run-time exception is thrown

String concatenation
System.out.println(“Hello “ + name);
System.out.println(“The result is “ + 2 + 9);  // 29 – yikes!
System.out.println(“The result is “ + 2 - 9);  // ”The result is 2 ” – 9  Syntax/compile-time
System.out.println(“The result is “ + 2 * 9);  // works as expected

Maximum and minimum int values:  Integer.MAX_VALUE and Integer.MIN_VALUE.  These are constants provided in the Integer class.  They are listed on the Java Quick Reference.



Special note: If you see a line of code like the following, what does it mean?
int num = <valid int value>;

This means that a variable named num has been declared as an int and has been assigned a value value.  We don’t what that value is and the value does not need to be known in order to answer the question.

String concatenation – combining 2 or more Strings using “+” such as:

string1 = “cat” + “dog”;

//age is converted to a String and concatenated onto “Your age is ”
System.out.println(“Your age is “ + age);  
</pre>
