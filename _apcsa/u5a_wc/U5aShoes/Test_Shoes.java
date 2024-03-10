import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Test_Shoes {


  
  @Test
  public void test_modelNumber() {
    // Enter code here
    Shoes fav = new Shoes();
      fav.setColor("Blue");
      fav.setBrand("Nike");
      fav.setType("Golf");
      fav.setSize(9.5);
      String favString = fav.toString();
      favString = favString.substring(0, favString.indexOf("9.5"))+favString.substring(favString.indexOf("9.5")+3);
      assertTrue(favString.contains("ngblue9.5"));
      fav = new Shoes();
      fav.setColor("W");
      fav.setBrand("X");
      fav.setType("Y");
      fav.setSize(1.23);
      favString = fav.toString();
      favString = favString.substring(0, favString.indexOf("1.23"))+favString.substring(favString.indexOf("1.23")+3);
      assertTrue(favString.contains("xyw1.23"));
  }

  @Test
    public void test_SetColor() {
        Shoes fav = new Shoes();
        fav.setColor("Blue");
        assertTrue(fav.toString().contains("Blue"));
        fav.setColor("qwerty");
        assertTrue(fav.toString().contains("qwerty"));
    }

    @Test
    public void test_SetBrand() {
        Shoes fav = new Shoes();
        fav.setBrand("Nike");
        assertTrue(fav.toString().contains("Nike"));
        fav.setBrand("123456789");
        assertTrue(fav.toString().contains("123456789"));
    }

    @Test
    public void test_SetType() {
        Shoes fav = new Shoes();
        fav.setType("Golf");
        assertTrue(fav.toString().contains("Golf"));
        fav.setType("asdfghjkl");
        assertTrue(fav.toString().contains("asdfghjkl"));
    }

    @Test
    public void test_SetSize() {
        Shoes fav = new Shoes();
        fav.setSize(9.5);
        assertTrue(fav.toString().contains("9.5"));
        fav.setSize(0.95);
        assertTrue(fav.toString().contains("0.95"));
    }

  





}