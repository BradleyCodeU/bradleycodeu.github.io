package io.github.bradleycodeu;

public class Student {
    private int totalQuizScore;

    public Student(String name) {
        name = name;
    }

    public void addQuiz(int score) {
        // NOTE: Adds score to the total quiz score AND adds 1 to the counter
        totalQuizScore += score;
    }

    public String getName() {
        return "name";
    }

    public int getIdNumber() {
        return -1;
    }

    public String getEmail() {
        return "email";
    }

    public int getTotalScore() {
        return totalQuizScore;
    }

    public double getAverageScore() {
        return 0;
    }
}
