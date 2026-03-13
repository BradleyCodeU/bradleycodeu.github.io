---
layout: project
category: 207_iteration
title: StringLoopAlgorithms
---
Concepts: for loops, String methods, Integer.parseInt(String s)

Pick any 5 of the following algorithms and write static methods for them (ask Mr. Riley if you need clarification about how an algorithm should work)

<ul id="algorithmList">
</ul>

In the main method, create 5 expected/actual tests for each algorithm. For example, if I created an algorithm String sayHelloName(String name), then my tests might look like this...

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
]
mylist.push( Math.random() > 0.5 ? "int countConsonants(String myString)" : "int countVowels(String myString)");
mylist.push( Math.random() > 0.5 ? "String removeConsonants(String myString)" : "String removeVowels(String myString)");
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