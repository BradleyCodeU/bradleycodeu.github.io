# Create Practice 3  

With your partner, create an app that stores a collection of things. Each thing has 3 or more details (key/value pairs).

Your collection is a list of dictionaries. [ { }, { }, { } ]

Each dictionary object has 3 or more key/value pairs. For example... "name":"Chipotle", "type":"mexican", "stars":4

Brainstorming app ideas...
- Fav Restaurants with name, type, stars
- Address Book with name, phone, bday
- Books with title, author, rating
- Pokedex
- Collectables (action figures, trading cards, etc)
- Jerseys
- Shoes
- Movies
- Games

=-=-=-=-=-=-=-

Features that the app could have...

- Main menu
- Display full list
- add new
- Search
- filter
- stats (how many? avg rating?)
- save to text file
- load from text file

=-=-=-=-=-=-=-

You MUST create a student-developed procedure/function that:
- Defines the procedure/function’s name and return type (if necessary)
- Contains and uses one or more parameters/arguments that have an effect on the functionality of the procedure/function
- Implements an algorithm that includes sequencing, selection, and iteration
- For example... a search function with argument(s), a filter function with argument(s), or a stats function with argument(s) that uses an if-statement to avoid division-by-zero.

=-=-=-=-=-=-=-

### Starter Code:
```
import json

def saveToFile(someList):
  json_object = json.dumps(someList, indent=4)
  #opens/creates text file
  file = open("savedstuff.txt","w") 
  file.write(json_object)
  file.close()

def loadFromFile():
  try:
    #opens text file, will crash if not found
    file  = open("savedstuff.txt","r")
    return json.loads(file.read())
  except:
    #file not found
    return []
```