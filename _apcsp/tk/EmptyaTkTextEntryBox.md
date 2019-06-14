<p>How do you empty a Text Entry Box in Tkinter?</p>
<p>Let's create a text entry box and call it textbox1:</p>
<pre>Label(root, text="Name:").grid(row=0,column=0)
textbox1 = Entry(root)
textbox1.grid(row=0, column=1)</pre>
<p>Next, add a button and a function that "gets" what has been typed in the text entry box:</p>
<pre>def submitName():
    name = textbox1.get()

button = Button(root,text = "Submit", command = submitName)
button.grid(row = 1, column = 0)</pre>
<p>Finally, use the name of the text entry box and delete(0,END) to clear the text entry:</p>
<pre>def submitName():
    name = textbox1.get()
    <strong>textbox1.delete(0, END)
</strong></pre>
