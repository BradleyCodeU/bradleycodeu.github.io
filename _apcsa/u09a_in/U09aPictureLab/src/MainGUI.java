import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainGUI
{
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Java App Launcher");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(4, 1, 10, 10));

        // Create buttons
        JButton colorChooserButton = new JButton("Color Chooser");
        JButton pictureExplorerButton = new JButton("Picture Explorer");
        JButton pictureTesterButton = new JButton("Picture Tester");
        JButton intArrayWorkerButton = new JButton("Int Array Worker Tester");

        // Add action listeners
        colorChooserButton.addActionListener((ActionEvent e) -> {
            ColorChooser.main(new String[]{});
        });

        pictureExplorerButton.addActionListener((ActionEvent e) -> {
            PictureExplorer.main(new String[]{});
        });

        pictureTesterButton.addActionListener((ActionEvent e) -> {
            PictureTesterGUI.main(new String[]{});
        });

        intArrayWorkerButton.addActionListener((ActionEvent e) -> {
            IntArrayWorkerTester.main(new String[]{});
        });

        // Add buttons to frame
        frame.add(colorChooserButton);
        frame.add(pictureExplorerButton);
        frame.add(pictureTesterButton);
        frame.add(intArrayWorkerButton);

        // Center and show the frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
