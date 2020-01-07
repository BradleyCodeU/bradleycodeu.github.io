---
layout: project
category: ch762darrays
title: Writing With FileWriter
---
You will use the FileWriter class to write to a text file. This class has several constructors to create required objects.

|FileWriter(File file) |This constructor creates a FileWriter object given a File object.|
|FileWriter(File file, boolean append) |This constructor creates a FileWriter object given a File object with a boolean indicating whether or not to append the data written.|
|FileWriter(FileDescriptor fd) |This constructor creates a FileWriter object associated with the given file descriptor.|
|FileWriter(String fileName) |This constructor creates a FileWriter object, given a file name.|
|FileWriter(String fileName, boolean append) |This constructor creates a FileWriter object given a file name with a boolean indicating whether or not to append the data written.|

Once you have FileWriter object in hand, then there is a list of helper methods, which can be used to manipulate the files.

[FileWriter API](https://docs.oracle.com/javase/7/docs/api/java/io/FileWriter.html)

|public void write(int c) throws IOException| Writes a single character.|
|public void write(char [] c, int offset, int len)| Writes a portion of an array of characters starting from offset and with a length of len.|
|public void write(String str)| Writes a String.|
|public void write(String str, int offset, int len)| Write a portion of a String starting from offset and with a length of len.|
```
import java.io.*;

public class WriteToTextFile {
   public static void main(String args[]) throws IOException {
      File file = new File("myNewFile_01.txt");

      // Create the file if it doesn't exist. Do nothing (no error) if the file already exists.
      file.createNewFile();

      // Create a FileWriter Object
      FileWriter writer = new FileWriter(file);

      // Write the content to the file
      writer.write("Hello.\nThis is an example.\nGoodbye.\n");
      writer.flush();
      writer.close();
   }
}
```
Source: [https://www.tutorialspoint.com/java/java_filewriter_class.htm](https://www.tutorialspoint.com/java/java_filewriter_class.htm)
