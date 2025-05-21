import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class PictureTesterGUI {
    private static final String[] imagePaths = {
        "images/beach.jpg",
        "images/arch.jpg",
        "images/blue-mark.jpg",
        "images/blueMotorcycle.jpg",
        "images/butterfly1.jpg",
        "images/caterpillar.jpg",
        "images/CumberlandIsland.jpg",
        "images/femaleLionAndHall.jpg",
        "images/flower1.jpg",
        "images/flower2.jpg",
        "images/gorge.jpg",
        "images/koala.jpg",
        "images/moon-surface.jpg",
        "images/msg.jpg",
        "images/redMotorcycle.jpg",
        "images/robot.jpg",
        "images/seagull.jpg",
        "images/snowman.jpg",
        "images/swan.jpg",
        "images/temple.jpg",
        "images/thruDoor.jpg"
    };

    private static String getSelectedImage(JComboBox<String> imageSelector) {
        return (String) imageSelector.getSelectedItem();
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Picture Tester");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLayout(new BorderLayout());

        JPanel controlPanel = new JPanel(new BorderLayout());
        JComboBox<String> imageSelector = new JComboBox<>(imagePaths);
        controlPanel.add(new JLabel("Select an image: "), BorderLayout.WEST);
        controlPanel.add(imageSelector, BorderLayout.CENTER);
        frame.add(controlPanel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(0, 2, 5, 5));

        JButton displayButton = new JButton("Display");
        displayButton.addActionListener((ActionEvent e) -> {
            Picture pic = new Picture(getSelectedImage(imageSelector));
            pic.explore();
        });

        JButton gradientButton = new JButton("Gradient");
        gradientButton.addActionListener((ActionEvent e) -> {
            Picture pic = new Picture(getSelectedImage(imageSelector));
            pic.explore();
            pic.gradient();
            pic.explore();
        });

        JButton zeroBlueButton = new JButton("Zero Blue");
        zeroBlueButton.addActionListener((ActionEvent e) -> {
            Picture pic = new Picture(getSelectedImage(imageSelector));
            pic.explore();
            pic.zeroBlue();
            pic.explore();
        });

        JButton keepOnlyRedButton = new JButton("Keep Only Red");
        keepOnlyRedButton.addActionListener((ActionEvent e) -> {
            Picture pic = new Picture(getSelectedImage(imageSelector));
            pic.explore();
            //pic.keepOnlyRed();
            pic.explore();
        });

        JButton keepOnlyGreenButton = new JButton("Keep Only Green");
        keepOnlyGreenButton.addActionListener((ActionEvent e) -> {
            Picture pic = new Picture(getSelectedImage(imageSelector));
            pic.explore();
            //pic.keepOnlyGreen();
            pic.explore();
        });

        JButton keepOnlyBlueButton = new JButton("Keep Only Blue");
        keepOnlyBlueButton.addActionListener((ActionEvent e) -> {
            Picture pic = new Picture(getSelectedImage(imageSelector));
            pic.explore();
            //pic.keepOnlyBlue();
            pic.explore();
        });

        JButton negateButton = new JButton("Negate");
        negateButton.addActionListener((ActionEvent e) -> {
            Picture pic = new Picture(getSelectedImage(imageSelector));
            pic.explore();
            //pic.negate();
            pic.explore();
        });

        JButton grayscaleButton = new JButton("Grayscale");
        grayscaleButton.addActionListener((ActionEvent e) -> {
            Picture pic = new Picture(getSelectedImage(imageSelector));
            pic.explore();
            //pic.grayscale();
            pic.explore();
        });

        //testFixUnderwater();

        JButton mirrorVerticalButton = new JButton("Mirror Vertical");
        mirrorVerticalButton.addActionListener((ActionEvent e) -> {
            Picture pic = new Picture(getSelectedImage(imageSelector));
            pic.explore();
            pic.mirrorVertical();
            pic.explore();
        });

        JButton collageButton = new JButton("Collage");
        collageButton.addActionListener((ActionEvent e) -> {
            Picture canvas = new Picture("images/640x480.jpg");
            canvas.createCollage();
            canvas.explore();
        });

        //testCopy();

        JButton edgeDetectButton = new JButton("Edge Detection");
        edgeDetectButton.addActionListener((ActionEvent e) -> {
            Picture pic = new Picture(getSelectedImage(imageSelector));
            pic.edgeDetection(10);
            pic.explore();
        });

        //testChromakey();
        //testEncodeAndDecode();
        //testGetCountRedOverValue(250);
        //testSetRedToHalfValueInTopHalf();
        //testClearBlueOverValue(200);
        //testGetAverageForColumn(0);

        // Add buttons to the panel
        buttonPanel.add(displayButton);
        buttonPanel.add(gradientButton);
        buttonPanel.add(zeroBlueButton);
        buttonPanel.add(keepOnlyRedButton);
        buttonPanel.add(keepOnlyGreenButton);
        buttonPanel.add(keepOnlyBlueButton);
        buttonPanel.add(negateButton);
        buttonPanel.add(grayscaleButton);
        buttonPanel.add(mirrorVerticalButton);
        buttonPanel.add(collageButton);
        buttonPanel.add(edgeDetectButton);

        frame.add(buttonPanel, BorderLayout.CENTER);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Run GUI on the Event Dispatch Thread
        SwingUtilities.invokeLater(PictureTesterGUI::createAndShowGUI);
    }
}
