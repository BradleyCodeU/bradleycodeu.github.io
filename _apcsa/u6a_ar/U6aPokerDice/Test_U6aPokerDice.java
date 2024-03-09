




getResult_Highest_Card_X

@Test
public void () {

  int[] mydice = {2,6,3,1,4};
  assertEquals( "Highest Card 6".toLowerCase(),Main.getResult(mydice).toLowerCase());
  int[] mydice2 = {1,2,6,4,5};
  assertEquals( "Highest Card 6".toLowerCase(),Main.getResult(mydice2).toLowerCase());
  

}

getResult_Two_pair
@Test
public void () {
  int[] mydice = {1, 2, 2, 1, 3};
  assertEquals("Two pair".toLowerCase(),Main.getResult(mydice).toLowerCase());
}
getResult_One_pair
@Test
public void () {
  int[] mydice = {1, 2, 2, 3, 4};
  assertEquals( "One pair".toLowerCase(),Main.getResult(mydice).toLowerCase());


}
diceToString_0_3_7_5_2
@Test
public void () {
  int[] mydice = {0, 3, 7, 5, 2};
  assertEquals("0 3 7 5 2",Main.diceToString(mydice));

}
resetDice_1
@Test
public void () {
  int[] mydice = {1, 3, 7, 5, 2};
  Main.resetDice(mydice);
  for(int each : mydice){
    assertEquals(0,each);
  }


}
getResult_Five_of_a_kind
@Test
public void () {
  // Enter code here
  int[] mydice = {1, 1, 1, 1, 1};
  
  assertEquals( "Five of a kind".toLowerCase(),Main.getResult(mydice).toLowerCase());
  
}



getCounts_1_2_3_3_7
@Test
public void () {
  int[] mydice = {1,2,3,3,7};
  int [] result = Main.getCounts(mydice);
  assertEquals(result.length, 10);
  int[] solution = {1, 1, 2, 0, 0, 0, 1, 0, 0, 0};
  for(int i=0;i<10;i++){
    assertEquals(solution[i],result[i]);
  }
  
}

getResult_Four_of_a_kind
@Test
public void () {

  int[] mydice = {1, 2, 1, 1, 1};
  
  assertEquals( "Four of a kind".toLowerCase(),Main.getResult(mydice).toLowerCase());
  
}


getResult_Full_house

@Test
public void () {
  int[] mydice = {1, 2, 2, 1, 1};
  assertEquals( "Full house".toLowerCase(),Main.getResult(mydice).toLowerCase());
}

getResult_Three_of_a_kind
@Test
public void () {
  int[] mydice = {1, 2, 3, 1, 1};
  assertEquals( "Three of a kind".toLowerCase(),Main.getResult(mydice).toLowerCase());
}