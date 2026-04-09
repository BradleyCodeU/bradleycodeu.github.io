
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import java.awt.Point;


public class Test_U05bRobot {

  @Test
  public void test_getRobotCount() {
    Robot a = new Robot(new Point(5, 5), 1);
    Robot b = new Robot(new Point(5, 5), 1);
    Robot c = new Robot(new Point(5, 5), 1);
    int rCount = Robot.getRobotCount();
    Robot d = new Robot(new Point(5, 5), 1);
    Robot e = new Robot(new Point(5, 5), 1);
    assertEquals(rCount + 2, Robot.getRobotCount());
    Robot f = new Robot(new Point(5, 5), 1);
    assertEquals(rCount + 3, Robot.getRobotCount());

  }

  @Test
  public void test_getLocation() {
    Robot robot = new Robot(new Point(5, 5), 1);

    robot.move(); // 6, 5, 1
    robot.turnRight(); // 6, 5, 2
    robot.move(); // 6, 6, 2
    robot.move(); // 6, 7, 2
    robot.turnRight(); // 6, 7, 3
    robot.move(); // 5, 7, 3
    robot.move(); // 4, 7, 3
    robot.turnLeft(); // 4, 7, 2
    robot.move(); // 4, 8, 2

    Point testlocation = robot.getLocation();

    assertEquals(4, testlocation.x);
    assertEquals(8, testlocation.y);
    robot.move(); // 4, 9, 2
    testlocation = robot.getLocation();
    assertEquals(9, testlocation.y);

  }

  @Test
  public void test_getDirection() {
    Robot robot = new Robot(new Point(5, 5), 1);

    robot.move(); // 6, 5, 1
    robot.turnRight(); // 6, 5, 2
    robot.move(); // 6, 6, 2
    robot.move(); // 6, 7, 2
    robot.turnRight(); // 6, 7, 3
    robot.move(); // 5, 7, 3
    robot.move(); // 4, 7, 3
    robot.turnLeft(); // 4, 7, 2
    robot.move(); // 4, 8, 2

    assertEquals("S", robot.getDirection().toUpperCase());
    robot.turnLeft(); // 4, 7, 1
    assertEquals("E", robot.getDirection().toUpperCase());
    robot.turnLeft(); // 4, 7, 0
    assertEquals("N", robot.getDirection().toUpperCase());
    robot.turnLeft(); // 4, 7, 3
    assertEquals("W", robot.getDirection().toUpperCase());
  }

  @Test
  public void test_getLicensePlates() {
    String licensePlates = Robot.getLicensePlates();
    assertTrue(licensePlates.startsWith("[") && licensePlates.endsWith("]"));
  }

  @Test
  public void test_generateLicensePlateNumber() {
    String licensePlate = Robot.generateLicensePlateNumber();
    assertTrue(licensePlate.matches("[A-Z0-9]{7}"));

    // Test if the generated license plate is added to the list
    String licensePlates = Robot.getLicensePlates();
    assertTrue(licensePlates.contains(licensePlate));
  }

}