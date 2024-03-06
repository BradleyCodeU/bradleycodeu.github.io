class Book extends ItemForSale {
  private Author bookAuthor;
  private int numberOfPages;
  private boolean isHardCover;

  public Book() {
    super("unknown book title", 0);

  }

  public Book(String name, Author auth, double price, int pgs, boolean cover) {
    super(name,price);
    this.bookAuthor = auth;
    this.numberOfPages = pgs;
    
  }

  public String toString(){
    return "Book:" + this.getName() + "/" + this.bookAuthor + "/" + this.getPrice() + "/" + this.numberOfPages + "/" + this.isHardCover;
  }


}