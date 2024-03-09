
@Test
public void randomSecret_test() {
  String[] arr1 = {"codeR","Coder","cOdEr"};
  String[] arr2 = new String[0];
  String[] arr3 = {"java","byte","code"};
  assertEquals("coder", U7bWordGame.randomSecret( arr1 ));
  assertEquals("error", U7bWordGame.randomSecret( arr2 ));
  assertEquals("sorry", U7bWordGame.randomSecret( arr3 ));

}

@Test
public void checkGuess_test() {

  assertEquals("✅🔳🔀🔳🔳", U7bWordGame.checkGuess("coder", "clown"));
  assertEquals("🔀🔳🔀✅🔀", U7bWordGame.checkGuess("coder", "raced"));
  assertEquals("✅🔀✅🔳✅", U7bWordGame.checkGuess("coder", "cedar"));

}

@Test
public void checkLetter_test() {

  assertEquals("✅", U7bWordGame.checkLetter("coder", "c", 0));
  assertEquals("🔀", U7bWordGame.checkLetter("coder", "r",2));
  assertEquals("🔳", U7bWordGame.checkLetter("coder", "x", 4));

}