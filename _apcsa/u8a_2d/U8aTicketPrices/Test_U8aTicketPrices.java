
@Test
public void isSeatTaken_false() {

  int[][] seats1 = {{20,30},{40,0}};
  assertEquals(false,Main.isSeatTaken(seats1,0,0));
  assertEquals(false,Main.isSeatTaken(seats1,1,0));
  
  int[][] seats2 = {{0,30},{40,50}};
  assertEquals(false,Main.isSeatTaken(seats2,0,1));
  assertEquals(false,Main.isSeatTaken(seats2,1,1));
}


@Test
public void isSeatTaken_true() {

  int[][] seats1 = {{20,30},{40,0}};
  assertEquals(true, Main.isSeatTaken(seats1,1,1));
  int[][] seats2 = {{0,30},{40,50}};
  assertEquals(true, Main.isSeatTaken(seats2,0,0));
}