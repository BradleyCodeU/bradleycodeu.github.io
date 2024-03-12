package tradewars;

import java.awt.Color;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Holds game constants and defaults
 * @author rob
 */
public interface TraderConstants {
  final static public NumberFormat CURRENCY_FORMATTER = DecimalFormat.getCurrencyInstance();

  final static int DAYS_IN_GAME = 60;
  
  final static int STARTING_SPACE = 100;
  final static long STARTING_CASH = 1000;
  final static int STARTING_HEALTH = 100;
  final static int STARTING_STRENGTH = 30;
  final static int STARTING_DEFENSE = 3;

  final static Color PROFITED_COLOR = new Color(0, 75, 0);
  final static Color LOST_COLOR = Color.RED;
  final static Color TRADE_COLOR = Color.MAGENTA;
  final static Color MOVED_COLOR = new Color(55, 0, 55);
  final static Color EVENT_COLOR = Color.BLACK;
  final static Color PRICES_HIGH = Color.RED;
  final static Color PRICES_LOW = Color.BLUE;
  final static Color KILLED_COLOR = Color.RED;
  final static Color FIGHT_COLOR = Color.GREEN;
}
