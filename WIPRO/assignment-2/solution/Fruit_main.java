package Assignment2;

class Fruit{
	String taste;
	int size;
	String name;
	Fruit(String name,String taste){
		this.name=name;
		this.taste=taste;
	}
	public void eat() {
		System.out.println("This is fruit class and test of "+name+" is "+taste);
	}
}
class Apple extends Fruit{
	Apple(){
		super("Apple","juiceness");
	}
	public void eat() {
		super.eat();
		System.out.println("Apple class and taste is Juiceness");
	}
	
}
class Orange extends Fruit{
	Orange(){
		super("Orange","sweet");
	}
	public void eat()
{
		super.eat();
		System.out.println("Orange class and taste is sweet");}
}

class Fruit_main {
	public static void main(String[] args) {
		Fruit a=new Apple();
		Fruit o=new Orange();
		a.eat();
		o.eat();
	}

}
