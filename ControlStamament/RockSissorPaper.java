package ControlStamament;

import java.util.Scanner;
public class RockSissorPaper {
	public static void main(String[] args) {
	int random =(int)(Math.random()*3)+1;
	int choice = 0;
	String result = " ";
	String playerResult = " ";
	String computerResult = " ";
	Scanner player = new Scanner(System.in);
	System.out.println("1. 가위 2. 바위 3. 보를 선택해주세요");
	System.out.print("선택 : ");
	choice = player.nextInt();
	
	if(choice==1) {
		if(random==1) {
			playerResult = "가위";
			computerResult = "가위";
			result = "비겼습니다.";
		}
		if(random==2) {
			playerResult = "가위";
			computerResult = "바위";
			result = "졌습니다.";
		}
		if(random==3) {
			playerResult = "가위";
			computerResult = "보";
			result = "이겼습니다.";
		}
	}
		
	else if(choice==2) {
		if(random==1) {
			playerResult = "바위";
			computerResult = "가위";
			result = "이겼습니다.";
		}
		if(random==2) {
			playerResult = "바위";
			computerResult = "바위";
			result = "비겼습니다.";
		}
		if(random==3) {
			playerResult = "바위";
			computerResult = "보";
			result = "졌습니다.";
		}
		
	}
			
	else if(choice==3) {
		if(random==1) {
			playerResult = "보";
			computerResult = "가위";
			result = "졌습니다.";
		}
		if(random==2) {
			playerResult = "보";
			computerResult = "바위";
			result = "이겼습니다.";
		}
		if(random==3) {
			playerResult = "보";
			computerResult = "보";
			result = "비겼습니다.";
		}
	}
	
	else {
		System.out.println("1~3사이만 입력해주세요.");
		player.close();
		return;
	}
	System.out.println("나 : " + playerResult + ", 컴퓨터 : " + computerResult);
	System.out.println(result);
	player.close();

	}

}
