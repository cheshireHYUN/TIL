package Chapter06;

public class Calculator {
	void powerOn() {
		System.out.println("전원을켭니다");
		return; //원칙은 쓰는게 맞는데 생략 많이함...
	}
	
	int plus(int x, int y) {
		return x+y;
	}
	
	int plus(int...x){
		int result = 0;
		for (int i=0; i<x.length; i++)
		{result += x[i];
		}
		return result;
		}	
	
	
	double divide (int x, int y) {
		double result = (double) x/y;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원끔");
	}

}
