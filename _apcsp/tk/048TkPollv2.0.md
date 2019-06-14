Duplicate your last project (Tkinter Poll v1.0)

Each time the user presses the Submit button, you will ALSO write your data to a text file. Read this tutorial: http://www.pythonforbeginners.com/files/reading-and-writing-files-in-python Here is a demo of writing data to a text file: https://trinket.io/library/trinkets/a1d228a3a1 
Each time you open the app, try to add data to the dictionary from the saved text file. Once you open the text file, you can read the file into a string. Here is a demo of reading a file into a string: https://trinket.io/library/trinkets/d60a3d3251 Finally, you must use ast.literal_eval() to convert the string to dictionary. For example...
``` python
import ast
mystring = "{'school':'Bradley HS'}"
dictionary = ast.literal_eval(mystring)
print(dictionary["school"]) #will print "Bradley HS"
```
**NOTE:** Consider switching to IDLE for this project (its already installed on your PC), because Mu will save your text file in a weird place. When you run this code for the first time...
```python
file = open("data.txt", "w")   #correct way to open file for writing (or create new file)
```
...Mu will create the new data.txt file here: C:\Users\yourStudentIdNumber\mu_code\data.txt This only happens with Mu. With other IDEs (like Python IDLE) your data.txt file will be created in the same location as your "poll2.py" file. You can test this by simply double-clicking your "poll2.py" file to run the app. This is what we want.
Do NOT try fixing this Mu issue by listing the full location...
```python
file = open("C:\Users\rileyju\Desktop\data.txt", "w")   #do NOT do this
```
...because this code will work for rileyju, but will fail for everyone else.
Your final line of code must be mainloop(). This allows someone to simply click on your file and run your app. mainloop works kind of like a game loop that keeps the app running.
```python
mainloop() #include me as last line!!!
```
