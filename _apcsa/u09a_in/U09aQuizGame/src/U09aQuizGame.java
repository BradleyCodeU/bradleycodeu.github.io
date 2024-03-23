import javax.swing.SwingUtilities;

public class U09aQuizGame {
    public static void main(String[] args) {
        // Polymorphism!!!!! Add all of your questions to the Question[] questions.
        Question[] questions = {
                new Question("What is the capital of France?", "Paris", 10),
                new SelectAllQuestion("Select all that are birds:", new String[]{"Bat","Chicken","Mallet","Mallard"}, new String[]{"Chicken","Mallard"}, 10),
                new TrueFalseQuestion("3 * 3 * 3 = 9", false, 10),
                new TrueFalseQuestion("4! = 4 * 3 * 2 * 1", true, 10),
                new MultipleChoiceQuestion("What is 2 * 2?", "4",new String[]{"22","44","4","2"}, 10),
                new Question("What is 2 + 2?", "4", 10),
                new Question("Who wrote 'So Long, and Thanks for All the Fish (The Hitchhiker's Guide to the Galaxy, #4)'?", "Adams", 10),
                new Question("Who wrote 'Romeo and Juliet'?", "Shakespeare", 10)
        };

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Quiz(questions);
            }
        });
    }
}
