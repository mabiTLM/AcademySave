package myPack;

import java.util.Scanner;

public class Operator { //연산자
	
	public static void main(String[] args) {
		//====================
		//연산자
		//====================
		
		/*
		 종류
		 산술연산자 : +, -, *, /, %(나머지)
		 증감연산자 : ++, --(값이 1씩 증가 또는 감소)
		 비교연산자 : <, > , <=, >=, ==, !=(같지 않다)
		 비트연산자 : &, |, ~, ^
		 논리연산자 : &&, ||, !
		 대입연산자 : =
		 복합대입 연산자 : +=, -=, *=, /=....
		 시프트연산자 : <<, >>
		 삼항연산자 : (true or false) ? a:b (참이면 앞 거짓이면 뒤)
		 */
		int a =10;
		int b =5;
		int result = a+b;
		int minus = a-b;
		int multiply = a*b;
		int division = a/b;
		System.out.println("덧셈 결과 : " + result);
		System.out.println("뺄셈 결과 : " + minus);
		System.out.println("곱하기 결과 : " + multiply);
		System.out.println("나누기 결과 : " + division);
		
		//증감 연산자
		//전위 연산자와 후위 연산자로 나뉨
		
		int num = 3;
		++num; //전위 num++후위
		System.out.println("전위 증가 연산 : "+num);
		int number = 5;
		number++;
		System.out.println("후위 증가 연산 : "+number);
		//위 결과는 동일하다.
		int value = 5;
		int preIncrementValue = ++value;
		System.out.println("전위 증가 연산 결과 : " + preIncrementValue);
		System.out.println("value의 값 : "+ value);
		value = 5;
		int postIncrementValue;
		postIncrementValue = value++;
		System.out.println("전위 증가 연산 결과 : " + postIncrementValue);
		System.out.println("value의 값 : "+ value);
		
		int num1 = 7;
		int num2 = 7;
		int result1;
		int result2;
		result1 = --num1+4;
		result2 = num2--+4;
		System.out.println(result1);
		System.out.println(result2);
		
		int x = 10;
		int y = x-- + 5 + --x;
		//여기서 문제
		//변수y의 수행되는 연산의 순서를 작성해라
		//x를 호출 x=10 감소연산 시행 x=9로 저장 +5를 한 다음 감소연산시행후 x호출 x=8 y=10+5+8=23
		
		//1.첫번째 decrement operator는 피연산자의 뒤쪽에 위치하므로 덧셈 연산이 먼저 수행
		//2. 덧셈 연산이 수행된 후에 감소 연산이 수행
		//3. 두번째 decrement operator는 피연산자의 앞쪽에 위치하므로 덧셈 연산보다 먼저 수행
		//4. 감소 연산이 수행된 후에 덧셈 연산이 수행
		//5. 마지막으로 대입연산 수행
		
		char c1 = 'a';
		char c2 = c1;
		char c3 = ' ';//공백으로 초기화
		
		int i = c1+1;
		System.out.println(i);
		c2++;
		System.out.println(c2);
		c3=(char)(c1+1);
		System.out.println(c3);
		
		//비교 연산
		//두 피연산자의 값의 크기를 비교하고 참이면 true, 거짓이면 false 반환한다.
		System.out.println(5<2);
		System.out.println(5>2);
		System.out.println(5<=2);
		System.out.println(5>=2);
		System.out.println(5==2);
		System.out.println(5!=2);
		
		int number1 =5;
		int number2 =2;
		int number3 =5;
		//==, !=
		System.out.println(number1==number2);
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		System.out.println(str1==str2);
		//지금 해볼것.
		//국어, 영어, 수학, 과학, 국사 5개의 과목의 총점과 평균을 구해라.
		
		int korean = 96;
		int english = 70;
		int math = 98;
		int science = 47;
		int national = 35;
		int sum;
		float average;
		sum = korean+english+math+science+national;
		average = sum/5f;
		System.out.println("과목의 총점 : " + sum + ", 평균 : " + average);
		
		//비트연산자
		//&(AND), |(OR), ~(NOT), ^(XOR)
		/*
		 a   b  & | ^
		 0   0  0 0 0
		 0   1  0 1 1
		 1   0  0 1 1
		 1   1  1 1 0
		 
		 ~
		 0 1
		 1 0
		 */
		int bitNum1 =5; //0000 0101
		int bitNum2 =3; //0000 0011

		int resultAnd = bitNum1 & bitNum2;
		//0000 0101
		//0000 0011
		//---------
		//0000 0001
		System.out.println("&연산 결과 : " + resultAnd);
		
		int resultOr = bitNum1 | bitNum2;;		
		//0000 0101
		//0000 0011
		//---------
		//0000 0111		
		System.out.println("|연산 결과 : " + resultOr);
		
		int leftShift = bitNum1<<2;
		System.out.println("왼쪽 쉬프트 연산 결과 : "+leftShift);
		int rightShift = leftShift>>1;
		System.out.println("오른쪽 쉬프트 연산 결과 : "+rightShift);
		//위에서 알수 있듯이 비트를 왼쪽, 오른쪽 하나씩 옮길때마다 *2,/2만큼 변경되는걸 알수있음
		//*2, /2만큼 변경되는걸 알수 있음.
		
		//대입연산자
		// =, +=, -=....
		
		int playerHp = 100;
		int potion = 50;
		System.out.println("포션 섭취");
		//playerHp= playerHp+potion;
		//playerHp+=potion; 같은 포현
		
		int maxValue =3;
		maxValue = maxValue+3;
		System.out.println("대입연산 결과 : "+maxValue);
		//복합대입 연산자
		int maxValue1 = 5;
		maxValue1+=10; //maxValue1 = maxValue1+10과 같다.
		System.out.println("결과 : "+ maxValue1);
		
		//삼항연산자
		int value2 = (true)?1:2;
		System.out.println(value2);
		
		int number5 = 10;
		int number6 = 20;
		int res = (number5>number6)? number5:number6;
		System.out.println("변수 2개중 큰수는? : "+res);
		
		int number7 = 30;
		int number8 = 15;
		boolean isCheck = (number7-number8>10) ? true:false;
		System.out.println("두수의 차이가 10보다 크냐? : "+ isCheck);
		
		int number9 = 2;
		
		String sRes=(number9%2==0) ? "짝수" : "홀수" ;
		System.out.println("홀짝 결과는? : "+ sRes);
		//우선순위 산술 비교 논리 대입 순
		
		//논리연산자
		//&&, ||, !
		//x>3 && x<5 // x>3와 x<5 참일 경우에만 참
		//x>3 || x<5 // x>3와 x<5 중 둘중 하나만 참이여도 참
		//(x>3 || x<5)||(x>3 && x<5)
			
		
		
		}
	}
