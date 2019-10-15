---
layout: project
category: ch45strings
title: Phone Number
---
The following pseudocode describes how to turn a string containing a ten-digit phone number (such as 4155551212) into a more readable string with parentheses and dashes, like this: "(415) 555-1212".

Pseudocode
  - Get substring consisting of the first three characters. This is the area code.
  - Concatenate "(", the area code,")", the substring consisting of the next three characters, a hyphen, and the substring consisting of the last four characters. This is the formatted number.

Translate this pseudocode into a Java program that prompts for a telephone number, stores it as string variable, computes the formatted number, and prints it.
