package ControlStamament;

import java.util.Scanner;

public class LoopClass {
	public static void main(String[] args) {
		//for중첩하면 렉걸림
		////////////////////////////////////
		//반복문
		//1. 어떤 작업이 반복적으로 수행하도록 만들때 사용한다.
		//2. for, while, do-while(한번은 무조건 실행)
		//3. for문이나 while문에 속한 코드들은 조건에 따라 한번도 수행되지 않을 수 있다.
		// do while은 최소 한번은 수행될것이 보장된다.
		//////////////////////////////////
		
		//for
		//초기식 : for문이 시작될때 딱 한번만 실행된다.
		//조건이 false가 될때까지
		//증감식 : 다음 반복을 위해 다시 이동하는 위치로 매회 반복이 될때마다 호출된다.
		/*	for(초기값; 조건식; 증감식) {
		//반복시킬 코드 -> 조건식이 true인 동안 반복 ㄱㄱ}
		*/
		System.out.println("반복시킨다");
		System.out.println("반복시킨다");
		System.out.println("반복시킨다");
		System.out.println("뽀문을 이용한 출력");
		for(int i = 0; i < 3; i+=2) {
			System.out.println("반복시킨다");
			}
		for(int i = 0; i<5; i++) {
			System.out.println(i);
			}
//		int k = 0;
//		for(k=0; k<5; k++) {
//			System.out.printf("k의 변수의 데이터 %d\n",k);
//			}
		for(int i = 10; i>=0; i--) {
			System.out.printf("i 변수의 데이터 %d\n",i);
		}
		//실습
		//1. 1부터 100까지 합을 구해라
		//출력 : 1~100까지의 핪 : ????
		int sum=0;
		for(int i = 1; i<=100; i++) {
			sum += i;
		}
		System.out.println("1부터 100까지의 핪 : " + sum);
// 혼자 만들어본것 역순 홀짝
//		sum=0;
//		for(int i = 100; i>0; i--) {
//			sum += i;
//		}
//		System.out.println(sum);
//		sum = 0;
//		for(int i = 0; i<=100; i+=2) {
//		if(i==0) {
//			for(int j = 1; j<=100; j+=2) {
//				sum += j;
//				if(j>=99) {
//				System.out.println("홀수의 핪 : " + sum);
//				sum = 0;}
//			}}
//			sum += i;
//			if(i>=100) {
//			System.out.println("짝수의 핪 : " + sum);}
//		}
		
		int dan = 2;
		for (int i = 1 ; i <=9; i++) {
			System.out.println(dan+" * " +i+" = " + (dan*i));
		}
		//실습
		//입력을 받는다.
		//ex) 출력 : 3을 입력하면 3단이 나온다.
//		int googooDan = 0;
//		Scanner scan = new Scanner(System.in);
//		System.out.print("단을 입력해주세요 : ");
//		googooDan = scan.nextInt();
//		for(int i = 1; i<=9; i++) {
//			System.out.println(googooDan+"*"+i+"="+ (googooDan*i));
//		}
		
		for(int i =0; i<=10; i++) {
			if(i%2==0) {//2로 나눈 나머지가 0이라면
				System.out.print(i+ " ");
				
			}
		}
		System.out.println("");
		for(int i =0; i<=10; i++) {
			if(i%2!=0) {//2로 나눈 나머지가 0이 아니라면
				System.out.print(i+ " ");
				
			}
		}
		////////////////
		//중첩for문
		//////////////
		
		for(int i = 0; i<3; i++)
		{
			for(int j = 0; j <3; j++)
			{
				System.out.println(i+" , " + j);				
			}
		}
		System.out.println("");
		for(int i = 2; i<=9; i++) {
			for(int k = 1; k<=9; k++) {
				System.out.println(i+" * " + k + " = " + (i*k));
			}// 1. 2*1 = 2
			//2.2*2=4
		}
		System.out.println("");
		int num = 5;
		for(int i =1; i <=num; i++) 
		{
			for(int j =1; j<=i;j++) 
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
//		 * 
//		 *  * 
//		 *  *  * 
//		 *  *  *  * 
//		 *  *  *  *  * 
// =======================
//		 *  *  *  *  * 
//		 *  *  *  *  
//		 *  *  * 
//		 *  * 
//		 *
//=========================
//		             * 
//		  		  *  * 
//		 	   *  *  * 
//		 	*  *  *  * 
//		 *  *  *  *  * 
// =======================
//		 *  *  *  *  * 
//		    *  *  *  *  
//			   *  *  * 
//			   	  *  * 
//		 			 *
// 마름모다이아몬드 123454321
//		  *
//		 * *
//		* * *
//	   * * * *
//	  * * * * *
//	   * * * *
//		* * *
//		 * *
//		  *
		
	}	
}
