class ItemForSale
{
    private double price;
    private String name;
    
    public ItemForSale(){
        this.name="unknown item name";
        this.price=0.01;
    }

    public ItemForSale(String name,double price){
        this.name=name;
        this.price=price;
    }

  public String getName(){
    return this.name;
  }

  public double getPrice(){
    return this.price;
  }

  public double getEmployeePrice(){
    return this.price * 0.9;
  }

  public String toString(){
    return "ItemForSale: " + this.name + "/" + this.price;
  }
    
}








