
class Patients{
  public static void main(String[] args) {
    Patient p = new Patient("Satish",50,45);
    System.out.printf(p.patientName + ": %.2f\n",p.BMI());

  }
}
