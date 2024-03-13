import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.io.IOException;
import javax.imageio.ImageIO;

import java.net.URL;

public class BirdReviewApp extends JFrame {
    private JLabel questionTextLabel;
    private JComboBox<String> dropdown;

    private List<Object> questions; // Assuming Bird class is defined

    private int currentQuestion = 173;
    private String randomSeed = String.valueOf(new Date().getTime());
    private int numberOfOptions = 6;
    private JLabel imageLabel;
    private double imageScale = 0.8;

    public BirdReviewApp() {
        // Initialize Swing components
        setTitle("Bird Review");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        add(mainPanel);

        // JLabel windowLocationLabel = new JLabel("Study Game");
        // windowLocationLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        // mainPanel.add(windowLocationLabel);

        // JButton nextButton = new JButton("Menu");
        // nextButton.setAlignmentX(JButton.CENTER_ALIGNMENT);
        // nextButton.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         // Handle nextButton click event
        //         // Example: document.location='index.html'
        //         System.out.println("Menu button clicked.");
        //     }
        // });
        // mainPanel.add(nextButton);

        

        // questionTextLabel = new JLabel("Question Text");
        // questionTextLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        // questionPanel.add(questionTextLabel);

        imageLabel = new JLabel();
        imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(imageLabel); // Add the image label to your Swing component hierarchy

        // Load and display the image
        loadImageFromURL("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Cardinalis_cardinalis_%28Northern_Cardinal%29_63.jpg/640px-Cardinalis_cardinalis_%28Northern_Cardinal%29_63.jpg");

        JPanel questionPanel = new JPanel();
        questionPanel.setAlignmentX(JPanel.CENTER_ALIGNMENT);
        questionPanel.setLayout(new BoxLayout(questionPanel, BoxLayout.Y_AXIS));
        mainPanel.add(questionPanel);

        dropdown = new JComboBox<>();
        dropdown.setAlignmentX(JComboBox.CENTER_ALIGNMENT);
        dropdown.addItem("pick one:");
        for (int i = 0; i < 6; i++) {
            dropdown.addItem("");
        }
        dropdown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle dropdown selection event
                // Example: checkAnswer(this.value)
                JComboBox<String> cb = (JComboBox<String>) e.getSource();
                String selectedOption = (String) cb.getSelectedItem();
                System.out.println("Selected option: " + selectedOption);
                checkAnswer(selectedOption);
            }
        });
        questionPanel.add(dropdown);

        JButton filterButton = new JButton("Filter");
        filterButton.setAlignmentX(JButton.CENTER_ALIGNMENT);
        filterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle filterButton click event
                // Example: $('#mymodal').modal('show');
                System.out.println("Filter button clicked.");
            }
        });
        mainPanel.add(filterButton);

        setVisible(true);

        // Load questions from JSON
        // Assuming you have a method like loadQuestionsFromJSON(String filename) here
        File file = new File("bin/gbif.json");

        questions = JsonLoader.loadBirdsFromJson(file);
        shuffle(questions, randomSeed);
        // for(Bird each : questions){
        //     System.out.println(each.getCommonName());
        // }
        // System.out.println(questions.size());

        // Generate or load random seed
        if (randomSeed.isEmpty()) {
            randomSeed = getRandomSeed();
        }

        // Display the first question
        loadQuestion(randomSeed + currentQuestion);
    }

    private void loadImageFromURL(String imageURL) {
        try {
            URL url = new URL(imageURL);
            BufferedImage originalImage = ImageIO.read(url);
    
            // Get the size of the window
            int windowWidth = getWidth();
            int windowHeight = getHeight();
    
            // Get the dimensions of the original image
            int imageWidth = originalImage.getWidth();
            int imageHeight = originalImage.getHeight();
    
            // Calculate the scaling factors for width and height
            double widthScale = (double) windowWidth * this.imageScale / imageWidth;
            double heightScale = (double) windowHeight* this.imageScale / imageHeight;
    
            // Use the smaller scale factor to maintain aspect ratio
            double scaleFactor = Math.min(widthScale, heightScale);
    
            // Calculate the scaled dimensions
            int scaledWidth = (int) (imageWidth * scaleFactor);
            int scaledHeight = (int) (imageHeight * scaleFactor);
    
            // Scale the original image to the new dimensions
            Image scaledImage = originalImage.getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);
    
            // Create an ImageIcon from the scaled image
            ImageIcon icon = new ImageIcon(scaledImage);
    
            // Set the ImageIcon to the imageLabel
            imageLabel.setIcon(icon);
        } catch (IOException e) {
            e.printStackTrace();
            // Handle image loading error
            JOptionPane.showMessageDialog(this, "Error loading image: " + e.getMessage(), "Image Loading Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    

    private void loadQuestion(String mySeed) {
        // Display question using Swing components
        // Assuming you have methods to set images and options on your Swing components
        Bird tempBird = (Bird) questions.get(currentQuestion % questions.size());
        ArrayList<String> pics = tempBird.getImages();
        if(pics.size() > 0){
            loadImageFromURL(pics.get(currentQuestion % pics.size()));
            // Load answers
            loadAnswers();
        } else {
            currentQuestion++;
            loadQuestion(randomSeed);
        }
    }

    // Other methods for handling actions, loading questions, etc.
    private void loadAnswers() {
        Random random = new Random(Long.parseLong(randomSeed));
        List<String> answers = new ArrayList<>();
        Bird tempBird1 = (Bird) questions.get(currentQuestion % questions.size());
        answers.add(tempBird1.getCommonName());

        // Check in case we filtered
        if (questions.size() < numberOfOptions) {
            numberOfOptions = questions.size();
        }

        while (answers.size() < numberOfOptions) {
            boolean flag = false;
            //Random randomMillis = new Random(new Date().getTime());
            Bird tempBird = (Bird) questions.get(random.nextInt(questions.size()));
            String newAnswer = tempBird.getCommonName();

            for (String answer : answers) {
                if (answer.equalsIgnoreCase(newAnswer)) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                answers.add(newAnswer);
            }
        }

        List<Object> answers2 = new ArrayList<>(answers);
        // Assuming you have a shuffle method for shuffling the answers
        shuffle(answers2, String.valueOf(new Date().getTime()));

        // Clear existing options in the dropdown
        dropdown.removeAllItems();
        dropdown.addItem("pick one:");
        // Add answers to the dropdown
        for (Object answer : answers2) {
            dropdown.addItem((String) answer);
        }
    }



    private void checkAnswer(String value) {
        Bird tempBird = (Bird) questions.get(currentQuestion % questions.size());
        String correctAnswer = tempBird.getCommonName().toLowerCase();
    
        if (value != null && value.equalsIgnoreCase(correctAnswer)) {
            // Correct answer behavior
            currentQuestion++;
            //localStorage.setItem("currentquestion", Integer.toString(currentQuestion));
            loadQuestion(randomSeed + currentQuestion);
        } else {
            // Incorrect answer behavior
        }
    }
    

    private String getRandomSeed() {
        String r = String.valueOf(new Date().getTime());
        //Random random = new Random(Long.parseLong(r));
        return r;
    }

    private void shuffle(List<Object> list, String seed) {
        Random random = new Random(seed.hashCode());
        for (int i = list.size() - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            Object temp = list.get(index);
            list.set(index, list.get(i));
            list.set(i, temp);
        }
    }

    

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BirdReviewApp();
            }
        });
    }
}
