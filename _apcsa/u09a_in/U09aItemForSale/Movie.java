class Movie extends ItemForSale
{
    private String runtime;
    private String rating;

    public Movie(String name, double price){
      super(name, price);
    }

    public double getEmployeePrice(){
      return super.getEmployeePrice() - 3.00;
    }
}