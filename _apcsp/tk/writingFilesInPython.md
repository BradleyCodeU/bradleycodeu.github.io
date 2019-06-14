Writing Files in Python
===================================

The syntax to open a file object in Python is: 

**file = open("filename.txt", "mode")** 

The second argument you see – **mode** – tells the interpreter and developer which way the file will be used.  
  

Mode
----

  
Including a mode argument is optional because a default value of '**r**' will be assumed if it is omitted. The '**r**' value stands for read mode, which is just one of many. 

The modes are: 

*   'r' – Read mode which is used when the file is only being read (will result in FileNotFoundError if the file doesn't exist)
*   '**w**' – **Write mode which is used to edit and write new information to the file (any existing files with the same name will be erased when this mode is activated)**
*   'a' – Appending mode, which is used to add new data to the end of the file; that is new information is automatically amended to the end 

So, let's take a look at a quick example. 

```
file = open("workfile.txt","w")
```

This snippet opens the file named "workfile.txt" in writing mode so that we can make changes to it.
Once this has been done, you can move on to call the objects functions. The two most common functions are read and write.  
  

Create a text file
------------------

  
To get more familiar with text files in Python, let's create our own and do some additional exercises. 

Using a simple text editor, let's create a file. You can name it anything you like, and it's better to use something you'll identify with. 

For the purpose of this tutorial, however, we are going to call it "testfile.txt". 

Just create the file and leave it blank. 

To manipulate the file, write the following in your Python environment (you can copy and paste if you'd like):  
  
```
file = open("testfile.txt","w")
file.write("Hello World")
file.close()
```
  
Naturally, if you open the text file – or look at it – using Python you will see only the text we told the interpreter to add.  
  

```Hello World```

  

  

Closing a File
--------------

  
When you're done working, you can use the **file.close()** command to end things. What this does is close the file completely, terminating resources in use, in turn freeing them up for the system to deploy elsewhere. 

It's important to understand that when you use the **file.close()** method, any further attempts to use the file object will fail. 

Notice how we have used this in several of our examples to end interaction with a file? This is good practice.  
  

