package Assignment;

import java.util.Random;

public class AssignmentClass {
	public static void main(String[] args) 
	{
//		//숫자야구
//		int[]number = new int[10];
//		int[]comNumber = new int[3];
//		int []myNumber=new int[3];
//		
//		int ballCount;
//		int strikeCount;
//		//숫자초기화
//		for(int i = 0; i<number.length;i++) {
//			number[i] = i;
//		}
//		
//		//Random random = new Random();
//		//셔플
//		for(int i = 0; i<number.length;i++) { //몇번이든 늘려도 되지만 밑에 i가 있어서 10까지만 넘길려면 밑에 변수를 변경
//			//random.nextInt(100);//0~99까지 난수발생
//			int k = (int)(Math.random()*10);
//			int temp = number[i];
//			number[i]=number[k];
//			number[k]=temp;
//		}//0~9 배열을 정한후 그 순서를 바꿈으로써 중복되지 않게 만드는 작업
//		
//		//초기화 하고 셔플했으니 그 수를 컴퓨터한테 넣어줌
//		//=>난수발생 시킨 데이터 3개를 대입
//		
//		for(int i = 0; i < comNumber.length; i++)
//		{
//			comNumber[i]=number[i];
//		}
//		for(int i = 0; i < comNumber.length; i++)
//		{
//			System.out.print(comNumber[i]+" ");
//		}
//		System.out.println();
//		System.out.println();
//		
//		Scanner input = new Scanner(System.in);
//		while(true)
//		{
//			System.out.println("0~9까지 숫자를 입력해라");
//			for(int i =0; i < myNumber.length;i++) 
//			{
//				myNumber[i]=input.nextInt();
//			}
//			ballCount=0;
//			strikeCount=0;
//			
//			//비교하자
//			//콤퓨타
//			for(int i =0; i<comNumber.length; i++)
//			{
//				//멍청한 유저
//				for(int j = 0; j <myNumber.length; j++)
//				{
//					//콤퓨타 숫자와 내가 선택한 숫자가 같냐??
//					if(comNumber[i]==myNumber[j]) 
//					{
//						//자리까지 같음?
//						if(i==j) 
//						{
//							strikeCount++;
//						}
//						else
//						{
//							ballCount++;
//						}
//					}
//				}
//			} //end of for
//			
//			System.out.print(ballCount + " 볼 "+ strikeCount+"스트라잌\n");
//			if(strikeCount==3)
//			{
//				System.out.println("끝");
//				break;
//			}
//		}//end of while
		
		//이번주 행복을 위한 로또번호생성기 만들기
		//배열에 랜덤하게 데이터를 저장 1~45
		//6개 추출
		
		
		int []lotto = new int[45];
				
		for(int i =0; i <45; i++)
		{
			lotto[i] = i+1;
		}
		
		for(int i =0; i <45; i++)
		{
			int random = (int)(Math.random()*44)+1;
			int temp = lotto[i];
			lotto[i] = lotto[random];
			lotto[random] = temp;
		}
		
		System.out.print("로또번호는 :");
		for(int i = 0; i < 6; i++)
		{
			System.out.print(" "+lotto[i]);
		}
		System.out.println("");
		
		//다른 랜덤 사용
		
		Random ran = new Random();
		int[] lotto2 = new int[45];
		
		for(int i =0; i <45; i++)
		{
			lotto2[i] = i+1;
		}
		
		for(int i =0; i <45; i++)
		{
			int random2 = ran.nextInt(44)+1;
			int temp2 = lotto2[i];
			lotto2[i] = lotto2[random2];
			lotto2[random2] = temp2;
		}
		System.out.print("로또번호는 :");
		for(int i = 0; i < 6; i++)
		{
			System.out.print(" "+lotto2[i]);
		}	
		
	}
}
