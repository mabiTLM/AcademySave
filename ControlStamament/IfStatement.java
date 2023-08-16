package ControlStamament;

import java.util.Scanner;

public class IfStatement {
	public static void main(String[] args) {
	/*System.out.println("월요일이다.");

	//조건문
	//동작조건이 true이면
	if(조건식) // -> 요기가 true이면
	{
		//요기를 실행해라 => 조건식이 true일때만
		System.out.println("월요일이다.");
		System.out.println("월요일이다.");
	}
	if (condition) { //true
		System.out.println("월요일이다.");
		
	}
	//실행시킬 코드가 한줄이라면 자동으로 중괄호를 삽입한다.
	if (condition) //true{
		System.out.println("월요일이다.");
	//}
		System.out.println("화요일이다.");
	//////////////////////////////////	
	//if ~else 
	/////////////////////////////////
		if(조건식) {
			//참이면 여기를 실행하고
		}
		//단독으로 올수 없다.
		else {
			//거짓이면 요기를 실행한다.
		}
		/*
		if() {}
		if() {}
		else {} 바로위에 if만 해당된다

		
		///////////////////
		//if~ else if~ else
		/////////////////////
		if(조건식) {}
		else if(조건식) {}
		else if(조건식) {}
		else if(조건식) {}
		else {}
		
		//
		//1. false여도 전부 검사한다.
		if(조건식) {}
		if(조건식) {}
		if(조건식) {}
		//2. false가 나온순간 밖으로 나온다.
		if(조건식) {}
		else if(조건식) {}
		else if(조건식) {}
		*/
		if(10<3) {
			System.out.println("위 조건이 맞으면 여기가 실행되고");
		}
		else {
			System.out.println("아니면 여기가 실행된다");
			}
		int number = 17;
		if(number %2==0) {
			System.out.println(number + "(은)는 짝수임");
		}
		else {
			System.out.println(number + "(은)는 홀수임");
		}
		
		int height = 150;
		if (height>=140) {
			System.out.println("놀이기구 탑승 가능");
			}else {
				System.out.println("놀이기구 탑승 불가");
			}
		int a = 85;
		if(a>=90) {
			System.out.println("A학점");
		}
		else if(a>=80) {
			System.out.println("B학점");
		}
		else if(a>=70) {
			System.out.println("C학점");
		}
		else {
			System.out.println("F학점");
		}
				
		/*
		//츌력
		//입력
		//스캐너 클래스 객체를 생성
		//@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		//입력받은 내용을 strInput에 저장
		//입력을 하고 입력한 내용이 문자열로 반환
		String strInput=scanner.nextLine();
		//parseInt(strInput)=>입력받은 내용을 int타입으로 변환
		int convertInput = Integer.parseInt(strInput);
		
		//int input = scanner.nextInt();
		scanner.close();
		System.out.println(strInput);
		*/
		
		//int score = 0;
		//char grade = ' ';
		/*System.out.print("점수를 입력해라 : ");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		if(score>=90) {
			grade = 'A';
		}
		else if(score>=80) {
			grade = 'B';
		}
		else if(score>=70) {
			grade = 'C';
		}
		else {
			grade = 'D';
		}
		*/
		//System.out.println("너님의 학적은 " + grade + "이다");
		/*if(조건식1)
		{
			//조건식 1이 true일때 실행될 코드를 기재
			if(조건식2) {
				//조건식 1,2가 모두 true일때 실행될 코드를 기재
			}else {
				//조건식 1이 true이고 조건식 2가 false일때 실행될 코드를 기재
			}
		}
		else {
			//조건식 1이 false일때 실행
		}
		if문 너무 연속으로 하지는말것
		*/
		//실습
		//90점보다 같거나 크면 A학점
		//90점 이상에서도 98점 이상은 A+
		//94점 미만이면 A-
		//B학점도 마찬가지
		//위조건이 전부 아니면 C
		/*char anotherGrade = ' ';
		System.out.print("점수를 입력해라 : ");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		if(score>=90) {
			if(score>=98) {
				grade = 'A';
				anotherGrade = '+';
			}
			if(score<94) {
				grade = 'A';
				anotherGrade = '-';
			}
			else {
			grade = 'A';
			}
		}
		else if(score>=80) {
			if(score>=88) {
				grade = 'B';
				anotherGrade = '+';
			}
			if(score<84) {
				grade = 'B';
				anotherGrade = '-';
			}
			else {
			grade = 'B';
			}
		}
		else {
			grade = 'C';
		}

		
		
		System.out.println("너님의 학적은 " + grade + anotherGrade+ "이다");
		scanner.close();
		*/
		/*
		String anotherGrade = " ";
		System.out.print("점수를 입력해라 : ");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		if(score>=90) {
			if(score>=98) {
				anotherGrade = "A+";
			}
			else if(score<94) {
				anotherGrade = "A-";
			}
			else {
				anotherGrade = "A";
			}
		}
		else if(score>=80) {
			if(score>=88) {
				anotherGrade = "B+";
			}
			else if(score<84) {
				anotherGrade = "B-";
			}
			else {
				anotherGrade = "B학점";
			}
		}
		else {
			anotherGrade = "C";
		}		
		
		System.out.println("너님의 학점은 " + anotherGrade+ "이다");
		
		scanner.close();
		*/
		int score = 0 ;
		char grade = ' ' ;
		char opt = ' ' ;
		System.out.print("점수를 입력해라 : ");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		System.out.printf("내 점수는 %d이다.\n",score);
		if(score>=90) {
			grade = 'A';
			if(score>=98) {
				opt = '+';
			}
			if(score<94) {
				opt = '-';
			}
		}
		else if(score>=80) {
			grade = 'B';
			if(score>=88) {
				opt = '+';
			}
			if(score<84) {
				opt = '-';
			}
		}
		else {
			grade='C';
		}
		System.out.printf("당신의 학점은 %c%c이다.\n",grade,opt);
		}
}