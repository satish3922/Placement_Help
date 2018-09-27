package Assignment2;

class Animal{
	public void eat() {
		System.out.println("Animal class eat method");
	}
	public void sleep() {
		System.out.println("Animal class sleep method");
	}
}
class Bird extends Animal{
	public void eat() {
		System.out.println("Bird class eat method");
	}
	public void sleep() {
		System.out.println("Bird class sleep method");
	}
	public void fly() {
		System.out.println("new method fly as Bird can fly");
	}
}
class Animal_Bird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Animal();
		a.eat();
		a.sleep();
		Bird a1=new Bird();
		a1.eat();
		a1.sleep();
		a1.fly();

	}

}
