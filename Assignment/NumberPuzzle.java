package Assignment;

import java.util.Scanner;

public class NumberPuzzle
{
	public static void main(String[] args)
	{
		int[] number = new int[25];
		Scanner scanner = new Scanner(System.in);
		int start = 0;
		int playerChoice = 0;
		
		//배열 초기화 0~24까지
		for(int i = 0; i<number.length;i++)
		{
			number[i] = i;
			}
		//셔플
		for(int i = 0; i <number.length;i++)
		{
			int k=(int)(Math.random()*25);
			int temp = number[i];
			number[i]=number[k];
			number[k]=temp;
			} // 여기까진 안건드려도 ok
		
		while(true)
		{
			for(int i = 0; i< number.length;i++) 
			{
				System.out.print(number[i]+"\t");
				//줄바꿈
				if((i+1)%5==0)
				{
					System.out.print("\n\n");
					}
				if(number[i]==0)//0인곳이 어딘지 저장해두자
				{
					start = i;
				}
			} // 반복출력
			
			int temp = 0; //배열위치
			int tempNumber = 0; //배열 내부 숫자
			System.out.print("어디로 이동할까요 상8 하2 좌4 우6 : ");
			playerChoice = scanner.nextInt();
			switch(playerChoice) {
				case 8 :
				{
					temp = start; // 6
					temp -= 5;
					if(temp<0) 
					{
						temp += 5;
					} // 바깥으로 못넘어가게
					tempNumber = number[temp];
					number[temp] = number[start];
					number[start] = tempNumber;
					break;
				}
				case 2 :
				{
					temp = start; // 6
					temp += 5;
					if(temp>24) 
					{
						temp -= 5;
					} // 바깥으로 못넘어가게
					tempNumber = number[temp];
					number[temp] = number[start];
					number[start] = tempNumber;
					break;
				}
				case 4 :
				{
					temp = start;
					temp -= 1;
					if((temp+1)%5==0)
					{
						temp+=1;
					}
					tempNumber = number[temp];
					number[temp] = number[start];
					number[start] = tempNumber;
					break;
				}
				case 6 :	
				{
					temp = start;
					temp += 1;
					if((temp)%5==0)
					{
						temp-=1;
					}
					tempNumber = number[temp];
					number[temp] = number[start];
					number[start] = tempNumber;
					break;
				}
				default :
				{
					System.out.println("8,4,2,6만 입력해주세요");
				}
			}
		}//end of while
	}//end main
}//end
