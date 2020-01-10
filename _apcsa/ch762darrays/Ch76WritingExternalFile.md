---
layout: project
category: ch762darrays
title: Writing External File
---
Read this tutorial about [writing with FileWriter](/apcsa\ch762darrays\writingWithFileWriter/)

We will be creating a 2D array and then storing the data in an external file.

1. Using a text editor, create a new document that has nothing in it. Save it as Characters.txt. This is where we will store our data.
1. Create a new java class file called Characters and save it in the same location as the previous txt file.
1. Supply the following code.
  - Create and fill a 2x6 (2 columns, 6 rows) array with the first and last names of 6 fictional characters of your choice. Column 0 contains first names and column 1 contains last names. This can be done using one line of code (you do NOT need to use a for-loop to fill the array).
  - Create a FileWriter object to open the txt file.
  - Write "First and Last\\n"
  - Create a loop that will iterate through the rows. Write the row number followed by the first and last name and a line break.
  - Write "Last names only\\n"
  - Create a loop that will iterate through the rows. Write the row number followed by the last name and a line break.
  - Close the file.
1. Compile and run your program.
1. Check the output file to make sure the data was stored properly. Correct code if necessary.

Example Output that might be written to Characters.txt
```
First and Last:
row 0: Wade Watts
row 1: Diana Prince
row 2: Steve Rogers
row 3: Lorelai Gilmore
row 4: Rachel Green
row 5: Barney Stinson

Last names only:
row 0: Watts
row 1: Prince
row 2: Rogers
row 3: Gilmore
row 4: Green
row 5: Stinson
```
