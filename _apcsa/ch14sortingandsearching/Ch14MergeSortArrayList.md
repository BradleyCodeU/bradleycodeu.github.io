---
layout: project
category: ch14sortingandsearching
title: MergeSort ArrayList
---

Using [this starter template](https://trinket.io/library/trinkets/39a2bffd1b) and your static Merge Sort algorithms (from previous assignments):

1. Complete the code to use the Merge Sort to arrange an ArrayList of Dog objects in ascending order (youngest first) according to the Dog's age. The Dog class is provided.
2. Enter appropriate code following the comments in the program.

Starter Template:

Main.java
```
// any imports needed?
class Main {
  public static void main(String[] args) {
    // create an arrayList called dogList that will store elements of type Dog

    // add at least 5 Dogs to the arrayList

    mergeSort(dogList);
    // print sorted dogList

  }
  public static void mergeSort(ArrayList<Dog> dogList){
    int n = dogList.size();
    ArrayList<Dog> temp = new ArrayList<Dog>(dogList); // copy dogList to temp
    // complete code to sort ArrayList

  }
  private static void mergeSortHelper(ArrayList<Dog> dogList, int from, int to, ArrayList<Dog> temp){
    // complete code to sort ArrayList

  }
  private static void merge(ArrayList<Dog> dogList, int from, int mid, int to, ArrayList<Dog> temp){
    // complete code to sort ArrayList

  }
}
```

Dog.java
```
public class Dog {
	private String breed, name;
	private double age, weight;
	public Dog(String breed, String name, double age, double weight) {
		this.breed = breed;
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	public String getBreed() {
		return this.breed;
	}
	public double getAge() {
		return this.age;
	}
	public double getWeight() {
		return this.weight;
	}
	public String getName() {
		return this.name;
	}
	public String toString() {
		String output = "\nBreed: " + getBreed();
		output += "\nName: " + getName();
		output += "\nAge: " + getAge();
		output += "\nWeight: " + getWeight();
		output += "\n";
		return output;
	}
}
```
