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

    private List<Bird> questions; // Assuming Bird class is defined

    private int currentQuestion = 0;
    private String randomSeed = "";
    private int numberOfOptions = 6;
    private JLabel imageLabel;

    public BirdReviewApp() {
        // Initialize Swing components
        setTitle("Bird Review");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        add(mainPanel);

        JLabel windowLocationLabel = new JLabel("Study Game");
        windowLocationLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        mainPanel.add(windowLocationLabel);

        JButton nextButton = new JButton("Menu");
        nextButton.setAlignmentX(JButton.CENTER_ALIGNMENT);
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle nextButton click event
                // Example: document.location='index.html'
                System.out.println("Menu button clicked.");
            }
        });
        mainPanel.add(nextButton);

        JPanel questionPanel = new JPanel();
        questionPanel.setAlignmentX(JPanel.CENTER_ALIGNMENT);
        questionPanel.setLayout(new BoxLayout(questionPanel, BoxLayout.Y_AXIS));
        mainPanel.add(questionPanel);

        questionTextLabel = new JLabel("Question Text");
        questionTextLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        questionPanel.add(questionTextLabel);

        imageLabel = new JLabel();
        imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(imageLabel); // Add the image label to your Swing component hierarchy

        // Load and display the image
        loadImageFromURL("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Cardinalis_cardinalis_%28Northern_Cardinal%29_63.jpg/640px-Cardinalis_cardinalis_%28Northern_Cardinal%29_63.jpg");


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
            BufferedImage image = ImageIO.read(url);
            ImageIcon icon = new ImageIcon(image);
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

        // Load answers
        loadAnswers();
    }

    // Other methods for handling actions, loading questions, etc.
    private void loadAnswers() {
        Random random = new Random(Long.parseLong(randomSeed));
        List<String> answers = new ArrayList<>();
        answers.add(questions.get(currentQuestion % questions.size()).getCommonName());

        // Check in case we filtered
        if (questions.size() < numberOfOptions) {
            numberOfOptions = questions.size();
        }

        while (answers.size() < numberOfOptions) {
            boolean flag = false;
            Random randomMillis = new Random(new Date().getTime());
            String newAnswer = questions.get(random.nextInt(questions.size())).getCommonName().toLowerCase();

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

        List<String> answers2 = new ArrayList<>(answers);
        // Assuming you have a shuffle method for shuffling the answers
        shuffle(answers2, String.valueOf(new Date().getTime()));

        // Update options in Swing components
        // Assuming you have methods to update options in your Swing components
    }

    private void loadImage(String imagePath) {
        try {
            BufferedImage image = ImageIO.read(new File(imagePath));
            ImageIcon icon = new ImageIcon(image);
            imageLabel.setIcon(icon);
        } catch (IOException e) {
            e.printStackTrace();
            // Handle image loading error
        }
    }

    private void checkAnswer(String value) {
        String correctAnswer = questions.get(currentQuestion % questions.size()).getCommonName().toLowerCase();

        if (value.equalsIgnoreCase(correctAnswer)) {
            // Correct answer behavior
            currentQuestion++;
            loadQuestion(randomSeed + currentQuestion);
        } else {
            // Incorrect answer behavior
        }
    }

    private String getRandomSeed() {
        String r = String.valueOf(new Date().getTime());
        Random random = new Random(Long.parseLong(r));
        return r;
    }

    private void shuffle(List<String> list, String seed) {
        Random random = new Random(seed.hashCode());
        for (int i = list.size() - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            String temp = list.get(index);
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
