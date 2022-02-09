package chapter03;

public class CompareOperatorExample1 {
 public static void main(String[] args) {
	 int num1=10;
	 int num2=10;
	 boolean result1 = (num1 == num2);
	 boolean result2 = (num1 != num2);
	 boolean result3 = (num1 <= num2);
	 System.out.println("result1= "+result1);
	 System.out.println("result1= "+result2);
	 System.out.println("result1= "+result3);
	 
	 char char1 = 'A';
	 char char2 = 'B';
	 boolean result4 = (char1 <char2);
	 System.out.println("result4= "+result4);
	 
	 float v4 = 0.124f; //0.123999
	 double v5 = 0.125;  //0.12399999999999
	 System.out.println((double)v4==v5);  //v4가 더블이되면 0.12399999999.더커지니 F
	 System.out.println(v4==(float)v5);  // 0.123999가됨. 즉 작은수로 캐스팅하면 T
	 
 }
}