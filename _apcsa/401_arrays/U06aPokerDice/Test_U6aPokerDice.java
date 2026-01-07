import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Test_U06aPokerDice {






@Test
public void getResult_Highest_Card_X() {

  int[] mydice = {2,6,3,1,4};
  assertEquals( "Highest Card 6".toLowerCase(),U06aPokerDice.getResult(mydice).toLowerCase());
  int[] mydice2 = {1,2,6,4,5};
  assertEquals( "Highest Card 6".toLowerCase(),U06aPokerDice.getResult(mydice2).toLowerCase());
  

}


@Test
public void getResult_Two_pair() {
  int[] mydice = {1, 2, 2, 1, 3};
  assertEquals("Two pair".toLowerCase(),U06aPokerDice.getResult(mydice).toLowerCase());
}

@Test
public void getResult_One_pair() {
  int[] mydice = {1, 2, 2, 3, 4};
  assertEquals( "One pair".toLowerCase(),U06aPokerDice.getResult(mydice).toLowerCase());


}

@Test
public void diceToString_0_3_6_5_2() {
  int[] mydice = {0, 3, 6, 5, 2};
  assertEquals("0 3 6 5 2",U06aPokerDice.diceToString(mydice));

}

@Test
public void resetDice_1() {
  int[] mydice = {1, 3, 6, 5, 2};
  U06aPokerDice.resetDice(mydice);
  for(int each : mydice){
    assertEquals(0,each);
  }


}

@Test
public void getResult_Five_of_a_kind() {
  // Enter code here
  int[] mydice = {1, 1, 1, 1, 1};
  
  assertEquals( "Five of a kind".toLowerCase(),U06aPokerDice.getResult(mydice).toLowerCase());
  
}




@Test
public void getCounts_1_2_3_3_6() {
  int[] mydice = {1,2,3,3,6};
  int [] result = U06aPokerDice.getCounts(mydice);
  assertEquals(result.length, 10);
  int[] solution = {1, 1, 2, 0, 0, 1, 0, 0, 0, 0};
  for(int i=0;i<10;i++){
    assertEquals(solution[i],result[i]);
  }
  
}


@Test
public void getResult_Four_of_a_kind() {

  int[] mydice = {1, 2, 1, 1, 1};
  
  assertEquals( "Four of a kind".toLowerCase(),U06aPokerDice.getResult(mydice).toLowerCase());
  
}




@Test
public void getResult_Full_house() {
  int[] mydice = {1, 2, 2, 1, 1};
  assertEquals( "Full house".toLowerCase(),U06aPokerDice.getResult(mydice).toLowerCase());
}


@Test
public void getResult_Three_of_a_kind() {
  int[] mydice = {1, 2, 3, 1, 1};
  assertEquals( "Three of a kind".toLowerCase(),U06aPokerDice.getResult(mydice).toLowerCase());
}
}