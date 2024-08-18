

class U05aStudentApp {
  public static void main(String[] args) {
    Student demoStudent = new Student("x");
    System.out.println("Added the following quiz scores: 95, 65, 85");
    demoStudent.addQuiz(-1); // FIXME
    demoStudent.addQuiz(-1); // FIXME
    demoStudent.addQuiz(-2); // FIXME
    System.out.println("Expected Total = ");
    System.out.println("Expected Average = ");
    System.out.println("Actual results");
    System.out.println("Name = ");
    System.out.println("Id Number = ");
    System.out.println("Email = ");
    System.out.println("Total Score = ");
    System.out.println("Average Score = ");
  }
}