---
layout: project
category: tk
title: Tk Poll v2
---

# Tk Poll v2

Duplicate your last project (Tkinter Poll v1.0)

Each time the user presses the Submit button, you will ALSO write your data to a text file. Read this tutorial: http://www.pythonforbeginners.com/files/reading-and-writing-files-in-python Here is a demo of writing data to a text file: https://trinket.io/library/trinkets/a1d228a3a1

Each time you open the app, try to add data to the dictionary from the saved text file. Once you open the text file, you can read the file into a string. Here is a demo of reading a file into a string: https://trinket.io/library/trinkets/d60a3d3251 Finally, you must use ast.literal_eval() to convert the string to dictionary. For example...
``` python
import ast
mystring = "{'school':'Bradley HS'}"
dictionary = ast.literal_eval(mystring)
print(dictionary["school"]) #will print "Bradley HS"
```


Your final line of code must be mainloop(). This allows someone to simply click on your file and run your app. mainloop works kind of like a game loop that keeps the app running.
```python
mainloop() #include me as last line!!!
```
