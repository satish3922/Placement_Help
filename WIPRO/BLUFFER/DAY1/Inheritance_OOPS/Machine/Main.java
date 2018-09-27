public class Main{
  public static void main(String[] args) {

    // Creating object of Machine class
    Machine m = new Machine();
    m.start(); // Calling start method()
    m.stop();  // Calling stop method()

    // Creating object of Car class
    Car c = new Car();
    c.start(); // Calling start method of SuperClass Machine
    c.speedup(); // Calling speedup method of Car class
    c.stop(); // Calling stop method of SuperClass Machine
  }
}
