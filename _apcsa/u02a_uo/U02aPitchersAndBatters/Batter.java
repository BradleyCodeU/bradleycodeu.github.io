/**
 * Batter class simulates a baseball batter that can swing a bat.
 *
 * @author Justin RIley
 * @version 1.0
 * @since 2023-09-20
 */
public class Batter {
  private String name;
  private int pitchCounter;

  /**
   * Constructs a new Batter object that represents a baseball
   * batter that can swing a bat. The batter's name must be
   * supplied as an argument. The object's pitchCounter is
   * initially set to zero.
   *
   * @param String name Name of the batter. Can be one-word or multi-word name.
   */
  public Batter(String name) {
    this.name = name;
    this.pitchCounter = 0;
  }

  /**
   * The getSwing method looks at the player's name and the
   * current pitch number. If that number letter in the player's
   * name is a vowel, then they hit a homerun. If that number
   * letter in the name is a consonsant, then they miss the ball.
   * For example, "Ian" would hit a homerun, hit a homerun, then
   * miss. Finally, the pitchCounter is incremented.
   *
   * @return String a String that says if they hit a home run or missed the ball.
   */
  public String getSwing() {
    String vowels = "aeiou";
    String result = "Strike! Swing and a miss by " + this.name;
    String letter = this.name.substring(this.pitchCounter % this.name.length(), this.pitchCounter % this.name.length() + 1).toLowerCase();
    if (vowels.indexOf(letter) >= 0) {
      result = "BOOM! " + this.name + " hit a home run!";
    }
    this.pitchCounter++;
    return result;
  }
}