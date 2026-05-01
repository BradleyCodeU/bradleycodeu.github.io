---
title: Walking Simulator App
layout: project
category: 411_2d_arrays
---

Create a program where a player navigates a 2D grid. The goal is to visit every single "tile" on the map. The game tracks which tiles have been visited and ends only when the entire map has been explored.
## Directions

### Add More Location Descriptions To locationStrings.txt

Before you code, check out the locationStrings.txt text file in your project folder. Each line should contain a single description. For a 5 x 5 grid, you will need 25 lines.

Currently there are 4 descriptions so that there will be a 2 x 2 grid.

Your grid MUST be larger than 2 x 2. Decide how large your grid will be, then add more descriptions to this file.

### Create The Location Class

Represents a single square on the map.

Private Instance Variables:

    - String description: A flavor text description (e.g., "A dusty old library" or "A sun-drenched meadow").

    - boolean hasVisited: Tracks if the player has been here.

Constructor: Takes a String argument to set the description. hasVisited should default to false.

Methods:

    - String getDescription(): Returns the description.

    - boolean getVisited(): Returns the visited status.

    - void setVisited(boolean status): Updates the visited status.

### Create The Map Class
This class handles the "geography" of the game and manages a grid of Location objects.

Private Instance Variable:

    - Location[][] grid: A 2D array of Location objects.

Constructor requires two parameters: numberRows, numberColumns

    - Initialize the Location[][] with numberRows and numberColumns.

    - Create a Scanner object that wraps a File object. For example... new Scanner(new File("locationStrings.txt"))

    - Use a nested for loop to instantiate a new Location(...) for every single index in the array. If you don't, your map will be full of null values

        - Inside the loops, check if the file has another line using hasNextLine().

        - Assign grid[r][c] = new Location(fileScanner.nextLine());.

Methods:

    - int getRemaining(): Loop through the Location objects and count how many have getVisited() == false.

    - Location getLocation(int r, int c): Returns the Location object at those coordinates if isValid(r,c). Otherwise, returns null.

    - int getNumberRows(): Returns the total amount of rows in grid

    - int getNumberCols(): Returns the total amount of cols in grid

    - boolean isValid(int r, int c): Returns true if r is in range 0...getNumberRows()-1 and c is in range 0...getNumberCols()-1

### Game Class

99% complete!

    - The ONLY thing you MUST do is update the size of the gameMap in the Game constructor.

### Walking Simulator App

Already completed for you!

    - Contains the public static typewriter method.

    - Contains public static void main.

The Game Loop:

At the start of the turn, get the Location object at the player's current row and col.

Print the result of getDescription() to the console so the player knows where they are.

Mark that location as visited: currentLoc.setVisited(true).

Prompt for movement as before.

### CHALLENGE

Change how the Map is constructed so that it's randomized.

Load all of the descriptions into an ArrayList of Strings named descriptionList.

Once all descriptions are loaded, use a nested loop to fill the map

Pick a random index location of descriptionList and use remove to grab it an add it to the map.

