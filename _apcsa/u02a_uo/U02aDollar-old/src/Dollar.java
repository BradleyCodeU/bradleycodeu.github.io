import java.text.NumberFormat;

/**
 * The {@code Dollar} class represents an immutable amount of money in dollars and cents.
 * This class provides methods for basic arithmetic operations and conversion to different
 * data types.
 */
public class Dollar {
    private long cents;

    /**
     * Constructs a {@code Dollar} object with the specified dollars and cents.
     *
     * @param dollars the number of dollars
     * @param cents the number of cents
     */
    public Dollar(int dollars, int cents){
        this.cents = dollars * 100 + cents;
    }

    /**
     * Constructs a {@code Dollar} object from a double representing the dollar amount.
     *
     * @param amount the dollar amount as a double
     */
    public Dollar(double amount){
        this.cents = (long) Math.round(amount * 100);
    }

    /**
     * Constructs a {@code Dollar} object from a long representing the amount in cents.
     *
     * @param amount the amount in cents
     */
    public Dollar(long amount){
        this.cents = amount;
    }

    
    /**
     * Adds the other {@code Dollar} object to this {@code Dollar} object and returns a new {@code Dollar} object representing the sum.
     *
     * @param other the {@code Dollar} object to add
     * @return a new {@code Dollar} object representing the sum
     */
    public Dollar add(Dollar other){
        return new Dollar(this.toLong() + other.toLong());
    }

    
    /**
     * Converts this {@code Dollar} object to a double representing the dollar amount.
     *
     * @return the dollar amount as a double
     */
    public double toDouble(){
        return this.cents / 100.0;
    }

    
    /**
     * Converts this {@code Dollar} object to a long representing the amount in cents.
     *
     * @return the amount in cents as a long
     */
    public long toLong(){
        return this.cents;
    }

    
    /**
     * Returns a string representation of this {@code Dollar} object in the standard
     * currency format.
     *
     * @return a string representation of the dollar amount
     */
    @Override
    public String toString(){
        return NumberFormat.getCurrencyInstance().format(this.toDouble());
    }
}