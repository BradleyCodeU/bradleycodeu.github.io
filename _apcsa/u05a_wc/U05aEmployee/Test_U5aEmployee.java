import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Test_U05Employee {


@Test
public void test_raiseSalary() {

  Employee temp = new Employee("Bill", "Gates", 100.00);
  temp.raiseSalary(15.0);
  assertEquals(115.0, temp.getSalary(), 0.0000000001);
  temp = new Employee("Steve", "Jobs", 50000.00);
  temp.raiseSalary(19.9);
  assertEquals(59950.0, temp.getSalary(), 0.0000000001);
}


@Test
public void test_getEmail() {

  Employee temp = new Employee("Bill", "Gates", 100.00);
  assertTrue(temp.getEmail().contains("bgates"));
  Employee temp2 = new Employee("Steve", "Jobs", 100.00);
  assertTrue(temp2.getEmail().contains("sjobs"));
}


@Test
public void test_getFullName() {

  Employee temp = new Employee("Bill", "Gates", 100.00);
  assertEquals("Bill Gates",temp.getFullName());
  Employee temp2 = new Employee("Steve", "Jobs", 100.00);
  assertEquals("Steve Jobs",temp2.getFullName());

}
}
