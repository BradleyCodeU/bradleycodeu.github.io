---
layout: project
category: ch6-loops
title: Prime Generator
---

Using the tester class [PrimePrinter already completed below](#primeprinter) and the [PrimeGenerator class starter code below](#primegenerator) (needs to be completed), write a program that prompts the user for an integer and then prints out all prime numbers up to that integer.

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

      PrimeGenerator pg = new PrimeGenerator();

      boolean done = false;
      while (!done)
      {
         int prime = pg.nextPrime();
         if (prime > limit)
            done = true;
         else
            System.out.println(prime);
      }
   }
}
```
## PrimeGenerator
```java
/**
   This class generates all prime numbers.
*/
public class PrimeGenerator
{

   public PrimeGenerator()
   {

   }

   /**
      Calculates the next prime number.
      @return the next prime number
   */
   public int nextPrime()
   {
      return 0;
   }
   /**
	 Checks to see if number is prime.
	 @return true or false
   */
   public static boolean isPrime(int n)
   {
      return true;
   }
}
```
