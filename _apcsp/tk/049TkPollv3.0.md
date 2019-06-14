Duplicate your Tkinter Poll v2 file.

Data will be loaded from and saved to a text file for backup.

You will add 4 additional questions that can be answered with a number.

In order to store this information you will create a dictionary that contains dictionaries.
```python
data = {
    "Alice": {"question1":"q1answer", "question2":"q2answer"},
    "Bob": {"question1":"q1answer", "question2":"q2answer"},
    "Carol": {"question1":"q1answer", "question2":"q2answer"}
}
```
For example...

The 1st person's name is Alice

We add Alice as a key to the dictionary called data and give Alice a value of { }

The first question answer will be stored like this... data["Alice"]["question1"] = q1answer

When the Average button is pressed, calculate the average for all question1 answers, all question2 answers, etc.

Your final line of code must be mainloop(). This allows someone to simply click on your file and run your app. mainloop works kind of like a game loop that keeps the app running.
```python
mainloop() #include me as last line!!!
```
