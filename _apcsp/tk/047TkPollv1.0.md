Make a Tkinter poll that will store data in a dictionary and calculate the average answer. Create an empty dictionary called data like this...
```python 
data = { }
```
[Read this tutorial](https://www.python-course.eu/python3_dictionaries.php)  for more info about working with dictionaries

You should have already watched [Tk Lesson 4](https://drive.google.com/file/d/18mbOExKqetH_uKfzx0EoMf6QpucpWVGk/view) and learned about how to use Grid, Entry, and Messagebox
Setup your Tkinter GUI...

Create a text entry box that will ask for the person's name
Create a text entry box that will ask one question that can be answered with a number. For example...
How many slices of pizza do you eat per week?
How long does it usually take you to travel to school? Answer to the nearest minute.
What grade are you in?
How many siblings do you have?
What month were you born? Answer 1-12.
How many pair of shoes do you own?
How many hours of sleep per night do you usually get when you have school the next day?
How many different states have you visited?
How many hours a week you usually spend doing homework/studying?
How many pets do you own?
Create a Submit button
Create an Average button
When the user presses Submit...

Validate that the person's name is 1 character or longer. If the [length](https://www.jquery-az.com/python-3-len-function-get-string-length/) of the person's name is less than 1, display an error with messagebox.showerror("Box Title","Error message in middle of box").
Check to make sure the name is not already a key in the dictionary. If it is already in your dictionary, then display an error "that name already exists"
Validate that the answer is a number. If not, display an error with messagebox.showerror("Box Title","Error message in middle of box"). You might also want to make sure that their answer is not a negative number, not zero, less than 100, etc.
If all of those checks are valid, add a new key/value to the "data" dictionary. The key is the name and the value is the number.
When the user presses Average...

Report the total number of responses. Display the number of responses in a messagebox: messagebox.showinfo("Box Title","Informative message in middle of box")
IF THERE ARE MORE THAN ZERO RESPONSES, calculate the average answer by adding together all of the values and dividing by the size of the dictionary. Display the average in a messagebox: messagebox.showinfo("Box Title","Informative message in middle of box")
Your final line of code must be **mainloop()**. This allows someone to simply click on your file and run your app. mainloop works kind of like a game loop that keeps the app running.
```python
mainloop() #include me as last line!!!
```
