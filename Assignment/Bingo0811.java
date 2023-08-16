package Assignment;

import java.util.Scanner;

public class Bingo0811
{
	public static void main(String[] args)
	{
		int[] number = new int[25];
		int bingoCount = 0;
		int inputNum = 0;
		Scanner scanner = new Scanner(System.in);
		
		//배열 초기화
		for(int i = 0; i<number.length;i++)
		{
			number[i] = i+1;
		}
		//셔플
		for(int i = 0; i <number.length;i++) 
		{
			int k=(int)(Math.random()*25);
			int temp = number[i];
			number[i]=number[k];
			number[k]=temp;
		} // 여기까진 안건드려도 ok
		
		//루프
		//1. 입력받은 숫자를 특수기호로 바꿈
		//2. 나머지 부분 계산
		//3. 3줄이 되면 끝
		while(true)
		{
			System.out.println("빙고 카운트 : " + bingoCount);
			for(int i = 0; i< number.length;i++) 
			{
				if(number[i]==35) { //형상변환
					System.out.print((char)number[i]+"\t");
				}
				else{System.out.print(number[i]+"\t");
				}
				//줄바꿈
				if((i+1)%5==0)
				{
					System.out.print("\n\n");
				}
			}// 여기까지가 반복 출력
			// 빙고가 3개면 정지
			if(bingoCount==3)
			{
				break;
				}
			bingoCount = 0; //3이 아닐경우 재시작전에 초기화
			//입력받기
			System.out.print("숫자를 입력해주세요 : " );
			
			inputNum=scanner.nextInt();
			
			for(int i =0; i<number.length; i++)
			{
				if(inputNum==number[i])
				{
					number[i] = 35;
				}
			}
			//겹치면 변환
				
			for(int i = 0; i<5; i++) //가로세로 빙고
			{
				int widthBingo = 0;
				//가로 빙고
				for(int j = 1; j<5;j++)
				{
					if(number[5*i]==number[5*i+j])
					{
						widthBingo++;
						if(widthBingo==4) 
						{
							bingoCount++;
							}
						}
					}
				//세로 빙고
			int heigthBinggo = 0;
			for(int j =1; j<5; j++) 
			{
				if(number[i]==number[i+j*5])
				{
					heigthBinggo++;
					if(heigthBinggo==4)
					{
						bingoCount++;
						}	
					}
				}
			}
	// 대각선 빙고
			int diagonalBingo =0;
			int reverseDiagonalBingo =0;
			// 대각선\모양
			for(int i = 1; i < 5; i++)
			{			 
				if(number[0]==number[6*i])
				{
					diagonalBingo++;
					if(diagonalBingo==4)
					{
						bingoCount++;
						}	
					}
				}
			// 대각선\모양 
			for(int i = 1; i < 5; i++)
			{
				if(number[4]==number[4+4*i])
				{
					reverseDiagonalBingo++;
					if(reverseDiagonalBingo==4)
					{
						bingoCount++;
						}
					}	
				}
			}
		}
	}