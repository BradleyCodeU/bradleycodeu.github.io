---
layout: project
category: ch45strings
title: Phone Number
---
Prompt user for a telephone number and store it as a string variable.
If the length of the string is NOT 10, then print an error like "not a 10-digit number" UNLESS the phone number was "911"
If the length of the string IS 10, compute the phone format number, and print it in the phone format.

The following pseudocode describes how to turn a string containing a ten-digit phone number (such as 4155551212) into a more readable phone format with parentheses and dashes, like this: "(415) 555-1212".

Pseudocode for phone format:
  - Get substring consisting of the first three characters. This is the area code.
  - Concatenate "(", the area code,") ", the substring consisting of the next three characters, a hyphen, and the substring consisting of the last four characters. This is the formatted number.
