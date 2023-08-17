package Divide;

class BingoCount //가로 세로 대각선 빙고 확인
{
	MakeBingoBoard make = new MakeBingoBoard();
	int totalBingoCount = 0;
	
	void slashBingo() //대각선 빙고
	{
		int diagonalBingo = 0;
		int revsereDiagonalBingo=0;
		for(int i = 1; i<make.bingoHeight;i++)
		{
			if(make.bingoBoard[0]==make.bingoBoard[(make.bingoHeight+1)*i])
			{
				diagonalBingo++;
			}
			if(diagonalBingo==(make.bingoHeight)-1)
			{
				totalBingoCount++;
			}
			if(make.bingoBoard[(make.bingoHeight)-1]==make.bingoBoard[((make.bingoHeight)-1)*(i+1)])
			{
				revsereDiagonalBingo++;
			}
			if(revsereDiagonalBingo==(make.bingoHeight)-1)
			{
				totalBingoCount++;
			}
		}
	}
	
	void horizontalBingo()//가로빙고
	{
		int widthBingo = 0;
		for(int i = 0; i<make.bingoLength-1; i++) 
			{
			if(i%make.bingoHeight==make.bingoHeight-1)
			{
				widthBingo =0;
			}

			else if(make.bingoBoard[i]==make.bingoBoard[i+1])
			{
				widthBingo++;
				if(widthBingo==(make.bingoHeight)-1)
				{
					totalBingoCount++;
				}
			}
		}
	}
	
	void verticalBingo() //세로빙고
	{
		int heigthBinggo = 0;
		int heigthTemp = 0;
		for(int i = 0; i<make.bingoLength; i++)
		{
			if((i%make.bingoHeight==make.bingoHeight-1))
			{
				heigthBinggo =0;
				heigthTemp +=make.bingoLength;
			}
			else if(make.bingoBoard[i/make.bingoHeight+i*make.bingoHeight-heigthTemp]==make.bingoBoard[i/make.bingoHeight+(i+1)*make.bingoHeight-heigthTemp])
			{
				heigthBinggo++;
				if(heigthBinggo==make.bingoHeight-1)
				{
					totalBingoCount++;
				}
			}
		}
	}
	
	void totalBingo() //빙고인 경우 합치기
	{
		totalBingoCount=0;
		slashBingo();
		horizontalBingo();
		verticalBingo();
		System.out.println("현재 빙고수 : "+totalBingoCount);
		System.out.println();
	}
	
}