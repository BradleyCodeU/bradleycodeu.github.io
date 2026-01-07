import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Test_Coin {


@Test
public void test_getFace() {
  Coin unknownFace = new Coin();
  assertEquals("unknown",unknownFace.getFace());
  Coin coin1 = new Coin();
  coin1.flip();
  assertEquals(true, coin1.getFace().equals("heads") || coin1.getFace().equals("tails"));
  coin1.flip();
  assertEquals(true, coin1.getFace().equals("heads") || coin1.getFace().equals("tails"));
  coin1.flip();
  assertEquals(true, coin1.getFace().equals("heads") || coin1.getFace().equals("tails"));
}

@Test
public void test_getValue() {
  Coin coin1 = new Coin("dime",2022,0);
  assertEquals(0.1, coin1.getValue(), 0.000001);
  coin1 = new Coin("penny",2022,0);
  assertEquals(0.01, coin1.getValue(), 0.000001);
  coin1 = new Coin("quarter",2022,0);
  assertEquals(0.25, coin1.getValue(), 0.000001);
  coin1 = new Coin("nickel",2022,0);
  assertEquals(0.05, coin1.getValue(), 0.000001);
}

@Test
public void test_getType() {
  Coin coin1 = new Coin("dime",2022,0);
  assertEquals("dime",coin1.getType());
  Coin coin2 = new Coin("nickel",2022,0);
  assertEquals("nickel",coin2.getType());
}

@Test
public void test_setYear_getYear() {
  Coin coin2 = new Coin();
  assertEquals(true, coin2.setYear(1990));
  assertEquals(1990, coin2.getYear());
  assertEquals(true, coin2.setYear(1980));
  assertEquals(1980, coin2.getYear());
  assertEquals(false, coin2.setYear(1776));
  assertEquals(1980, coin2.getYear());
}

@Test
public void test_toString() {
  Coin coin1 = new Coin("dime",2020,0);
  assertEquals("2020 dime",coin1.toString());
  coin1 = new Coin("penny",1999,0);
  assertEquals("1999 penny",coin1.toString());
}
}