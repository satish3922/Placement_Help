package Assignment2;

class Box {
double width;
double height;
double depth;
public void init(double width,double height,double depth) {
	this.width=width;
	this.height=height;
	this.depth=depth;
}
public double volume() {
	return width*height*depth;
}
public static void main(String[] args) {
	Box b=new Box();
	b.init(12, 10.5, 13.5);
	System.out.println(b.volume());
}
}
