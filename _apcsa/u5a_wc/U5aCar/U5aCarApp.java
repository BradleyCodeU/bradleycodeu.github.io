import javax.swing.JFrame;
public class U5aCarApp
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.setSize(300, 400);
      frame.setTitle("My Awesome Cars");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      CarDrawer component = new CarDrawer();
      frame.add(component);
      frame.setVisible(true);
   }
}