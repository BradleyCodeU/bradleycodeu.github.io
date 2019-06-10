Reading Files in Python
===================================

The syntax to open a file object in Python is: 

**file  = open("filename.txt", "mode")** 

The second argument you see – **mode** – tells the interpreter and developer which way the file will be used.  
  

Mode
----

  
Including a mode argument is optional because a default value of '**r**' will be assumed if it is omitted. The '**r**' value stands for read mode, which is just one of many. 

The modes are: 

*   '**r**' – **Read mode which is used when the file is only being read (will result in FileNotFoundError if the file doesn't exist)**
*   'w' – Write mode which is used to edit and write new information to the file (any existing files with the same name will be erased when this mode is activated) 
*   'a' – Appending mode, which is used to add new data to the end of the file; that is new information is automatically amended to the end 

So, let's take a look at a quick example. 

```
file = open("mytextfile.txt","r")
```

This snippet opens the file named "workfile" in reading mode. 
Once this has been done, you can move on to call the objects functions. The two most common functions are read and write.  
  
## FileNotFoundError
If you try to open a file that doesn't exist you will get the following error...

```
FileNotFoundError: [Errno 2] No such file or directory
```

Use try/except to avoid this error.
  
Reading a Text File in Python
--------------------------------

There are actually a number of ways to read a text file in Python, not just one. 

If you need to extract a string that contains all characters in the file, you can use the following method:   
  

```file.read()```

  
The full code to work with this method will look something like this:   
  
```
file = open("mytextfile.txt", "r")
mystring = file.read()
print("Loaded from file: " + mystring)
file.close()
```

  
The output of that command will display all the text inside the file.

## Multiple lines

What if we wanted to return every line in the file, properly separated? You would use the same function, only in a new form. This is called the file.readlines() function.   
  

```
file = open("rosesPoem.txt", "r")
print(file.readlines())
file.close()
```

  
The output you would get from this is:   
  
**\['Roses are red', 'Violets are blue', 'Sugar is sweet', 'And so are you.'\]**

  
Notice how each line is separated accordingly? Note that this is not the ideal way to show users the content in a file. But it's great when you want to collect information quickly for personal use during development or recall.  
  


Closing a File
--------------

  
When you're done working, you can use the **file.close()** command to end things. What this does is close the file completely, terminating resources in use, in turn freeing them up for the system to deploy elsewhere. 

It's important to understand that when you use the **file.close()** method, any further attempts to use the file object will fail. 

Notice how we have used this in several of our examples to end interaction with a file? This is good practice.  
  
