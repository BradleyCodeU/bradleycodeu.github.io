---
layout: project
category: 207_iteration
title: StringLoopAlgorithms
---
Concepts: for loops, String methods, Integer.parseInt(String s)

### String to int

A Quick Refresher on Integer.parseInt()...

Since you're working with number strings (for example "243546" or "7"), remember that Integer.parseInt() expects a String argument and returns an int

<table>
<tr>
<td>static int parseInt(String s)</td>
<td>Returns the String argument as an int</td>
</tr>
</table>

```
// convert String to int
// using Integer.parseInt()

int number1 = Integer.parseInt("67");
```

### int to String



The EASY way to convert an int to a String is concatenation with an empty String:

```
// convert an int to a String by
// concatenating with empty String

String str1 = "" + 67;
```

There is a static Integer class method BUT IT IS NOT ON THE AP EXAM. You do NOT have to use it. It is Integer.toString()... String str1 = Integer.toString(67);

## Directions

Pick any 5 of the following algorithms and write static methods for them (ask Mr. Riley if you need clarification about how an algorithm should work)

<ul id="algorithmList">
</ul>

In the main method, create 5 expected/actual tests for EACH algorithm. Your finished project will have a total of 25 expected/actual tests. For example, if I created an algorithm String sayHelloName(String name), then my tests might look like this...

```
System.out.println("- - -Testing sayHelloName algorithm- - -");
System.out.println("Expect: Hello Alice \nActual: " + sayHelloName("Alice"));
System.out.println("Expect: Hello Bob \nActual: " + sayHelloName("Bob"));
System.out.println("Expect: Hello Carol \nActual: " + sayHelloName("Carol"));
System.out.println("Expect: Hello Dave \nActual: " + sayHelloName("Dave"));
System.out.println("Expect: Hello Eliza \nActual: " + sayHelloName("Eliza"));
System.out.println("- - -Testing the next algorithm- - -");
```

<script>
let mylist = [
    "String sayLaXTimes(int x)",
    "int sumDigitsOfNumberString(String num)",
    "double averageDigitsOfNumberString(String num)",
    "int countTimesLetterAppears(String fullString, String letter)",
    "boolean doesLetterAppear(String fullString, String letter)",
    "boolean hasOnlyLetter(String fullString, String letter)",
    "String removeLetter(String fullString, String letter)",
    "boolean hasNumbers(String myString)",
    "String replaceLetterWithStars(String fullString, String letter)"
]
mylist.push( Math.random() > 0.5 ? "int countConsonants(String myString)" : "int countVowels(String myString)");
mylist.push( Math.random() > 0.5 ? "String removeConsonants(String myString)" : "String removeVowels(String myString)");
mylist.push( Math.random() > 0.5 ? "int removeOddDigits(String number)" : "int removeEvenDigits(String number)");
mylist.push( Math.random() > 0.5 ? "boolean hasOnlyConsonants(String myString)" : "boolean hasOnlyVowels(String myString)");
mylist.push( Math.random() > 0.5 ? "int maxDigitOfNumberString(String num)" : "int minDigitOfNumberString(String num)");
for (let i = mylist.length - 1; i > 0; i--) { 
    const j = Math.floor(Math.random() * (i + 1));
    const temp = mylist[i];
    mylist[i] = mylist[j];
    mylist[j] = temp;
}
console.log(mylist);
for(const each of mylist){
    const newLi = document.createElement("li");
    newLi.textContent = each; 
    document.getElementById("algorithmList").appendChild(newLi);
}
</script>