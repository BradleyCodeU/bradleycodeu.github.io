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
      String modelNum = fav.getModelNumber();
      assertEquals(true,modelNum.contains("ngblue9.5"));
      fav = new Shoes();
      fav.setColor("W");
      fav.setBrand("X");
      fav.setType("Y");
      fav.setSize(1.23);
      modelNum = fav.getModelNumber();
      assertEquals(true,modelNum.contains("xyw1.23"));
  }



  @Test
    public void test_SetColor() {
        Shoes fav = new Shoes();
        fav.setColor("Blue");
        assertEquals(true,fav.toString().contains("Blue"));
        fav.setColor("qwerty");
        assertEquals(true,fav.toString().contains("qwerty"));
    }

    @Test
    public void test_SetBrand() {
        Shoes fav = new Shoes();
        fav.setBrand("Nike");
        assertEquals(true,fav.toString().contains("Nike"));
        fav.setBrand("123456789");
        assertEquals(true,fav.toString().contains("123456789"));
    }

    @Test
    public void test_SetType() {
        Shoes fav = new Shoes();
        fav.setType("Golf");
        assertEquals(true,fav.toString().contains("Golf"));
        fav.setType("asdfghjkl");
        assertEquals(true,fav.toString().contains("asdfghjkl"));
    }

    @Test
    public void test_SetSize() {
        Shoes fav = new Shoes();
        fav.setSize(9.5);
        assertEquals(true,fav.toString().contains("9.5"));
        fav.setSize(0.95);
        assertEquals(true,fav.toString().contains("0.95"));
    }

  





}