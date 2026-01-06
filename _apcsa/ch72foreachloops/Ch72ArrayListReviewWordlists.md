---
layout: project
category: u06b_for_each_loops
title: Array List Review Wordlists
---
These exercises will allow you to have some practice with the idea of ArrayLists, and more practice with programs structured using functions and procedures.

Objectives: Practice with programming fundamentals, Variables, Declaration and Assignment, Primitive types Arithmetic Expressions Simple keyboard input and text display output Branching ­ if­-else-if-­else syntax Loops ­ simple while loops, nested while loops Methods ­ functions and procedures ArrayLists ­ collections of variables

Works towards the following Course Goals: Competency with using basic coding features of a high ­level imperative programming language Competency with writing computer programs to implement given simple algorithms Familiarity with designing simple text ­oriented user interfaces

You will be writing a simple Java program that implements a few basic ArrayList manipulations. You will write code that takes two lists of words as input from the command line and stores them in separate ArrayLists. Note that the 'XXX' given to end input should be case insensitive (i.e. the code should terminate whether the user enters capital XXX or lowercase xxx). The program will merge the two lists together, alternating between elements of list1 and list2 until all values from both lists have been copied into the new list. If list1 is shorter than list2, the remaining elements of list2 will be appended to the end of the merged list. Likewise, if list2 is shorter than list1, the remaining elements of list1 will be appended to the end of the merged list. The original lists should be intact when your method ends (i.e. make no changes to list1 and list2 in the body of your method).

*****Create methods getList(), displayList(), and mergeLists() to complete this exercise*****

  - getList() should use the following method header: private static ArrayList<String> getList(Scanner inScanner)
  - displayList() should use the following method header: private static void displayList(ArrayList<String> myList)
  - mergeList() should use the following method header: private static ArrayList<String> mergeLists(ArrayList<String> list1, ArrayList<String> list2) It should take two lists of Strings as input.

Sample Output This is a sample transcript of what your program should do.
```
Enter the first wordlist:
Enter a word ('XXX' to quit): the
Enter a word ('XXX' to quit): quick
Enter a word ('XXX' to quit): brown
Enter a word ('XXX' to quit): fox
Enter a word ('XXX' to quit): jumped
Enter a word ('XXX' to quit): xxx
Enter the second wordlist:
Enter a word ('XXX' to quit): over
Enter a word ('XXX' to quit): the
Enter a word ('XXX' to quit): lazy
Enter a word ('XXX' to quit): dog
Enter a word ('XXX' to quit): xxx
Wordlist 1
----------
0: the
1: quick
2: brown
3: fox
4: jumped
Wordlist 2
----------
0: over
1: the
2: lazy
3: dog
List 1 merged with List 2
-------------------------
0: the
1: over
2: quick
3: the
4: brown
5: lazy
6: fox
7: dog
8: jumped
List 2 merged with List 1
-------------------------
0: over
1: the
2: the
3: quick
4: lazy
5: brown
6: dog
7: fox
8: jumped
```
A second run of the same program might produce the following output:
```
Enter the first wordlist:
Enter a word ('XXX' to quit): A
Enter a word ('XXX' to quit): B
Enter a word ('XXX' to quit): C
Enter a word ('XXX' to quit): D
Enter a word ('XXX' to quit): xxx
Enter the second wordlist:
Enter a word ('XXX' to quit): a
Enter a word ('XXX' to quit): b
Enter a word ('XXX' to quit): c
Enter a word ('XXX' to quit): d
Enter a word ('XXX' to quit): e
Enter a word ('XXX' to quit): f
Enter a word ('XXX' to quit): g
Enter a word ('XXX' to quit): xxx
Wordlist 1
----------
0: A
1: B
2: C
3: D
Wordlist 2
----------
0: a
1: b
2: c
3: d
4: e
5: f
6: g
List 1 merged with List 2
-------------------------
0: A
1: a
2: B
3: b
4: C
5: c
6: D
7: d
8: e
9: f
10: g
List 2 merged with List 1
-------------------------
0: a
1: A
2: b
3: B
4: c
5: C
6: d
7: D
8: e
9: f
10: g
```
