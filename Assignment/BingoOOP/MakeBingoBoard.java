package Divide;

import java.util.Scanner;

class MakeBingoBoard //보드판 초기생성
{
	static int bingoHeight=5; // 해당 빙고판을 바꿔서 사용 할 것 이기에 static 사용
	static int bingoLength=bingoHeight*bingoHeight;
	static int bingoBoard[] =new int[bingoLength];
	
	void setMakeBingo() //빙고 길이조절용
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("몇*몇 빙고를 만들까요? : ");
		int bingoHeight = sc.nextInt();
		this.bingoHeight=bingoHeight;
		this.bingoLength=bingoHeight*bingoHeight;
		int bingoBoard[] =new int[this.bingoLength];
		this.bingoBoard=bingoBoard;
	}
	
	static void makeBingo() //배열 초기화
	{
		for(int i=0; i<bingoLength; i++)
		{
			bingoBoard[i] = i+1;
		}	
	}

	void getMakeBingo() //초기화 확인용
	{
		for(int i=0; i<bingoLength; i++)
		{
			System.out.print(bingoBoard[i]+ "	");
			if((i+1)%bingoHeight==0)
			{
				System.out.println();
				System.out.println();
			}
		}
	}
}//보드판생성끝