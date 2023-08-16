package ControlStamament;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		long num1 = 0;
		long num2 = 0;
		long result = 0;
		String sign = " ";
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		num1 = scan.nextLong();
		System.out.print("부호를 입력해주세요 : ");
		sign = scan.next();
		System.out.print("숫자를 입력해주세요 : ");
		num2 = scan.nextLong();
		
		if(sign.equals("+")) {
			result = num1+num2;			
		}
		else if(sign.equals("-")) {
			result = num1-num2;	
			
		}
		else if(sign.equals("*")) {
			result = num1*num2;	
			
		}
		else if(sign.equals("/")) {
			result = num1/num2;	
			
		}
		else {
			System.out.println("잘못된 부호 입력");
			return;
		}
		System.out.println(num1 + sign + num2 + " = " + result);
	}

}
