import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Test_U8aTicketPrices {


@Test
public void isSeatTaken_false() {

  int[][] seats1 = {{20,30},{40,0}};
  assertEquals(false,U8aTicketPrices.isSeatTaken(seats1,0,0));
  assertEquals(false,U8aTicketPrices.isSeatTaken(seats1,1,0));
  
  int[][] seats2 = {{0,30},{40,50}};
  assertEquals(false,U8aTicketPrices.isSeatTaken(seats2,0,1));
  assertEquals(false,U8aTicketPrices.isSeatTaken(seats2,1,1));
}


@Test
public void isSeatTaken_true() {

  int[][] seats1 = {{20,30},{40,0}};
  assertEquals(true, U8aTicketPrices.isSeatTaken(seats1,1,1));
  int[][] seats2 = {{0,30},{40,50}};
  assertEquals(true, U8aTicketPrices.isSeatTaken(seats2,0,0));
}
}