package ControlStamament;

import java.util.Scanner;

public class ForRock0808 {
	public static void main(String[] args) {
		int money=100;
		int total=0;
		int betting = 0;
		int random = 0;
		int choice = 0;
		Scanner scan = new Scanner(System.in);
		while(true) {
			random = (int)(Math.random()*3);
			System.out.println("현재 판수 : " + total + ", 소지금 : " + money);
			if(money<=0||total==10)
			{
				System.out.print("종료합니다.");
				break;
			}
			System.out.print("배팅금액을 정해주세요 : ");
			betting = scan.nextInt();
			if(betting > money || betting <= 0) { // 가진소지금 보다 많거나 음수로 지정 못하게 했습니다.
				System.out.println("배팅금액이 소지금 보다 큽니다. 다시 입력해주세요");
				System.out.println("");
				continue;
			}
			System.out.print("1. 가위 2. 바위 3. 보 : ");
			choice = scan.nextInt();
			int result = (choice - random)+3;
			if(choice > 3 || choice<1) {
				System.out.println("1~3만 입력해주세요");
				System.out.println("");
				continue;
			}
			else if(result%3==2) {
				System.out.println("이겼습니다");
				money += betting*2;
				}
			else if(result%3==0) {
				System.out.println("졌습니다");
				money -= betting*2;
				}
			else if(result==4) {
				System.out.println("비겼습니다");
				money -= betting;
				}
			System.out.println("나 : " + choice + ", 컴퓨터 : " + (random+1)); //선택한 값 확인용
			System.out.println("");
				
			total++;
		}
	}

}
