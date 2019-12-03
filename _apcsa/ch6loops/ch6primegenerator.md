---
layout: project
category: ch6loops
title: Prime Generator
---

Using the [PrimePrinter starter code below](#primeprinter), write a program that prompts the user for an integer and then prints out all prime numbers up to that integer.

Recall that a number is a prime number if it is not divisible by any number except 1 and itself.

Sample Run
```
Enter upper limit: 20
2
3
5
7
11
13
17
19
```

## PrimePrinter
```java
import java.util.Scanner;

/**
   This class prints prime numbers.
*/
public class PrimePrinter
{
   public static void main (String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter upper limit: ");
      int limit = in.nextInt();

      // loop
      // call the isPrime method to check every number up to the limit
      // only print a number if it is prime
   }

   /**
	 Checks to see if a given number is prime.
   @param n an integer that may or may not be prime
	 @return true or false
   */
   public static boolean isPrime(int n)
   {
      // Needs implemented. Recall that a number is a prime number if it is not divisible by any number except 1 and itself.
      // Check every number between 1 and n
      // Use modulus to determine if n is divisible by some number
      return true;
   }

}
```
