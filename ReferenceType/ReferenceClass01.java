package ReferenceType;

import java.util.Arrays;

public class ReferenceClass01 {

	public static void main(String[] args)
	{
		//1차원 배열
		int[] number = new int[4];
		
		//2차원 배열()
		//타입[][] 변수이름; = int [][] score;
		//타입 변수이름[][]; = int score[][];
		//타입[] 변수이름[]; = int[] score[];
		//4X3 2차원 배열을 생성한다면?[행 세로][열 가로]
		//int[][] score = new int[4][3];
//		-------3열-----
//	|	int		int		int
//	4	int		int		int
//	행	int		int		int
//	|	int		int		int
		//2차원 배열 초기화
//		
//		int [][] arr= new int[][] {{1,2,3},{4,5,6}};
//		int [][] arr1= {{1,2,3},{4,5,6}};
//		int [][] arr2 = {
//				{1,2,3},
//				{4,5,6}
//		};
		
		
		int [][] score = { //여러 1차원 배열을 하나로 묶은것
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50},
		};
//		System.out.println("2차원 배열 score의 길이 : "+score.length);
//		System.out.println("2차원 배열 score[0]의 길이 : "+score[0].length);
//		System.out.println("2차원 배열 score[1]의 길이 : "+score[1].length);
//		System.out.println("2차원 배열 score[2]의 길이 : "+score[2].length);
//		System.out.println("2차원 배열 score[3]의 길이 : "+score[3].length);
//		System.out.println("2차원 배열 score[4]의 길이 : "+score[4].length);
//		
//		
//		int [][]num= new int[4][3];
//		for(int i = 0; i <num.length; i++) 
//		{//4
//			for(int j = 0; j<num[i].length;j++)
//			{//3
//				num[i][j] = 70; //모든 요소를 70으로 초기화
//			}
//		}
//		int [][] score = { 
//				//국어 영어 수학
//				{100,100,100},
//				{20, 20, 20},
//				{30, 30, 30},
//				{40, 40, 40},
//				{50, 50, 50},
//		};
//		for(int i = 0; i <score.length; i++) 
//		{
//			for(int j = 0; j<score[i].length;j++)
//			{
//				 System.out.printf("점수[%d][%d]=%d\n" ,i,j,score[i][j]);
//			}
//		}
		// 5명의 학생의 세 과목을 더해서 각 학생의 총점과 평균을 계산하고
		// 과목별 총점을 계산해라
		
//		String []sub = {"국어" , "영어" , "수학"}; //과목코드
//		int sum[] = new int[5]; //학생별합
//		int subsum[] = new int[3]; //과목별합
//		for(int i = 0; i<score.length; i++) 
//		{
//			for(int j =0; j<score[i].length; j++) 
//			{
//				sum[i] += score[i][j]; 
//				subsum[j] += score[i][j];
//			}
//			System.out.println(i+1+"번째 학생의 총점 : "+sum[i] + ", 평균 : " + sum[i]/3);
//		}		
//		for(int i = 0; i<score[i].length; i++) 
//		{	
//			System.out.println(sub[i] + "과목의 총점 : " + subsum[i]);
//		}
		
		
//		int [] arr = {1,2,3,4,5};
//		for(int i = 0; i<arr.length; i++)
//		{
//			System.out.println(arr[i]);
//		}
//		System.out.println("=================");
//		
//		for(int i : arr) { //간편하지만 읽기전용
//			System.out.println(i);
//		}
//		for(int i = 0; i<arr.length; i++)
//		{
//			System.out.println(arr[i]);
//		}
		//기본적인 for
		//
		
		int sum=0;
		for(int[] temp:score) { //score의 각 요소6(1차원 배열 주소)를 temp저장
			for(int i:temp)
			{
				sum+=i;
			}
		}
		System.out.println("sum : " + sum);

		
		
//혼자해본 출력		
//		for(int i = 0; i<4; i++) {
//			for(int j = 0; j<3; j++) {
//			System.out.print(score[i][j]);
//			if(j==2) {System.out.println("");
//			}
//			}
//			//System.out.println(Arrays.toString(score[i]));
//			}
	}
}
