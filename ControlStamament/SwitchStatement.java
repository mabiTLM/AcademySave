package ControlStamament;

import java.util.Scanner;

public class SwitchStatement {
	
	public static void main(String[] args) {
		//////////
		//switch
		///////
		/*
		switch(변수또는 표현식) {	//데이터가 들어옴
		case 값1:	//if		//여기서 비교하고
			//값1에 해당하는 실행할 코드 //실행
			break;				//1.break를 만나면
		case 값2:	//else if
			//값2에 해당하는 실행할 코드
			break;
		case 값3:	//else if
			//값3에 해당하는 실행할 코드
			break;
		
		default:	//else
			break;
		}						//2.요기로 온다.
		//switch 안에 switch switch안에 if도 가능
		*/
		
		int a = 8;
		//Scanner scanner = new Scanner(System.in);
		//a = scanner.nextInt();
		
		switch(a) {
		case 10:
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;						//여기서 탈출!!!
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.println("D");
			break;
		}
		
		if(a>=9)
			System.out.println("A");
		else if(a==8)
			System.out.println("B");	//여기서 탈출!!!
		else if(a==7)
			System.out.println("C");
		else
			System.out.println("D");
		
		int num, result = 0;
		final int ONE = 1;
/*		switch(result) {
		case '1': //OK. 문자리터럴(정수 상수인 49와 동일)
			break;
		case ONE : //OK. 상수
			break;
		
		//case num: Error. 변수 불가
		//case 3.5: 실수 불가 Error
		default:
			break;
		}*/
		char seasonCode = 'S';
		switch(seasonCode) {
		case 'S' :
			System.out.println("봄");
			break;
		case 'U' :
			System.out.println("여름");
			break;
		case 'A' :
			System.out.println("가울");
			break;
		case 'W' :
			System.out.println("겨울");
			break;
		default:
			System.out.println("잘못된 코드임");
			break;
		}
		
		int inputNum = 0;
		Scanner scanner = new Scanner(System.in);
		inputNum = scanner.nextInt();
		switch(inputNum) {
		case 1:
			System.out.println("너가 입력한 숫자는 : " + inputNum);
			break;
		case 2:
			System.out.println("너가 입력한 숫자는 : " + inputNum);
			break;
		case 3:
			System.out.println("너가 입력한 숫자는 : " + inputNum);
			break;
		default:
			System.out.println("1~3중에 하나만 눌러라");
			break;
		}
		scanner.close();
	}
}
