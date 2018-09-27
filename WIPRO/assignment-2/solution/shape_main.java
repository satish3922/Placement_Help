package Assignment2;

class shape{
	public void draw() {
		System.out.println("Drawing shape");
	}
	public void erase() {
		System.out.println("Erasing shape");
	}
}
class Circle extends shape{
	public void draw() {
		//super.draw();
		System.out.println("Drawing Circle ");
	}
	public void erase() {
		//super.erase();
		System.out.println("erasing circle ");
	}
}
class Triangle extends shape{
	public void draw() {
		//super.draw();
		System.out.println("Drawing Triangle ");
	}
	public void erase() {
		//super.erase();
		System.out.println("erasing Triangle ");
	}
}
class Square extends shape{
	public void draw() {
		//super.draw();
		System.out.println("Drawing Square  ");
	}
	public void erase() {
		//super.erase();
		System.out.println("erasing Square ");
	}
}

class shape_main {
	public static void main(String[] args) {
		shape c=new Circle();
		shape t=new Triangle();
		shape s=new Square();
		c.draw();c.erase();
		t.draw();t.erase();
		s.draw();s.erase();
	}

}
