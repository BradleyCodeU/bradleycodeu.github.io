import java.util.*;
// Princeton Review Practice Test 1
// FRQ #1
class Main {
  public static void main(String[] args) {
      String e1 = "Astronomy";
      String e2 = "Ballroom Dance";
      String e3 = "Basketweaving";
      String e4 = "Constitutional Law";
      String e5 = "Marine Biology";
      String e6 = "Programming";
      
    // create Elective objects
      Elective astronomy = new Elective(e1,12,12);
      Elective dance = new Elective(e2, 20,3);
      Elective basket = new Elective(e3,15,14);
      Elective law = new Elective(e4,10,7);
      Elective bio = new Elective(e5,10,10);
      Elective code = new Elective(e6,18,18);
      ArrayList<Elective> electives = new ArrayList<Elective>();
      electives.add(astronomy);
      electives.add(dance);
      electives.add(basket);
      electives.add(law);
      electives.add(bio);
      electives.add(code);
    // create Student objects 
      Student a = new Student("Andrew",e6,e5,e2);
      Student b = new Student("David",e4,e3,e6);
      Student c = new Student("Elizabeth",e5,e6,e1);
      Student d = new Student("Ethan",e3,e5,e1);
      Student e = new Student("Katherine",e6,e3,e5);
      ArrayList<Student> students = new ArrayList<Student>();
      students.add(a);
      students.add(b);
      students.add(c);
      students.add(d);
      students.add(e);
      // create School object ... must change to public method
      School s = new School(students,electives);
      // test PART A getElectiveByName 
      /*
      System.out.println(s.getElectiveByName("Constitutional Law"));
      */
      // test PART C
      /*
      ArrayList<Student> noElectives = s.studentsWithoutElectives();
      for(Student x: noElectives)
          System.out.println(x);
      */
      // test PART B
      /*
      s.assignElectivesToStudents();
      System.out.println();
      for(Student x: students)
          System.out.println(x);
      System.out.println(s.getElectiveByName("Constitutional Law"));
      */
  }
}