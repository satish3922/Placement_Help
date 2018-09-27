
// Author Class
class Author{
  private String name;
  private String email;
  private char gender;

  Author(String name, String email, char gender){
    this.name = name;
    this.email = email;
    this.gender = gender;
  }
  // Book Class
  class Book{
    private String name;
    private Author ath;
    private double price;
    private int qtyInStock;

    public Book(String name,Author ath, double price,int qtyInStock){
      this.name = name;
      this.ath = ath;
      this.price  = price;
      this.qtyInStock = qtyInStock;
    }

    // setters
    public void setPrice(double price){
      this.price = price;
    }
    public void setQtyInStock(int qtyInStock){
      this.qtyInStock = qtyInStock;
    }

    // getters
    public String getName(){
      return name;
    }
    public void getAuthor(){
      System.out.println("------------Authors Details--------------");
      System.out.println(ath.name + " \nEmail : " + ath.email + " \nGender : " + ath.gender);
    }
    public double getPrice(){
      return price;
    }
    public int getQtyInStock(){
      return qtyInStock;
    }
  }
}
class AuthorBook{
  public static void main(String[] args) {
    Author a = new Author("Chetan Bhagat","Chetan@Bhagat.com",'m');
    Author.Book b = a.new Book("3 Idiots",a,425,2);
    System.out.println(b.getName());
    System.out.println(b.getPrice());
    System.out.println(b.getQtyInStock());
    b.setPrice(500);
    b.setQtyInStock(50);
    System.out.println(b.getPrice());
    System.out.println(b.getQtyInStock());
    b.getAuthor();
  }
}
