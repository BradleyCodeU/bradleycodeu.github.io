---
layout: project
category: ch45strings
title: Replace
---
Starter template: [https://repl.it/@JustinRiley1/227SubstringReplace-Template#README.md](https://repl.it/@JustinRiley1/227SubstringReplace-Template#README.md)

Use these String methods to recreate the sample output:

  - .length()
  - .charAt()
  - .substring()
  - .indexOf()

Sample Output: This is a sample transcript of what your program should do. Some items (text after a colon:) are user input and should not be put on the screen by your program. You will create two columns using printf. The field width of the first column is 25 and the second column is 25.
```
Enter a long string: The quick brown fox jumped over the lazy dog
Enter a substring: jumped
Enter index between 0 and 43: 18
Notice the previous prompt matches long string length - 1.
Enter a replacement string: leaped
---------+---------+----|---------+---------+----|
Length of long string =                         44
Length of substring =                            6
Substring start index =                         20
Before substring was =         The quick brown fox
After substring was =            over the lazy dog
Character at index 18 =                          x
Your new string =        The quick brown fox leaped over the lazy dog
```
Your program should work for any arbitrary string and substring. Here's another sample transcript of a different execution of the same code:
```
Enter a long string: Friends, Romans, countrymen, lend me your ears
Enter a substring: try
Enter index between 0 and 45: 21
Notice the previous prompt matches long string length - 1.
Enter a replacement string: trywo
---------+---------+----|---------+---------+----|
Length of long string =                         46
Length of substring =                            3
Substring start index =                         21
Before substring was =       Friends, Romans, coun
After substring was =       men, lend me your ears
Character at index 21 =                          t
Your new string =        Friends, Romans, countrywomen, lend me your ears
```

Starter template:
```
class Main {
  public static void main(String[] args) {
    //Enter a long string:
    //Enter a substring:
    //Enter index between 0 and 43:
    //Notice the previous prompt matches long string length - 1.
    //Enter a replacement string:
    System.out.println("---------+---------+----|---------+---------+----|");
    System.out.printf("%-25s%25s","Length of long string =","???");
    System.out.printf("%-25s%25s","Length of substring =","???");
    System.out.printf("%-25s%25s","Substring start index =","???");
    System.out.printf("%-25s%25s","Before substring was =","???");
    System.out.printf("%-25s%25s","After substring was =","???");
    System.out.printf("%-25s%25s","Character at index ?? =","???");
    System.out.printf("%-25s%25s","Your new string =","???");
    
  }
}
```
