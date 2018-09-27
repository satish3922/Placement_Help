public class Calculator{
  // public int power = 1;
  public static int  powInt(int x, int n){
    int power = 1;
    for(int i=1;i<=n;i++){
      power = power * x;
    }
    return(power);
  }

  public static double powDouble(double x, double n){
    double power = 1;
    for(int i=1;i<=(int)n;i++){
      power = power * x;
    }
    return(power);
  }

  public static void main(String[] args) {
    Calculator c = new Calculator();
    System.out.printf("Power of Integer : %d\n",c.powInt(2,3));
    System.out.printf("Power of Double : %.1f\n",c.powDouble(2.2,3.0));

  }
}
