package Divide;

import java.util.Scanner;

class BingoChoice // 빙고 선택
{
	MakeBingoBoard make = new MakeBingoBoard();
	Scanner sc = new Scanner(System.in);
	int choice = 0;
	void bingoSelect() //숫자 선택
	{
		System.out.print("숫자를 입력해주세요 : ");
		choice = sc.nextInt();
		for(int i=0 ; i<make.bingoLength;i++) //선택 숫자가 빙고판에 있으면 바꿔주기
		{
			if(choice ==make.bingoBoard[i])
			{
				make.bingoBoard[i]=-1;
			}
		}
	}
	
}
