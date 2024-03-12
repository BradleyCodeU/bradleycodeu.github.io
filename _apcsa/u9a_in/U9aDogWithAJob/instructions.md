# Dog Class


Use the super class Dog to create a new subclass and test all subclass methods in the DogTester class.

Remember that a subclass is for objects with new/different BEHAVIORS. Think about types of [dogs that have jobs](https://en.wikipedia.org/wiki/Working_dog), NOT just dog breeds. Breeds only vary in size, shape, color, but all share the same essential behaviors.

BE SPECIFIC! You may NOT name your subclass something basic/generic such as: DogJob, JobDog, or WorkingDog. Pick something specific such as:
- Guide Dog
- Police Dog
- Sheep Dog
- Search and Rescue Dog
- Detection Dog
- Fire Dog
- Sled Dog
- Therapy Dog


> "The purpose of inheritance is to model objects with different behavior. When students first learn about inheritance, they have a tendency to overuse it, by creating multiple classes even though the variation could be expressed with a simple instance variable."

Your new subclass must contain a minimum of the following:

- 2 constructors
- override the toString method
- 2 new instance variables
- 2 new accesser methods
- 2 new mutator methods

Your DogTester class MUST test EVERY constructor and EVERY method in both the superclass and the subclass. The DogTester must also use printf for all output. For example:

```
No args constructor
toString:           un-named, no breed, service dog, trained by un-named
All args constructor
toString:           Bella, Beagle, service dog, trained by Justin Riley
getBreed:           Beagle
getName:            Bella
getTrainerName:     Justin Riley
getTestScore:       71
After setter1...
getTrainerName:     Bill Williams
After setter2...
getTestScore:       89
```

Turn in your DogTester, Dog, and new subclass java files.
