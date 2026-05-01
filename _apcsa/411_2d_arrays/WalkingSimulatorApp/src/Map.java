

public class Map {
    // This class handles the "geography" of the game and manages a grid of Location objects.

    // Private Instance Variable:

    //     - Location[][] grid: A 2D array of Location objects.

    // Constructor requires two parameters: numberRows, numberColumns

    //     - Initialize the Location[][] with numberRows and numberColumns.

    //     - Create a Scanner object that wraps a File object. For example... new Scanner(new File("locationStrings.txt"))

    //     - Use a nested for loop to instantiate a new Location(description) for every single index in the array. If you don't, your map will be full of null values

    //         - Inside the loops, check if the file has another line using hasNextLine().

    //         - Assign grid[r][c] = new Location(fileScanner.nextLine());.

    // Methods:

    //     - int getRemaining(): Loop through the Location objects and count how many have getVisited() == false.

    //     - int getTotalRows(): Returns the total amount of rows in grid

    //     - int getTotalCols(): Returns the total amount of cols in grid

    //     - boolean isValid(int r, int c): Returns true if r is in range 0...getTotalRows()-1 and c is in range 0...getTotalCols()-1 and grid[r][c] != null

    //     - Location getLocation(int r, int c): Returns the Location object at those coordinates if isValid(r,c). Otherwise, returns null.

}
