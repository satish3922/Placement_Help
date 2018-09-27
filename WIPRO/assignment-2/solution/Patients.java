package Assignment2;
class Patient{
	String name ;
	double height ,weight;
	Patient(/*String name ,*/double height,double weight){
		//this.name=name;
		this.height=height;
		this.weight=weight;
	}
	double BMI() {
		return (weight/(height*height))*703;
	}
}




class Patients {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient p1=new Patient(60.72,51);
		System.out.printf("%.3f",p1.BMI());

	}

}
