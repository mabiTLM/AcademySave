package ReferenceType;

import java.util.Scanner;

public class For3sumaver {
	
	public static void main(String[] args) 
	{
		int student = 0;
		int inputScore = 0;
		Scanner scan = new Scanner(System.in);
		String []sub = {"국어" , "영어" , "수학"}; //과목코드
		System.out.print("몇명의 점수를 입력 받고 싶은가? : ");
		student = scan.nextInt();
		int [][] score = new int[student][sub.length];
		
		for(int i =0; i < student; i++) 
		{
			for(int j = 0; j<sub.length; j++) 
			{
				System.out.printf(i+1+"번째 학생의 " +sub[j]+"과목의 점수 : ");
				inputScore = scan.nextInt();
				score[i][j] = inputScore;
			}
		}
		

		float sum[] = new float[student]; //학생별합
		float average[] = new float[student]; //평균
		int subsum[] = new int[sub.length]; //과목별합
		
		for(int i = 0; i<score.length; i++) 
		{
			for(int j =0; j<score[i].length; j++) 
			{
				sum[i] += score[i][j]; 
				subsum[j] += score[i][j];
			}
			average[i] = sum[i]/3;
			System.out.println(i+1+"번째 학생의 총점 : "+sum[i] + ", 평균 : " + average[i]);
		}
		
		for(int i = 0; i<sub.length; i++) 
		{	
			System.out.println(sub[i] + "과목의 총점 : " + subsum[i]);
		}
	}

}

