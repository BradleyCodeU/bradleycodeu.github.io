class Parabola {
     private int a;
     private int b;
     private int c;

     public Parabola(int _a, int _b, int _c) {
     }

     public double getAxis() {
          return 0.0;
     }

     public boolean isOnGraph(int x, int y) {
          return false;
     }
}

public class App {
     public static void main(String[] args) {
          // First Parabola
          Parabola par1 = new Parabola(2, -6, -5);
          double expectedAxis1 = 1.5;
          boolean expectedOnGraph1 = true;
          double actualAxis1 = par1.getAxis();
          boolean actualOnGraph1 = par1.isOnGraph(4, 3);
          System.out.println("Expected Axis for Parabola 1: " + expectedAxis1);
          System.out.println("Actual Axis for Parabola 1: " + actualAxis1);
          System.out.println("Expected isOnGraph for Parabola 1: " + expectedOnGraph1);
          System.out.println("Actual isOnGraph for Parabola 1: " + actualOnGraph1);
          // Second Parabola
          Parabola par2 = new Parabola(4, 2, -2);
          double expectedAxis2 = -0.25;
          boolean expectedOnGraph2 = false;
          double actualAxis2 = par2.getAxis();
          boolean actualOnGraph2 = par2.isOnGraph(4, 3);
          System.out.println("\n\nExpected Axis for Parabola 2: " + expectedAxis2);
          System.out.println("Actual Axis for Parabola 2: " + actualAxis2);
          System.out.println("Expected isOnGraph for Parabola 2: " + expectedOnGraph2);
          System.out.println("Actual isOnGraph for Parabola 2: " + actualOnGraph2);
          System.out.println(
                    "\n\nENSURE THAT INSTANCE VARS ARE PRIVATE ! ! !\ngetAxis should be (-b / 2.0 * a)\nisOnGraph should be y == a * Math.pow(x, 2) + b * x + c");
     }
}
