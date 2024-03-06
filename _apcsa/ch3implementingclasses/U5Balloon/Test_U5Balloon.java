import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Test_U5Balloon {






  @Test
  public void test_getVolumeZero() {
    Balloon temp = new Balloon();
    assertEquals(0.0, temp.getVolume(), 0.0000000001);
  }



@Test
public void test_inflate_and_getVolume() {
  Balloon temp = new Balloon();
  temp.inflate(1.0);
  assertEquals(4.1887902047863905, temp.getVolume(), 0.0000000001);
  temp = new Balloon();
  temp.inflate(3.0);
  assertEquals(113.09733552923255,temp.getVolume(),0.0000000001);
  temp = new Balloon();
  temp.inflate(10.3);
  assertEquals(4577.20415410562,temp.getVolume(),0.0000000001);
}

}