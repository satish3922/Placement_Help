abstract class GeneralBank{
  abstract double getSavingInterestRate();
  abstract double getFixedInterestRate();
  void gb(){
    System.out.println("GeneralBank methods");
  }
}
class ICICIBank extends GeneralBank{
  double SavingInterestRate = 4;
  double FixedInterestRate = 8.5;
  double getSavingInterestRate(){
    System.out.println("SavingInterestRate of ICICIBank :"+SavingInterestRate);
  }
  double getFixeInterestRate(){
    System.out.println("FixedInterestRate of ICICIBank :"+FixedInterestRate);
  }
}
// class KotMBank extends GeneralBank{
//   double SavingInterestRate = 6;
//   double FixedInterestRate = 9;
//   double getSavingInterestRate(){
//     return SavingInterestRate;
//   }
//   double getFixeInterestRate(){
//     return FixedInterestRate;
//   }
// }

class TestBank{
  public static void main(String[] args) {
    ICICIBank ic = new ICICIBank();
    ic.gb();
    ic.getSavingInterestRate();
    ic.getFixedInterestRate();
  }
}
