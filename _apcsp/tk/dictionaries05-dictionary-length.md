Dictionary Length

To determine how many items (key-value pairs) a dictionary has, use the **len()** method.

Print the number of items in the dictionary:

```python.run
data = {}

print(len(data))

data = {"key":"value", "room":"B267", "school":"Bradley", "city":"Hilliard", "state":"Ohio"}

print(len(data))

if len(data) > 0:
    print("Cool")
```

