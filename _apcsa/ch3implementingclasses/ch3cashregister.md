---
layout: project
category: ch3-implementing-classes
title: Ch3 Cash Register
---
Implement a class that models a self-service cash register. The customer scans the price tags and deposits money in the machine. The machine dispenses the change.

The starter CashRegister code is in the "How to 3.1", pages 96-99
```java
/**
A cash register totals up sales and computes change due.
*/
public class CashRegister
{
/**
Constructs a cash register with no money in it.
*/
public CashRegister()
{  
  taxRate = 0.075 // The combined sales tax rate for Hilliard, OH is 7.5%. This is the total of state, county and city sales tax rates.
}
/**
Records the sale of an item.
@param amount the price of the item
*/
public void recordPurchase(double amount)
{
}
/**
Records the sale of an item with tax.
Uses getItemTax() to calculate the tax for this purchase.
@param amount the price of the item
*/
public void recordTaxablePurchase(double amount)
{
}
/**
Processes a payment received from the customer.
@param amount the amount of the payment
*/
public void receivePayment(double amount)
{
}
/**
Computes the change due and resets the machine for the next customer.
@return the change due to the customer
*/
public double giveChange()
{
}
/**
Returns number of items purchased.
@return the number of items purchased
*/
public int getItemCount()
{
}
/**
Calculates the total tax collected during recordTaxablePurchase()
Calculate the amount of tax for this item by multiplying itemAmount and the taxrate instance variable
@param itemAmount the pretax price for this item
@return the total tax for this item
*/
private double getItemTax(double itemAmount)
{
}
// tester
public static void main(String[] args)
  {
    CashRegister foo = new CashRegister();
    foo.recordPurchase(19.99);
    foo.receivePayment(25.00);
    System.out.println(foo.giveChange()); // Expected 5.01
    foo.recordTaxablePurchase(19.99);
    foo.receivePayment(25.00);
    System.out.println(foo.giveChange()); // Expected 3.51
  }
}
```
Complete programming projects 3.1 and 3.2 on page 125.

P3.1 Enhance the CashRegister class so that it counts the purchased items. Provide a getItemCount method that returns the count.

P3.2 Support computing sales tax in the CashRegister class. Add recordTaxablePurchase and getItemTax methods. (Amounts added with recordPurchase are not taxable.) The giveChange method should correctly reflect the sales tax that is charged on taxable items.
