package ControlStamament;

import java.util.Scanner;

public class anotherLoopClass {
	public static void main(String[] args) 
	{
//		//while
////		while(조건식) {}
//		int number = 0;
//		while(true) 
//		{
//			//반복적으로 실행시킬 코드
//			//단, 종료조건이 반드시 있어야 된다.
//			//if(뭐뭐라면)break;
//			number++;
//			System.out.println(number);//출력
//			if(number==10) break; //number가 10이면 해당 while문을 빠져나와라
//		}
//		int count =10;
//		while(count!=0)//0이 아닐때까지 -> 0이 될때까지
//		{
//			count--;
//			System.out.println(count);
//		}			
//		int sum =0;//합계용 변수
//		int num;
//		boolean flag=true;
//		Scanner input = new Scanner(System.in);
//		while(flag){
//			System.out.print(">>");	
//			String temp=input.nextLine();
//			num=Integer.parseInt(temp);
//			
//			if(num!=0) { //입력이 0이 아니라면
//			sum+=num; //내가 입력한 정수를 계속해서 더하고
//			}
//			else // 입력이 0이면
//			{
//				flag = false;//flag=>false				
//			}
//			System.out.println("합계 : " + sum);
//		}//end of while
//		input.close();

		//1.가위바위보 업그레이드
		//-> 10판만 할 수 있다. 그리고 배팅금액이 올인되면 종료
		//-> 플레이어는 소지금 표기
		//-> 판수 표기
		//-> 배팅금액
		//-> 플레이어가 이기면 배팅금액에 *2 꿀꺽
		//-> 비겼다면 배팅금액만큼만 소모
		//-> 졌으면 배팅금액만 *2만큼 소모
		
		//2. 랜덤 숫자 맞추기
		//-> 컴퓨터가 랜덤한 숫자를 생성한다. 1~100까지
		//-> 플레이어는 랜덤한 숫자를 맞춘다.
		//-> 단, 컴퓨터는 플레이어가 낸 숫자에 대해서 범위를 알려준다.
		//-> ex) 50->80 -> 더 작운수를 입력해라
		
		//3. 별찍기 1~2~3
		
		//0809
		//continue는 연산을 건너뛰는 것 빠져나오는 게 아니다.
		//if문과 자주사용
		//if(조건)continue;
		// 코드
		// continue를 만나면 코드를 실행안한다.
		
		int menu = 0;
		Scanner foodInput = new Scanner(System.in);
		while(true){
			System.out.println("(1)햄버거");
			System.out.println("(2)탕수육");
			System.out.println("(3)육개장");
			System.out.println("오늘 점심에 먹을 메뉴를 골라라. 종료는 0");
			String temp = foodInput.nextLine();
			menu = Integer.parseInt(temp);
			
			if(menu==0) {
				System.out.println("프로그램을 종료한다.");
				break;
			}
			else if(!(1<=menu&&menu<=3)) {
				System.out.println("메뉴를 잘못선택함. 재입력해라");
				continue;
			}
			System.out.println("선택한 메뉴는 " + menu +"번임");
		}
		foodInput.close();
		}
}