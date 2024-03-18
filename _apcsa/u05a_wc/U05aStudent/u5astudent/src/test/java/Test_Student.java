import static org.junit.Assert.assertEquals;
import org.junit.Test;

import io.github.bradleycodeu.Student;

public class Test_Student {

@Test
public void test_getAverageScore() {
  Student b = new Student("Billy");
  assertEquals(0.0, b.getAverageScore(), 0.00000000001);
  b.addQuiz(99);
  assertEquals(99.0, b.getAverageScore(), 0.00000000001);
  b.addQuiz(100);
  assertEquals(99.5, b.getAverageScore(), 0.00000000001);
  b.addQuiz(65);
  assertEquals(88.0, b.getAverageScore(), 0.00000000001);
  b.addQuiz(70);
  assertEquals(83.5, b.getAverageScore(), 0.00000000001);
}

@Test
public void test_getTotalScore() {
  Student b = new Student("Billy");
  assertEquals(0, b.getTotalScore());
  b.addQuiz(99);
  assertEquals(99, b.getTotalScore());
  b.addQuiz(100);
  assertEquals(199, b.getTotalScore());
}

@Test
public void test_getEmail() {
  Student a = new Student("Xyz");
  int result1 = (int)a.getIdNumber();
  String email1 = a.getEmail();
  int result2 = (int)a.getIdNumber();
  String email2 = a.getEmail();
  int result3 = Integer.parseInt(email1.substring(2,6));
  assertEquals(email1, email2);
  assertEquals(result1, result2);
  assertEquals(result2, result3);
  assertEquals(true, email1.contains("xy"));
  assertEquals(true, email1.contains(""+result1));
  assertEquals(true, email1.contains("@example.com"));
}

@Test
public void test_getName() {
  Student a = new Student("Amy");
  assertEquals("Amy", a.getName());
  Student b = new Student("Billy");
  assertEquals("Billy", b.getName());
}


@Test
public void test_getIdNumber() {
  Student a = new Student("Amy");
  int result1 = (int)a.getIdNumber();
  int result2 = (int)a.getIdNumber();
  assertEquals(result1, result2);
  assertEquals(true, result1 > 999);
  assertEquals(true, result1 < 3001);

}
}