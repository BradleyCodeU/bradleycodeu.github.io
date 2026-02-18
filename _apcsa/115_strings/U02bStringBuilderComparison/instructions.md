---
layout: project
category: 115_strings
title: U02b StringBuilder Comparison
---
StringBuilder Comparison

Create *ONE* Java program that does *ALL* of the following:

1. Write Java statements that initialize a string message with "Apple" and then change it to "APPLE" using the toUpperCase() method. <ins>Print the results</ins>

2. Write Java statements that initialize a string message with "Banana" and then change it to "banana" using the toLowerCase() method. <ins>Print the result</ins>

3. Mr Riley has initialized a string message with "Cocoon" and wants to change it to "Cocomelon" using the String replace() method. You need to fill in the arguments. <ins>Print the result</ins>

4. The StringBuilder class also has a replace() method. Notice that a StringBuilder is mutable and allows changes to the object. Mr Riley has initialized a string message with "Grapefruit" and wants to change it to "Dragonfruit" using the StringBuilder replace() method. You need to fill in the arguments. <ins>Print the result</ins>

5. Write code that initializes a string with "Mississippi". Use the String [replaceAll method](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#replaceAll(java.lang.String,%20java.lang.String)) to change the string... First, replace all "i" with "ii", then replace all "ss" with "s" and <ins>print the LENGTH</ins> of the resulting string.

6. The StringBuilder class has a [reverse](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html) method for reversing a string. Write code to construct a StringBuilder object from a given string ("desserts"), call the reverse method followed by the toString method, and <ins>print the result</ins>.

7. Create a StringBuilder foxSentence with the text "the quick brown fox jumps over the lazy dog". Prompt the user to type a single, lowercase letter. Use the indexOf method to find the index number of the user's letter within foxSentence. Next, use another of StringBuilder's methods to delete that letter from foxSentence. Finally, <ins>print foxSentence</ins>.

8. Create a String sphinxSentence with the text "sphinx of black quartz judge my vow". Prompt the user to type a single, lowercase letter. Use the indexOf method to find the index number of the user's letter within sphinxSentence. Use the substring method to get everything BEFORE that index and concatenate it with everything AFTER that index. Finally, <ins>print sphinxSentence</ins>.