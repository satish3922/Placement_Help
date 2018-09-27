package Assignment2;
class Employee implements Cloneable{
	int empno;
	int sal;
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class Clone_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		try {
		Employee eclone=(Employee)e.clone();
		e.empno=10;
		e.sal=1000;
		//eclone.empno=20;
		//eclone.sal=2000;
		System.out.println(e.empno+" "+e.sal);
		System.out.println(eclone.empno+" "+eclone.sal);
		}catch(CloneNotSupportedException c) {
			
		}

	}

}
