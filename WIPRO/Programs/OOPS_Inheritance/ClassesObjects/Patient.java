public class Patient{
  public String patientName;
  public double weight;
  public double height;
  Patient(String name, double w, double h){
    patientName = name;
    weight = w;
    height = h;
  }
  public double BMI(){
    return((weight/(height*height))*703);
  }
}
