# Robot Class

Implement a class Robot (in the Robot.java file) that simulates a robot wandering on an infinite plane. The robot is located at a point with integer coordinates and faces north, east, south, or west. Supply methods:

- public Robot(Point startingLocation, int startingDirection) //Note: 0 = North, 1 = East, 2 = South, 3 = West
- public void turnLeft()
- public void turnRight()
- public void move()
- public Point getLocation()
- public String getDirection()

The turnLeft and turnRight methods change the direction but not the location. The move method moves the robot by one unit in the direction it is facing. The getDirection method returns a string "N", "E", "S", or "W".
  
Finally, create a static variable to track the amount of robots that have been constructed. Create a static method named getRobotCount() that will return the amount of robots that have been constructed