import java.text.NumberFormat;

public class Dollar {
    private long cents;

    public Dollar(int dollars, int cents){
        this.cents = dollars * 100 + cents;
    }

    public Dollar(double amount){
        this.cents = (long) Math.round(amount * 100);
    }

    public Dollar(long amount){
        this.cents = amount;
    }

    public Dollar add(Dollar other){
        return new Dollar(this.toLong() + other.toLong());
    }

    public double toDouble(){
        return this.cents / 100.0;
    }

    public long toLong(){
        return this.cents;
    }

    public String toString(){
        return NumberFormat.getCurrencyInstance().format(this.toDouble());
    }
}