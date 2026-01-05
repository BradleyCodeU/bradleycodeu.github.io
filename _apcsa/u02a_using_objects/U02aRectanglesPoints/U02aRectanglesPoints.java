public class U02aRectanglesPoints {
  public static void main(String[] args) {
    // Check out the Rectangle class in the Java API:

    // https://docs.oracle.com/javase/7/docs/api/index.html?java/awt/Rectangle.html

    // You will create ONE class with one public static void main() that contains
    // code for the following 5 exercises.

    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

    // Part 1 of 5
    System.out.println("Part 1 of 5 -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

    // TODO: Write a program that:

    // Constructs a Rectangle object.
    // Prompt the user for a width and height.
    // Use the setSize method to adjust the width and height of your Rectangle
    // object.
    // Use the grow method to grow the width by 10 and grow the height by 10.
    // For example... boxOne.grow(10,10);
    // Print the new width using the getWidth method.
    // Print the new height using the getHeight method.
    // Finally, compute and print its new area using the getWidth and getHeight
    // methods.

    // Sample Output

    // Part 1 of 5 -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
    // Please enter the width and height of the rectangle as whole numbers
    // Width: 5
    // Height: 6
    // After growing the width by 10 and the height by 10...
    // New width is 25.0
    // New height is 26.0
    // New area is 650.0

    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

    // Part 2 of 5
    System.out.println("Part 2 of 5 -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

    // Look into the API documentation of the Rectangle class and locate the method

    // boolean contains(int x, int y)

    // TODO: Construct a new Rectangle named mysteryBox at any x,y location (your choice!)
    // with a width of 20 and a height of 30.

    // Prompt the user for an x location
    // Prompt the user for a y location
    // Print mysteryBox.contains(x,y)
    // Finally, print mysteryBox to reveal the x, y, width, and height

    // Sample Output (your mysteryBox should be at a different location)

    // Part 2 of 5 -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
    // Please type x location: 15
    // Please type y location: 17
    // true
    // java.awt.Rectangle[x=9,y=10,width=20,height=30]

    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

    // Part 3 of 5
    System.out.println("Part 3 of 5 -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

    // Double the height and width.

    // TODO: Construct a Rectangle object named doubleSquare representing a square with
    // top-left corner (100, 100) and side length 50, then print its location by
    // calling System.out.println(doubleSquare). Use the translate and grow methods
    // to make the square twice the size and move it to location (300,400). Finally,
    // call System.out.println(doubleSquare) again.

    // This code will not produce a drawing. It will simply print the locations of
    // square before and after calling the mutator methods.

    // Look up the description of the grow method in the API documentation.

    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

    // Part 4 of 5
    System.out.println("Part 4 of 5 -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

    // Halve the width only.

    // TODO: Construct a Rectangle object named halfWidthSquare representing a square with
    // top-left corner (55, 55) and side length 600, then print its location by
    // calling System.out.println(halfWidthSquare). Use the translate and grow
    // methods to make the square half the width and move it to location (55,0).
    // Finally, call System.out.println(halfWidthSquare) again.

    // This code will not produce a drawing. It will simply print the locations of
    // square before and after calling the mutator methods. Look up the description
    // of the grow method in the API documentation.

    // Part 5 of 5
    System.out.println("Part 5 of 5 -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

    // https://docs.oracle.com/javase/7/docs/api/java/awt/Point.html

    // Look at the API of the Point class and find out how to construct a Point
    // object.
    // TODO: Construct two points with coordinates (3, 4) and (–3, –4). Find the distance
    // between them, using the distance method (which is available because it is
    // inherited from a different class). Print your prediction and then the
    // calculated distance.

  }
}