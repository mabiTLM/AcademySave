package Divide;

class Bingostart //만든거 합치기
{
	MakeBingoBoard make = new MakeBingoBoard();
	SuffleBingoBoard suffle = new SuffleBingoBoard();
	BingoChoice choice = new BingoChoice();
	BingoCount count = new BingoCount(); //생성자들 입력
	
	void gameStart() //조립
	{
		make.setMakeBingo();
		make.makeBingo();
		suffle.suffleBingo();
		while(true) 
		{
			suffle.getSuffleBingo();
			count.totalBingo();
			if(count.totalBingoCount>=3)
			{
				break;
			}
			choice.bingoSelect();
		}
	}
}
