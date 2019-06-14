To determine if a specified key is present in a dictionary use the **in** keyword:

Check if "model" is present in the dictionary:
```python.run

data =	{
  "brand": "Ford",
  "model": "Mustang",
  "year": 1964
}

if "color" in data:
  print("Yes, 'color' is one of the keys in the dictionary")
else:
  print("No color")

if "model" in data:
  print("Yes, 'model' is one of the keys in the dictionary")
else:
  print("No model")


```