I recommend switching to IDLE for this project (its already installed on your PC), because Mu will save your text file in a weird place. When you run this code for the first time...
```
file = open("data.txt", "w")   #correct way to open file for writing (or create new file)
```
...Mu will create the new data.txt file here: C:\Users\yourStudentIdNumber\mu_code\data.txt This only happens with Mu. With other IDEs (like Python IDLE) your data.txt file will be created in the same location as your "poll2.py" file. You can test this by simply double-clicking your "poll2.py" file to run the app. This is what we want.
Do NOT try fixing this Mu issue by listing the full location...
```
file = open("C:\Users\rileyju\Desktop\data.txt", "w")   #do NOT do this
```
...because this code will work for rileyju, but will fail for everyone else.



Create a function called tryLoadFile that requires one argument: filename.
The function returns a string that contains the file text if it was able to open the file. Otherwise it returns False.

You will need to use try/except when you open the file, otherwise you could get a FileNotFound error. 
Once you open the text file, you can read the file into a string. 
Read this tutorial:  [readingFilesInPython.md](readingFilesInPython.md)
Here is a demo of reading a file into a string: [https://trinket.io/library/trinkets/d60a3d3251](https://trinket.io/library/trinkets/d60a3d3251)

Create a text file in the same folder as your Python project (for example, helloworld.txt).
Inside of the text file, write a message (for example, "hello world blahblahblah 123123").

In your Tk app create:
- a Label that says "Filename"
- an Entry
- a Button that says "Submit"

When the submit button is pressed:
- call the tryLoadFile function with the text from your Entry as an argument
- if tryLoadFile returns false:
  - create an error messagebox that says "Could not load"
- else:
  - create an info messagebox that displays the "hello world" text from your text file
