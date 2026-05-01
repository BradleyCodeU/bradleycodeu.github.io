

public class Map {
    // This class handles the "geography" of the game and manages a grid of Location objects.

    // Private Instance Variable:

    //     - Location[][] grid: A 2D array of Location objects.

    // Constructor:

    //     - Initialize the Location[][] with specific dimensions.

    //     - Create a Scanner object that wraps a File object. For example... new Scanner(new File("locationStrings.txt"))

    //     - Use a nested for loop to instantiate a new Location(description) for every single index in the array. If you don't, your map will be full of null values

    //         - Inside the loops, check if the file has another line using hasNextLine().

    //         - Assign grid[r][c] = new Location(fileScanner.nextLine());.

    // Methods:

    //     - int getRemaining(): Loop through the Location objects and count how many have getVisited() == false.

    //     - Location getLocation(int r, int c): Returns the Location object at those coordinates.

}
