public class Employee extends Person{
  public double AnnualSalary;
  public int DateOfJoining;
  public String InsuranceNumber;
  Employee(String n, double as, int doj, String in){
    name = n;
    this.AnnualSalary = as;
    this.DateOfJoining = doj;
    this.InsuranceNumber = in;

  }
  public void Display(){
    System.out.println("Name : "+name);
    System.out.println("Annual Salary : "+AnnualSalary);
    System.out.println("Date of Joining : "+DateOfJoining);
    System.out.println("Insurance Number : "+InsuranceNumber);
  }
}
