import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Test_U07aWordGame {
@Test
public void randomSecret_test() {
  String[] arr1 = {"codeR","Coder","cOdEr"};
  String[] arr2 = new String[0];
  String[] arr3 = {"java","byte","code"};
  assertEquals("coder", U07aWordGame.randomSecret( arr1 ));
  assertEquals("error", U07aWordGame.randomSecret( arr2 ));
  assertEquals("sorry", U07aWordGame.randomSecret( arr3 ));

}

@Test
public void checkGuess_test() {

  assertEquals("✅🔳🔀🔳🔳", U07aWordGame.checkGuess("coder", "clown"));
  assertEquals("🔀🔳🔀✅🔀", U07aWordGame.checkGuess("coder", "raced"));
  assertEquals("✅🔀✅🔳✅", U07aWordGame.checkGuess("coder", "cedar"));

}

@Test
public void checkLetter_test() {

  assertEquals("✅", U07aWordGame.checkLetter("coder", "c", 0));
  assertEquals("🔀", U07aWordGame.checkLetter("coder", "r",2));
  assertEquals("🔳", U07aWordGame.checkLetter("coder", "x", 4));

}
}