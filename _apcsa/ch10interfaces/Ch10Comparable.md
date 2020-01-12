---
layout: project
category: ch10interfaces
title: Comparable
---
The Comparable interface compares objects of the same type. The required method compareTo returns an integer with a value of -1 if the base object comes before the compared object, a 0 if the objects are equal, or a 1 if the base object comes after the compared object. The nice thing about the Comparable interface is you get to pick the instance variable that you want to use for comparison. The only restriction is that the item of comparison must be an Object. ie - It doesn’t work with ints and doubles. We will use the Person’s name in this case.


1.	Create the Comparable interface as seen here. ![Comparable interface example](/apcsa/ch10interfaces/Comparable1.png)



2.	In order to implement this interface, the Person class needs to be changed.

    a.	Attach the Comparable interface to the Person signature line. ![Comparable interface example](/apcsa/ch10interfaces/Comparable2.png)

    b.	Add the required compareTo method to the Person class. ![Comparable interface example](/apcsa/ch10interfaces/Comparable3.png)


3.	Create a new PersonTester2 class. In this class, we are going add two additional static methods to find the first and last person in lexicographical order, as well as the usual main method.

    a.	Code the firstPerson method that works similarly to the min and max we coded previously with the Measurable class. ![Comparable interface example](/apcsa/ch10interfaces/Comparable4.png)

    b.	Code the lastPerson method to find the person whose name is last in lexicographic order.

    c.	The main method will contain an array of people of type Person and the calls for the firstPerson and lastPerson methods. ![Comparable interface example](/apcsa/ch10interfaces/Comparable5.png)



Turn in PersonTester2, Comparable interface, Measurable interface, and the Person class.
