/*
Input - "WIPRO TECHNOLOGIES"
l1 = 5 // WIPRO length
l2 = 12 // TECHNOLOGIES length
sum = l1+l2 = 17
pin = 1+7 = 8
*/



class LogicBuilding2{
  public static void main(String[] args) {
    String[] str = input1.split(" ",-2);
		int sum = 0;
		for(String s : str){
			int len = s.length();
			sum = sum + len;
		}
		String res = Integer.toString(sum);
		sum = 0;
		for(int i=0;i<res.length();i++){
			sum = sum + Character.getNumericValue(res.charAt(i));
		}
		return sum;
  }
}
