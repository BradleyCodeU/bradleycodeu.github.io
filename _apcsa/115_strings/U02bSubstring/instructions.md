---
layout: project
category: 115_strings
title: U02b First Vowel Substring
---
First Vowel Substring


In this project you will demonstrate several String methods including substring, indexOf, toUpperCase, toLowerCase, and length



Define a static function named findFirstVowel() that requires String parameter inputWord and returns an int

```
public static int findFirstVowel(String inputWord){
        // convert the inputWord to lowercase
        inputWord = ???
        // create a string named vowels that is "aeiouy"
        ???
        // create a counter starts at 0
        ???
        // while the counter is less than the length of inputWord
        while(counter < ???) {
            // get a singleLetter using inputWord substring from counter to counter+1
            String singleLetter = ???
            // if vowels index of singleLetter equals -1
            if (??? == -1) {
                // add one to counter so we check the next letter in the string
                ???
            }
            else{
                // done! here is the index of the first vowel
                return counter;
            }
        }
        // didn't find a vowel
        return 0;
    }
```


Create *ONE* Java program that does *ALL* of the following:

1. Ask the user for a word and collect it with Scanner.

1. Convert the word to all caps. For example, if the user input "hello" and then change it to "HELLO". Use the toUpperCase method. <ins>Print the result</ins>

1. Convert the word to all lowercase. For example, if the user input "Justin" and then change it to "justin". Use the toLowerCase method. <ins>Print the result</ins>

1. Convert the word so that the first letter is capitalized. For example, if the user input "hello" it becomes "Hello" and if the user input "BRADLEY" it becomes "Bradley". Use the substring, toUpperCase, and toLowerCase methods. <ins>Print the result</ins>

1. Convert the word so "ab" is inserted before the first vowel. For example, if the user input "Justin" it becomes "Jabustin" and if the user input "screen" it becomes "scrabeen". Use the String class substring method and the static findFirstVowel(inputWord) method. <ins>Print the result</ins>

1. Shm-reduplication. You will need to use findFirstVowel and replace the characters before the first vowel with "shm". If the user input "Justin" it becomes "Justin-shmustin" and if the user input "bradley" it becomes "bradley-shmadley". Use the String class substring method and the static findFirstVowel(inputWord) method. <ins>Print the result</ins>

1. Pig Latin. For example, if the user input "Justin" it becomes "Ustin-jay" and if the user input "bradley" it becomes "Adley-bray". Use the String class substring method, the String toUpperCase method, the String toLowerCase method, and the static findFirstVowel(inputWord) method. <ins>Print the result</ins>

1. Generate a username using the first letter (converted to lowercase), the last letter (converted to uppercase), and a random three-digit number from 100 to 999. For example, if the user input "Justin" it might generate "jN371" or "jN784" or "jN196". Use the String length and substring to get the last letter. For the random number...
    - double randomDouble = Math.random(); // returns a decimal number from 0.0 up to 0.99999999999
    - Convert it to a String, use String randomString = randomDouble + "";
    - Use the substring method to ONLY print 3 digits. <ins>Print the random user name (like "jN371" or "jN784" or "jN196")</ins>


