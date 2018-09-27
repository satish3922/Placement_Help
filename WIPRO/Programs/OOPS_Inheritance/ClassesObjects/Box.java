public class Box{
  // Instances
  double width;
  double height;
  double depth;

  // Method
  void setValue(double w, double h, double d){
    width = w;
    height = h;
    depth = d;
  }
  double getVolume(){
    return(width*height*depth);
  }

  public static void main(String[] args) {
    Box b = new Box();
    b.setValue(2.0,2.0,2.0);
    double volume;
    volume = b.getVolume();
    System.out.printf("Volume : %.1f\n",volume);
  }
}
