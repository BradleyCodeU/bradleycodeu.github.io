# Foobar Game

Working as team, create your own text game based on Foobar The Bazbarian [https://foobargame.glitch.me/](https://foobargame.glitch.me/)

Start by figuring out a story/theme/setting and title for your game

Plan a map on a grid. It might be a maze-like dungeon or a large open island or a house with rooms and hallways. You will plan a dozen blocks of the grid. We will call these blocks "rooms." Each of these rooms must have a unique description, NOT just "you're in a room"

|     |   |   |   |
|---  |---|---|---|
| 0   | 1 | 2 | 3 |
| 100 |101|102|103|
| 200 |201|202|203|
| 300 |301|302|303|

REQUIREMENTS:

  * Group of 3 = 12 rooms, at least 6 items
  * Group of 4 = 16 rooms, at least 8 items
  * An item is something that the player can pick up like a new weapon, a health pack, coins, a potion, some food, a fidget-spinner, etc.
  * Define a function called makeRoom that returns a dictionary. Each room dictionary has:
    - a name
    - a description
    - an item (but the item might be set to ```None``` if there is no item in this room)
    - 3 or 4 other attributes (based on how many members in your group)
  * Create an array named roomArray that stores your room objects
  * Use a for loop to add `None` to the array 1000 times
  * Add your 12-16 rooms to your roomArray at the correct index locations. Make sure each room has a name, good description, etc.
  * In version 1, the player does NOT need to be able to pick up any items, but when visiting a room the game MUST tell you that an item is there IF the room contains an item.
  * Create a variable named gps that stores the current room number.
  * Must be able to change rooms and give a message like "You can't go there" when necessary.


Define a function named `doesRoomExist` that requires 2 arguments: roomArray, roomNumber. If roomArray index roomNumber is None then say "You can't go there" and return False. Otherwise return True.



Define a function named move that requires 3 argument: roomArray, gps, direction. Returns an int, gps.

    - If the direction was "n" and `doesRoomExist` at the gps - 100
        - gps = gps - 100
    - Otherwise if the direction was "s" and `doesRoomExist` at the gps + 100
        - gps = gps + figure this part out yourself
    - Otherwise if the direction was "e" and `doesRoomExist` at the gps + 1
        - figure this part out yourself
    - Otherwise if the direction was "w" and figure this part out yourself
        - figure this part out yourself
    - return gps


Define a function named main.

- Create a variable named gps and set it to the starting room number
- Say the title of your game
- Say "Created By: " and then your names
- Sleep for 1 sec
- Create a forever loop
  - Say the room description for gps
  - Say "Item here: " and the item name
  - Say "Please type: n, s, e, w, or quit"
  - Save the input in a variable named userInput
  - Call the move function and pass 3 arguments: roomArray, userInput, and gps. Save what it returns in gps


## Tests

||Expected Output|
|---|---|
|x = makeRoom()<br>type(x) is dict|True|
|roomArray1 = [{'name':'Kitchen'}, None, None]<br>doesRoomExist(roomArray1, 0)|True|
|roomArray1 = [{'name':'Kitchen'}, None, None]<br>doesRoomExist(roomArray1, 2)|False|
|roomArray1 = [{'name':'Kitchen'}, None, None]<br>doesRoomExist(roomArray1, 9999)|False|
|roomArray2 = [{'name':'Kitchen'}, {'name':'Hallway'}, None]<br>move(roomArray2, gps=1, direction="n")|1|
|roomArray2 = [{'name':'Kitchen'}, {'name':'Hallway'}, None]<br>move(roomArray2, gps=0, direction="s")|0|
|roomArray2 = [{'name':'Kitchen'}, {'name':'Hallway'}, None]<br>move(roomArray2, gps=0, direction="e")|1|
|roomArray2 = [{'name':'Kitchen'}, {'name':'Hallway'}, None]<br>move(roomArray2, gps=1, direction="w")|0|




