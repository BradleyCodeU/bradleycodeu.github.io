Let's review how arrays work. We will create an array called "cars", print the name of the car at index #1, ask the user to type the name of a new car, add the new car to the end of the cars array, and finally print the full array.

```python.run
# Create an array
cars = ["Ford", "Honda", "BMW"]

# Print the name of the car at index #1
print(cars[1])

# Ask the user to type the name of a new car
newCar = input("Type Chevy or some other kind of car: ")

# Add the new car to the end of the cars array
cars.append(newCar)

# Print the full array
print(cars)

```

Now lets loop through the array using a for-each loop. Notice that Index 0 is Ford, Index 1 is Honda, and Index 2 is BMW
```python.run
cars = ["Ford", "Honda", "BMW"]
counter = 0

for car in cars:
    print("Index " + str(counter) + " is " + car)
    counter = counter + 1
```