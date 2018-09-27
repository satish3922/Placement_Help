class Animal{
  void eat(){
    System.out.println("Animal can Eat");
  }
  void sleep(){
    System.out.println("Animal can Sleep");
  }
}
class Bird extends Animal{
  void eat(){
    System.out.println("Bird can Eat");
  }
  void sleep(){
    System.out.println("Bird can Sleep");
  }
  void fly(){
    System.out.println("Bird can Fly also");
  }
}

class AnimalBird{
  public static void main(String[] args) {
    Animal a = new Animal();
    a.eat();
    a.sleep();
    Bird b = new Bird();
    b.eat();
    b.sleep();
    b.fly();

  }
}
