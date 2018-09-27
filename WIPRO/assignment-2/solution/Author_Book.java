package Assignment2;

class Author{
	private String name;
	private String email;
	private char gender;
	Author(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
}
class Book{
	private String name;
	private Author ath;
	private double price;
	private int qtyInStock; 
	public Book(String name,Author ath,double price,int qtyInStock) {
		this.name=name;
		this.ath=ath;
		this.price=price;
		this.qtyInStock=qtyInStock;
	}
	String getName() {
		return name;
	}
	public void  getAuthor() {
		System.out.println("Author detail ");
		System.out.println(ath.name+" "+ath.email+" "+ath.gender);
		
	}
	double getPrice() {
		return price;
	}
	void setPrice(double price) {
		this.price=price;
	}
	int getQtyInStock() {
		return qtyInStock;
	}
	void setQtyInStock(int qtyInStock ) {
		this.qtyInStock=qtyInStock;
	}

}

class Author_Book {
	public static void main(String[] args) {
		Author a1=new Author("Gosling","abc.45@gmail.com",'M');
		Author.Book b1=a1.new Book("JAVA ",a1,200,50);
		System.out.print(b1.getName()+"  "+b1.getPrice()+" "+b1.getQtyInStock()+"\n");
		b1.getAuthor();
	
	}
}
