Notes:

- Assume that the classes listed in the Java Quick Reference have been imported where appropriate.

- Unless otherwise noted in the question, assume that parameters in method calls are not null and that methods
are called only when their preconditions are satisfied.

- In writing solutions for each question, you may use any of the accessible methods that are listed in classes
defined in that question. Writing significant amounts of code that can be replaced by a call to one of these
methods will not receive full credit.

1. Consider the following partial declaration for a WordScrambler class. The constructor for the
WordScrambler class takes an even-length array of String objects and initializes the instance variable
scrambledWords.

```Java
public class WordScrambler
{
private String[] scrambledWords;

/** @param wordArr an array of String objects
* Precondition: wordArr.length is even
*/
public WordScrambler(String[] wordArr)
{
scrambledWords = mixedWords(wordArr);
}

/** @param word1 a String of characters
* @param word2 a String of characters
* @return a String that contains the first half of word1 and the second half of word2
*/
private String recombine(String word1, String word2)
{ /* to be implemented in part (a) */ }

/** @param words an array of String objects
* Precondition: words.length is even
* @return an array of String objects created by recombining pairs of strings in array words
* Postcondition: the length of the returned array is words.length
*/
private String[] mixedWords(String[] words)
{ /* to be implemented in part (b) */ }
// There may be instance variables, constructors, and methods that are not shown.
}
```

<hr>

(a) Write the `WordScrambler` method `recombine`. This method returns a String created from its
two String parameters as follows.

- take the first half of word1

- take the second half of word2

- concatenate the two halves and return the new string.

For example, the following table shows some results of calling recombine. Note that if a word has an
odd number of letters, the second half of the word contains the extra letter.
```
word1   word2   --> result
"apple" "pear"  --> "apar"
"pear"  "apple" --> "peple"
```
Complete method `recombine` below.
```Java
/** @param word1 a String of characters
* @param word2 a String of characters
* @return a String that contains the first half of word1 and the second half of word2
*/
private String recombine(String word1, String word2)
```

<hr>

(b) Write the `WordScrambler` method `mixedWords`. This method creates and returns a new array of
String objects as follows.

It takes the first pair of strings in words and combines them to produce a pair of strings to be included in
the array returned by the method. If this pair of strings consists of w1 and w2, the method should include
the result of calling `recombine` with w1 and w2 as arguments and should also include the result of
calling `recombine` with w2 and w1 as arguments. The next two strings, if they exist, would form the
next pair to be processed by this method. The method should continue until all the strings in words have
been processed in this way and the new array has been filled. For example, if the array words contains the
following elements:
```
{"apple", "pear", "this", "cat"}
```
then the call mixedWords(words) should return the following array.
```
{"apar", "peple", "that", "cis"}
```
In writing mixedWords, you may call recombine. Assume that `recombine` works as specified,
regardless of what you wrote in part (a).

Complete method `mixedWords` below.
```Java
/** @param words an array of String objects
* Precondition: words.length is even
* @return an array of String objects created by recombining pairs of strings in array words
* Postcondition: the length of the returned array is words.length
*/
private String[] mixedWords(String[] words)
```