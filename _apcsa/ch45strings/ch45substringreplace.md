---
layout: project
category: ch45strings
title: Substring Replace
---
Use these String methods to recreate the sample output:

  - .length()
  - .charAt()
  - .substring()
  - .indexOf()
  - .replace()

Sample Output: This is a sample transcript of what your program should do. Some items are user input and should not be put on the screen by your program. Make your printf "field width" a large number (like 30 or more). Your field width doesn't need to perfectly match mine.
```
Enter a long string: The quick brown fox jumped over the lazy dog
Enter a substring: jumped
Length of long string                                            44
Length of substring                                               6
Start position of substring                                      20
Before substring was                            The quick brown fox
After substring was                               over the lazy dog
Enter a position between 0 and 43: 18
Character at position 18                                          x
Enter a replacement string: leaped
Your new string is The quick brown fox leaped over the lazy dog
```
Your program should work for any arbitrary string and substring. Here's another sample transcript of a different execution of the same code:
```
Enter a long string: Friends, Romans, countrymen, lend me your ears
Enter a substring: try
Length of long string                                            46
Length of substring                                               3
Start position of substring                                      21
Before substring was                          Friends, Romans, coun
After substring was                          men, lend me your ears
Enter a position between 0 and 45: 21
Character at position 21                                          t
Enter a replacement string: trywo
Your new string is Friends, Romans, countrywomen, lend me your ears
```
