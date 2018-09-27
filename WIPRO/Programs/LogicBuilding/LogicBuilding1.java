/*
Alphabet should be from a=1=A & z=26=Z
Input - "Hello World"
Output - 4012
  [H-0]+[e-l]+[l] = 40 // suppose
  [w-d]+[o-l]+[r] = 12
*/
import java.util.*;
class LogicBuilding1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter String : ");
    String s = sc.nextLine();
		String res = "";
    String[] sArr = s.split(" ",-2);
    for(int i=0;i<sArr.length;i++){
        sArr[i] = sArr[i].toLowerCase();
    }
    int d3;
    int sum;
    String st1;
    int diff;

    for(String k : sArr){
        sum = 0;
        for(int i=1;i<=k.length()/2;i++){
            diff = Math.abs(Integer.valueOf(k.charAt(i-1)-96) - Integer.valueOf(k.charAt(k.length()-i)-96));
            sum = sum + diff;
        }
        if(k.length()%2==0){
            st1 = Integer.toString(sum);
        }
        else{
            sum = sum + Integer.valueOf(k.charAt((k.length()/2))-96);
            st1 = Integer.toString(sum);
        }
			    res = res+st1;
    }
		  System.out.println(Integer.valueOf(res));
  }
}
