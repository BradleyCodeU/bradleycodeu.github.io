import tkinter as tk

# define a new function called validNumber that requires one
# argument: myNumber. Returns True or False




def launchPopup():
  popup = tk.Tk()
  answer = numberEntry.get()
  output = "Hello there " + answer
  #if validNumber(answer) is True, then
  #     # Set output to be answer "is a valid number. Thanks!"
  #     output = ???
  #if validNumber(answer) is False, then
  #     # Set output to be answer "is NOT valid number. OOPS!"
  #     output = ???
  tk.Label(popup, text=output).pack()


# Write TWO tests of validNumber function. Print your arguments, expected, and actual

# Test ONE

# Test TWO


# FINALLY, change the tk.Label below so that the text says “What year were you born?” OR whatever question you choose earlier.

root = tk.Tk()
tk.Label(root, text="Welcome to my app! Click the button.").pack()
numberEntry = tk.Entry(root)
numberEntry.pack()
tk.Button(root, text="Click Me", command=launchPopup).pack()
tk.mainloop()