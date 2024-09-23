import tkinter as tk
from tkinter import ttk



def validNumber(userInput):
    # your code goes here.
    # What's the lowest possible/highest possible human weight in pounds?
    return


def poundsToKilograms(pounds):
    #convert string to float
    #some math conversion, save the product in a variable named kilograms
    #return kilograms
    return


def kilogramsToPounds(kilograms):
    #convert string to float
    #some math conversion, save the product in a variable named pounds
    #return pounds
    return


def getWeightOnPlanet(planetNumber):
    popup = tk.Tk()
    answer = numberEntry.get()
    if validNumber(answer) == False:
        tk.Label(popup, text="INVALID NUMBER").pack()
        return False
    #call poundsToKilograms function, pass answer as argument, & save what it returns as earthWeight
    if planetNumber == 1:
        #planetWeight = earthWeight * planet1Gravity / earthGravity
        planetName = "Planet 1"  #change text once you choose your planets
    if planetNumber == 2:
        #planetWeight = earthWeight * planet2Gravity / earthGravity
        planetName = "Planet 2"  #change text once you choose your planets
    if planetNumber == 3:
        #planetWeight = earthWeight * planet3Gravity / earthGravity
        planetName = "Planet 3"  #change text once you choose your planets
    #call kilogramsToPounds function, pass planetWeight as argument, & save what it returns as answer
    output = planetName #use planetName & answer to say "Your weight on x is y lbs"
    tk.Label(popup, text=output).pack()


root = tk.Tk()
tk.Label(root,text="Welcome to my app! Please type your weight in pounds:").pack()
numberEntry = ttk.Entry(root)
numberEntry.pack()
ttk.Button(root, text="Planet 1", command=lambda: getWeightOnPlanet(1)).pack()  #change text once you choose your planets
ttk.Button(root, text="Planet 2", command=lambda: getWeightOnPlanet(2)).pack()  #change text once you choose your planets
ttk.Button(root, text="Planet 3", command=lambda: getWeightOnPlanet(3)).pack()  #change text once you choose your planets
tk.mainloop()
