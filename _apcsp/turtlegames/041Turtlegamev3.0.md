This is NOT a group project

Once you're finished with Turtle game v2.0... **DUPLICATE YOUR GAME**, rename it v3.

You have much more freedom with this game. You can change the controls so that (instead of rotating) left makes the player move West, up makes the player move North, etc. You can go back to a 1 player game or keep it 2 players (co-operative or competitive), get rid of the following enemies or keep them, and get rid of the coins or change how coins work. The only requirements are the ones listed below.

Here are the required features...

Create a function called reset() and use it to add MORE enemies, reset enemy locations, reset the player location, reset coins, etc. Do NOT reset scores.
MUST increase the speed of the game with each level. Players and enemies will move forward slightly faster each round. You should probably make players rotate faster too.
Players and enemies cannot go out of bounds. If they do... they either wrap around, change their heading, or reset the level. Your choice. You can either use [.position() or .pos()](https://docs.python.org/3.3/library/turtle.html?highlight=turtle#turtle.position). to get both the xy coordinates OR use [.xcor() and .ycor()](https://docs.python.org/3.3/library/turtle.html?highlight=turtle#turtle.xcor). to get each separate coordinate.
Create one or more "guards." A guard is an enemy that follows a set route (for example, walking back and forth next to the goal) and will kill either player if it touches them.
Have a writer Turtle that writes the current Level on the screen. For example, "Level 1"
