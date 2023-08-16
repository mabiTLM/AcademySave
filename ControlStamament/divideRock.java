package ControlStamament;
import java.util.Scanner;
public class divideRock {
	public static void main(String[] args) {
		int random =(int)(Math.random()*3);
		int choice = 0;
		System.out.println("1. 가위 2. 바위 3. 보를 선택해주세요");
		Scanner player = new Scanner(System.in);
		choice = player.nextInt();
		int result = (choice - random)+3;
		if(choice > 3 || choice<1) {
			System.out.println("1~3만 입력해주세요");
		}
		else if(result%3==2) {
			System.out.println("이겼습니다");
			}
		else if(result%3==0) {
			System.out.println("졌습니다");
			}
		else if(result==4) {
			System.out.println("비겼습니다");
			}
		System.out.println("나 : " + choice + ", 컴퓨터 : " + (random+1));
		}
	}