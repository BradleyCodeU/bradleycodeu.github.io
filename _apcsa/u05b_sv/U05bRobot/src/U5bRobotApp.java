import java.awt.Point;

/**
   A class to test the Robot class.
*/
public class U05bRobotApp
{
   /**
      Tests the methods of the Robot class.
      @param args not used
   */
   public static void main(String[] args)
   {
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

      Point location = robot.getLocation();
      System.out.println("Location: " + location.x + ", " + location.y);
      System.out.println("Expected: 4, 8");
      System.out.println("Direction: " + robot.getDirection());
      System.out.println("Expected: S");
   }
}
