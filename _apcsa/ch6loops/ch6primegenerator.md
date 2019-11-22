---
layout: project
category: ch6loops
title: Prime Generator
---

Using the tester class [PrimePrinter already completed below](#primeprinter) and the [PrimeGenerator class starter code below](#primegenerator) (needs to be completed), write a program that prompts the user for an integer and then prints out all prime numbers up to that integer.

Recall that a number is a prime number if it is not divisible by any number except 1 and itself. Your PrimeGenerator class will need a counter instance variable that starts at 1. Each time the nextPrime method is called it adds one to the instance variable until it reaches a prime number. Then it returns that number.

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
   // declare your counter instance variable
   public PrimeGenerator()
   {

   }

   /**
	 Checks to see if a given number is prime.
   @param n an integer that may or may not be prime
	 @return true or false
   */
   public static boolean isPrime(int n)
   {
      return true;
   }

   /**
      Calculates the next prime number using the isPrime method.
      @return the next prime number
   */
   public int nextPrime()
   {
      return 0;
   }

}
```
