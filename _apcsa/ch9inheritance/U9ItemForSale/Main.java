class Main {
  // instance variable (could be an array or ArrayList of one of the classes
  // above)
  //ItemForSale[] storeList = { new Book(), new Movie() };
  // ArrayList<Vehicle>
  // ArrayList<Flyable> flyingStuff

  ItemForSale i = new Book(); // you would never do this

  public static void main(String[] args) {
    // Store s = new Store();
    Book b = new Book();
    // System.out.println(b);
    b = new Book("Cat in the Hat",new Author(),5.99,37,true);
    System.out.println(b); // b.toString()
    System.out.println(b.getPrice());
    System.out.println(b.getEmployeePrice());
    Movie m = new Movie("Monty Python and the Holy Grail",3.99);
    System.out.println(m);
    System.out.println(m.getPrice());
    System.out.println(m.getEmployeePrice());
    // ItemForSale i = new ItemForSale();
    // System.out.println(i);
    // i = new ItemForSale("shovel",9.99);
    // System.out.println(i);
    // System.out.println(b instanceof Book);
    // //System.out.println(b instanceof Movie);
    // System.out.println(b instanceof ItemForSale);
  }
}