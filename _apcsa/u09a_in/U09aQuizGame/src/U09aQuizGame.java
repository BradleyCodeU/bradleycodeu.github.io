public class U09aQuizGame {
    public static void main(String[] args) {
        // Sample questions
        Question[] questions = {
                new Question("What is the capital of France?", "Paris", 10),
                new Question("What is 2 + 2?", "4", 10),
                new Question("Who wrote 'So Long, and Thanks for All the Fish (The Hitchhiker's Guide to the Galaxy, #4)'?", "Adams", 10),
                new Question("Who wrote 'Romeo and Juliet'?", "Shakespeare", 10)
                
        };

        Quiz quiz = new Quiz(questions);
    }
}
