---
layout: project
category: tk
title: Tk Try Load File
---

I recommend switching to IDLE for this project (it's already installed on your PC), because Mu will save your text file in a _weird_ place. When you run this code for the first time...
```
file = open("data.txt", "w")   #correct way to open file for writing (or create new file)
```
...Mu will create the new data.txt file here: `C:\Users\yourStudentIdNumber\mu_code\data.txt` This only happens with Mu. With other IDEs (like Python IDLE) your data.txt file will be created in the same location as your "poll2.py" file. You can test this by simply double-clicking your "poll2.py" file to run the app. This is what we want.
Do NOT try fixing this Mu issue by listing the full location...
```
file = open("C:\Users\rileyju\Desktop\data.txt", "w")   #do NOT do this
```
...because this code will work for rileyju, but will fail for everyone else.

Before you begin coding:
- Create a text file in the same folder as your Python project (for example, helloworld.txt).
- Inside of the text file, write a message (for example, "hello world blahblahblah 123123").


Create a function called tryLoadFile that requires one argument: filename. The function returns a string that contains the file text if it was able to open the file. Otherwise it returns False.
- You will need to use try/except when you open the file, otherwise it could crash with a FileNotFound error.
- Once you open the text file, you can read the file into a string.
- Read this tutorial: [readingFilesInPython.md](/apcsp/tk/readingFilesInPython/)
- Here is a demo of reading a file into a string: [https://trinket.io/library/trinkets/d60a3d3251](https://trinket.io/library/trinkets/d60a3d3251)


In your Tk app create:
- a Label (at the top) that says "Type the file name here:"
- an Entry box in which you will type the file name (for example, helloworld.txt)
- a Button that says "Load"

When the Load button is pressed:
- get the text from the entry box and save it in a variable named userinput
- call the tryLoadFile function with userinput as an argument
- if tryLoadFile returns false:
  - create an error messagebox that says "Could not load"
- else:
  - create an info messagebox that displays the "hello world" text from your text file (for example, "hello world blahblahblah 123123")
