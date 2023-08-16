package ControlStamament;

import java.util.Scanner;

public class RandomNumber0808 {
	public static void main(String[] args) {
		int random = (int)(Math.random()*100+1);
		int choice = 0;
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("1~100 사이 숫자를 맞춰주세요 : ");
			choice=scan.nextInt();
			if(choice>random) {
				System.out.println("맞춰야 하는 숫자보다 큽니다.");
				}
			if(choice<random) {
				System.out.println("맞춰야 하는 숫자보다 작습니다.");
				}
			if(choice==random) {
				System.out.println("맞췄습니다");
				break;
				}
			}
		scan.close();
		}
	}
