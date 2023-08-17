package Divide;

class SuffleBingoBoard //셔플시작
{
	MakeBingoBoard make = new MakeBingoBoard();
	void suffleBingo() // 빙고 셔플하기
	{		
		int temp;
		for(int i = 0; i<make.bingoLength; i++)
		{
			int random = (int)(Math.random()*make.bingoLength);
			temp = make.bingoBoard[i];
			make.bingoBoard[i] = make.bingoBoard[random];
			make.bingoBoard[random] = temp;
		}
	}
	void getSuffleBingo() // 셔플된것 출력
	{
		for(int i=0; i<make.bingoLength; i++)
		{
			if(make.bingoBoard[i]==-1)
			{
				System.out.print("#	");
			}
			else
			{
				System.out.print(make.bingoBoard[i]+ "	");
			}
			if((i+1)%make.bingoHeight==0)
			{
				System.out.println();
				System.out.println();
			}
		}
	}
}//보드판 셔플끝