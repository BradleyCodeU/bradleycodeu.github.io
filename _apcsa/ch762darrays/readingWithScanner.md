---
layout: project
category: ch762darrays
title: Reading With Scanner
---

Reading with Scanner class: A simple text scanner which can parse primitive types and strings using regular expressions.

[Scanner API](https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html#constructor_summary)

A Scanner breaks its input into tokens using a delimiter pattern, which by default matches whitespace. The resulting tokens may then be converted into values of different types using the various next methods.
```
// Java Program to illustrate reading from Text File
// using Scanner Class
import java.io.File;
import java.util.Scanner;

public class ReadFromFileUsingScanner
{
  public static void main(String[] args) throws Exception
  {
    // pass the path to the file as a parameter. Notice the double backslashes
    File file = new File("C:\\Users\\pankaj\\Desktop\\test.txt");
    Scanner sc = new Scanner(file);
    // print each line of the file on a new line
    while (sc.hasNextLine()){
      System.out.println(sc.nextLine());
    }
  }
}
```
Using Scanner class but without using loops:
```
// using Scanner Class reading entire File
// without using loop
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingEntireFileWithoutLoop
{
  public static void main(String[] args) throws FileNotFoundException
  {
    File file = new File("C:\\Users\\pankaj\\Desktop\\test.txt");
    Scanner sc = new Scanner(file);
    // we just need to use \\Z as delimiter. with "\\Z" it reads the entire file
    sc.useDelimiter("\\Z");
    // print the entire file as one long string without line breaks
    System.out.println(sc.next());
  }
}
```
Source: [https://www.geeksforgeeks.org/different-ways-reading-text-file-java/](https://www.geeksforgeeks.org/different-ways-reading-text-file-java/)
