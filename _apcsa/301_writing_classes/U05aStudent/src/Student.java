
public class Student {
    private int totalQuizScore;

    public Student(String name) {
        // TODO
    }

    public void addQuiz(int score) {
        // NOTE: Adds score to the total quiz score AND adds 1 to the counter
        totalQuizScore += score;
        // TODO add 1 to the counter
    }

    public String getName() {
        // TODO
        return "name";
    }

    public int getIdNumber() {
        // TODO
        return -1;
    }

    public String getEmail() {
        // TODO
        return "email";
    }

    public int getTotalScore() {
        // TODO
        return totalQuizScore;
    }

    public double getAverageScore() {
        // TODO
        return 0;
    }
}
