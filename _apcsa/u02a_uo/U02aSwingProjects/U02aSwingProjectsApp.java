import java.awt.*;
import java.awt.Rectangle;
import javax.swing.*;
import javax.swing.ImageIcon;
import java.net.URI;
import java.net.URL;

public class U02aSwingProjectsApp {

  public static void main(String[] args) throws Exception {

    JOptionPane.showMessageDialog(null, "Hello World");

    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
    // Part 1 of 4
    System.out.println("Part 1 of 4 -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

    // Run the following. TODO: modify it to print “Hello, name!”, displaying the
    // name that the user typed in.

    String name = JOptionPane.showInputDialog("What is your name?");
    System.out.println(name);

    // In addition to saying “Hello, name!” in the console, can you say "Hello,
    // name!" in a JOptionPane MessageDialog?
    // TODO: say "Hello, name!" in a JOptionPane MessageDialog

    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
    // Part 2 of 4
    System.out.println("Part 12 of 4 -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

    // TODO: Write code so that the dialog continues with the message
    // “My name is Hal! What would you like me to do?” Discard the user’s input and
    // display a message such as I'm sorry, Dave. I'm afraid I can't do that.
    // Replace Dave with the name that was provided by the user. Display the "I'm
    // sorry" message using a JOptionPane MessageDialog.

    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
    // Part 3 of 4
    System.out.println("Part 3 of 4 -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

    // Run the following. TODO: modify it to show a different greeting and image.

    // If you have trouble finding an image that works, try searching Wikimedia for
    // an image https://commons.wikimedia.org/wiki/Main_Page

    URI imageUri = new URI("https://upload.wikimedia.org/wikipedia/en/d/d7/Dukesource125.gif");
    URL imageLocation = imageUri.toURL();
    ImageIcon icon = new ImageIcon(imageLocation);
    JOptionPane.showMessageDialog(null, "Hello", "Title",
        JOptionPane.PLAIN_MESSAGE, icon);

    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
    // Part 4 of 4
    System.out.println("Part 4 of 4 -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

    // In this exercise, you will explore a simple way of visualizing a Rectangle
    // object. The setBounds method of the JFrame class moves a frame window to a
    // given rectangle. Complete the following program to visually show the
    // translate method of the Rectangle class.

    // **NOTE**: In computer science, the y-axis is inverted and 0,0 is in the
    // top-left corner of the screen.

    // Construct a frame and show it
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    // TODO: Construct a rectangle and set the frame bounds

    JOptionPane.showMessageDialog(frame, "Click OK to move the box");
    // TODO: Move the rectangle and set the frame bounds again

    JOptionPane.showMessageDialog(frame, "Click OK to move the box AGAIN!!!!!");
    // TODO: Translate the rectangle again and set the frame bounds
    // again

  }
}
