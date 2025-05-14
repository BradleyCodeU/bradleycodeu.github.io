---
layout: project
category: u9a_in
title: U09a Picture Lab
---



For each activity, read the directions on the website and then answer the questions. Turn in QUESTIONS.txt when finished.

-=-=-=-=-=-=-=-=-=-=-=-=-=-

## Introduction to Digital Pictures and Color

[ Picture Lab Activity 1 https://mathorama.com/apcs/pmwiki.php?n=Main.PictureLabActivity1 ]( https://mathorama.com/apcs/pmwiki.php?n=Main.PictureLabActivity1 ) 

1. How many bits does it take to represent the values from 0 to 255?

2. How many bytes does it take to represent a color in the RGB color model?

3. How many pixels are in a picture that is 640 pixels wide and 480 pixels high?

-=-=-=-=-=-=-=-=-=-=-=-=-=-

## Picking a Color

[ Picture Lab Activity 2 https://mathorama.com/apcs/pmwiki.php?n=Main.PictureLabActivity2 ]( https://mathorama.com/apcs/pmwiki.php?n=Main.PictureLabActivity2 ) 

4. How can you make pink?

5. How can you make yellow?

6. How can you make purple?

7. How can you make white?

8. How can you make dark gray?

-=-=-=-=-=-=-=-=-=-=-=-=-=-

## Exploring a Picture

[ Picture Lab Activity 3 https://mathorama.com/apcs/pmwiki.php?n=Main.PictureLabActivity3 ]( https://mathorama.com/apcs/pmwiki.php?n=Main.PictureLabActivity3 ) 

9. What is the row index for the top left corner of the picture?

10. What is the column index for the top left corner of the picture?

11. The width of this picture is 640. What is the right most column index?

12. The height of this picture is 480. What is the bottom most row index?

13. Does the row index increase from left to right or top to bottom?

14. Does the column index increase from left to right or top to bottom?

15. Gradually increase the zoom until you can see the squares of color. This is called pixelation. Pixelation means displaying a picture so magnified that the individual pixels look like small squares. At what amount of zoom can you see pixelation?

-=-=-=-=-=-=-=-=-=-=-=-=-=-

## Two-Dimensional Arrays in Java

[ Picture Lab Activity 4 https://mathorama.com/apcs/pmwiki.php?n=Main.PictureLabActivity4 ]( https://mathorama.com/apcs/pmwiki.php?n=Main.PictureLabActivity4 ) 

For the following exercises, write your code in IntArrayWorker.java then test your code. Copy/paste your code into QUESTIONS.txt when finished.

16. Exercise 4.1. Write a getCount(int i) method in the IntArrayWorker class that returns the count of the number of times the integer value i is found in the matrix. There is already a method to test this in IntArrayWorkerTester. Just uncomment the method testGetCount() (around line 25) and the call to it in the main method of IntArrayWorkerTester. Copy/paste your getCount method code here:


17. Exercise 4.2. Write a getLargest method in the IntArrayWorker class that returns the largest value in the matrix. There is already a method to test this in IntArrayWorkerTester. Just uncomment the method testGetLargest() (around line 55) and the call to it in the main method of IntArrayWorkerTester. Copy/paste your getLargest method code here:


18. Exercise 4.3. Write a getColTotal(int col) method in the IntArrayWorker class that returns the total of all integers in a specified column. There is already a method to test this in IntArrayWorkerTester (around line 80). Just uncomment the method testGetColTotal() and the call to it in the main method of IntArrayWorkerTester. Copy/paste your getColTotal method code here:


-=-=-=-=-=-=-=-=-=-=-=-=-=-

## Modifying a Picture

[ Picture Lab Activity 5 https://mathorama.com/apcs/pmwiki.php?n=Main.PictureLabActivity5 ]( https://mathorama.com/apcs/pmwiki.php?n=Main.PictureLabActivity5 ) 

19. Open Picture.java and look for the method getPixels2D. Is it there?

20. Open SimplePicture.java and look for the method getPixels2D. Is it there?

21. Does the following code compile? DigitalPicture p = new DigitalPicture();

22. Assuming that a no-argument constructor exists for SimplePicture, would the following code compile? DigitalPicture p = new SimplePicture();

23. Assuming that a no-argument constructor exists for Picture, does the following code compile? DigitalPicture p = new Picture();

24. Assuming that a no-argument constructor exists for Picture, does the following code compile? SimplePicture p = new Picture();

25. Assuming that a no-argument constructor exists for SimplePicture, does the following code compile? Picture p = new SimplePicture();


26. Exercise 5.3. Using the zeroBlue method as a starting point, write the method keepOnlyBlue that will keep only the blue values, that is, it will set the red and green values to zero. Create a class (static) method to test this new method in the class PictureTester. Be sure to call the new test method in the main method in PictureTester. Copy/paste your keepOnlyBlue method code here:


27. Exercise 5.4. Write the negate method to negate all the pixels in a picture. To negate a picture, set the red value to 255 minus the current red value, the green value to 255 minus the current green value and the blue value to 255 minus the current blue value. Create a class (static) method to test this new method in the class PictureTester. Be sure to call the new test method in the main method in PictureTester. Copy/paste your negate method code here:


28. Exercise 5.5. Write the grayscale method to turn the picture into shades of gray. Set the red, green, and blue values to the average of the current red, green, and blue values (add all three values and divide by 3). Create a class (static) method to test this new method in the class PictureTester. Be sure to call the new test method in the main method in PictureTester. Copy/paste your grayscale method code here:


29. Exercise 5.6. Add a new method named gradient that will gradually change a picture's colors. Use traditional for i loops and add or remove i. Copy/paste your gradient method code here:



