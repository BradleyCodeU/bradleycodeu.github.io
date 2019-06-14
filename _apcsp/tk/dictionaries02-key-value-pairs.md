In an array, there are index numbers that correspond with each element in the array.
```
cars = ["Ford", "Honda", "BMW"]
0 is Ford, 1 is Honda, and 2 is BMW
```
A dictionary is a collection which is unordered, changeable, and indexed. In Python, dictionaries are written with curly brackets, and they have key/value pairs.
```
momsCar = {"brand":"Honda"}
brand is Honda
"brand" is the key and "Honda" is the value

dadsCar = {"brand": "Ford", "model": "Mustang", "year": 1964 }
brand is Ford, model is Mustang, and year is 1964
The keys are brand, model, and year. The values are Ford, Mustang, and 1964
model and Mustang are a key/value pair
```
A dictionary can be on one line or multiple lines.
```
dadsCar = {"brand": "Ford", "model": "Mustang", "year": 1964 }

is exactly the same as

dadsCar = {
  "brand": "Ford",
  "model": "Mustang",
  "year": 1964
}
```

```python.run
dadsCar = {
  "brand": "Ford",
  "model": "Mustang",
  "year": 1964
}
print("The model of dad's car is")
print(dadsCar["model"])
```
We can change the value of a key like this...
```
dadsCar["year"] = 2019
```
We can add a new key/value pair like this...
```
dadsCar["color"] = "red"
```
Try adding a new key/value pair. Add the key "transmission" and the value "automatic"
```python.run
dadsCar = {
  "brand": "Ford",
  "model": "Mustang",
  "year": 1964
}
print("The year of dad's car is")
print(dadsCar["year"])

dadsCar["year"] = 2019

print("")
print("The year of dad's car is")
print(dadsCar["year"])

print("")
print(dadsCar)
dadsCar["color"] = "red"

print("")
print(dadsCar)

```