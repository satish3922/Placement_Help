// A Java program to illustrate Dynamic Method
// Dispatch using hierarchical inheritance
class A
{
	void m1()
	{
		System.out.println("Inside A's m1 method");
	}
}

class B extends A
{
	// overriding m1()
	void m1()
	{
		System.out.println("Inside B's m1 method");
	}
}

class C extends A
{
	// overriding m1()
	void m1()
	{
		System.out.println("Inside C's m1 method");
	}
}

// Driver class
class Hierarchical
{
	public static void main(String args[])
	{
		// object of type A
		A a = new A();
		// object of type B
		B b = new B();
		// object of type C
		C c = new C();

		// calling A's version of m1()
		a.m1();
		// calling B's version of m1()
		b.m1();
		// calling C's version of m1()
		c.m1();
	}
}
