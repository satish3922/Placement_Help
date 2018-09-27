// Derived Class from Machine SuperClass
public class Car extends Machine{

  // Overriden method of Machine Class
  @Override
  public void start(){
    System.out.println("Car started");
  }

  @Override
  public void stop(){
    System.out.println("Car Stopped");
  }

  public void speedup(){
    System.out.println("Speed Increased");
  }
}
