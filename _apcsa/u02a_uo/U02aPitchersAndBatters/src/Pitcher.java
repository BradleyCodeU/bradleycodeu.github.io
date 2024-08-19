/**
 * Pitcher class simulates a baseball pitcher that can throw pitches.
 *
 * @author Justin RIley
 * @version 1.0
 * @since 2023-09-20
 */
public class Pitcher {
  private String name;
  private int pitchCounter;

  /**
   * Constructs a new Pitcher object that represents a baseball
   * pitcher that can throw baseballs. The pitcher's name must be
   * supplied as an argument. The object's pitchCounter is
   * initially set to zero.
   *
   * @param name  the name of the pitcher. Can be one-word or multi-word name.
   */
  public Pitcher(String name) {
    this.name = name;
    this.pitchCounter = 0;
  }

  /**
   * The nextPitch method looks at the player's name and the
   * current pitch number. If that number letter in the player's
   * name is a vowel, then they throw a great pitch. If that
   * number letter in the name is a consenent, then they throw a
   * bad pitch. For example, "Eli" would throw great pitch, bad
   * pitch, then great pitch. Finally, the pitchCounter is
   * incremented.
   *
   * @return  a String that says if they threw a bad pitch or great pitch.
   */
  public String nextPitch() {
    String vowels = "aeiou";
    String result = "Oof! " + this.name + " throws a bad pitch";
    String letter = this.name.substring(this.pitchCounter % this.name.length(), this.pitchCounter % this.name.length() + 1).toLowerCase();
    if (vowels.indexOf(letter) >= 0) {
      result = this.name + " throws a GREAT pitch!";
    }
    this.pitchCounter++;
    return result;
  }
}