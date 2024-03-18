import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Test_U07bWordGame {
@Test
public void randomSecret_test() {
  String[] arr1 = {"codeR","Coder","cOdEr"};
  String[] arr2 = new String[0];
  String[] arr3 = {"java","byte","code"};
  assertEquals("coder", U07bWordGame.randomSecret( arr1 ));
  assertEquals("error", U07bWordGame.randomSecret( arr2 ));
  assertEquals("sorry", U07bWordGame.randomSecret( arr3 ));

}

@Test
public void checkGuess_test() {

  assertEquals("✅🔳🔀🔳🔳", U07bWordGame.checkGuess("coder", "clown"));
  assertEquals("🔀🔳🔀✅🔀", U07bWordGame.checkGuess("coder", "raced"));
  assertEquals("✅🔀✅🔳✅", U07bWordGame.checkGuess("coder", "cedar"));

}

@Test
public void checkLetter_test() {

  assertEquals("✅", U07bWordGame.checkLetter("coder", "c", 0));
  assertEquals("🔀", U07bWordGame.checkLetter("coder", "r",2));
  assertEquals("🔳", U07bWordGame.checkLetter("coder", "x", 4));

}
}