package ReferenceType;

import java.util.Scanner;

public class BaseBall0809 {
	public static void main(String[] args) {
		int total = 1;
		int[] playerchoice = new int[3];
		int[] comchoice = new int[5]; //중복되지 않게 빈공간 두개 할당
	
		Scanner scan = new Scanner(System.in);
		for(int i = 2; i <5; i++) { 
			while(true) {
			comchoice[i] = (int)(Math.random()*9)+1;
			if((comchoice[i-1]!=comchoice[i])&(comchoice[i-2]!=comchoice[i])) { //중복되지 않게 처리
				break;				
			}}
			System.out.println("난수 확인용 " + comchoice[i]);
		}//여기까지가 컴퓨터가 게임 구성
		
		//플레이어 시작
		while(true) {
			int strike = 0;
			int ball = 0;
		for(int i = 0; i <=2; i++) {
			System.out.print(i+1+"번째 숫자를 입력하시오 : ");
			playerchoice[i] = scan.nextInt();
			
			if(playerchoice[i]==comchoice[i+2]) {
				strike += 1;
			}
			
			else if(playerchoice[i]==comchoice[4]||playerchoice[i]==comchoice[3]||playerchoice[i]==comchoice[2]) {
				ball += 1;
			}
			//System.out.println("작동 확인용 " + strike);
			//System.out.println("확인용 " + ball);
		}
		System.out.println("결과는 스트라이크 : " + strike + ", 볼 : " + ball);
		System.out.println("현재" + total +"판째입니다.");
		if(strike==3) {
			System.out.println("이겼습니다.");
			System.out.println("숫자는 : " +comchoice[2]+" "+comchoice[3]+" "+comchoice[4]+" 였습니다.");
			break;
		}
		
		else if(total == 10) {
			System.out.println("졌습니다.");
			break;
		}
		total +=1;

		}
	}
}