package ReferenceType;

public class DontDoubleFor {
	public static void main(String[] args) {
		int [][] score = { //여러 1차원 배열을 하나로 묶은것
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50},
				};
		int j = 0;
		
		String []sub = {"국어" , "영어" , "수학"}; //과목코드
		int sum[] = new int[5]; //학생별합
		int subsum[] = new int[3]; //과목별합
		for(int i = 0; i<score.length*score[0].length; i++)
		{
			int height = i/score[0].length; //0 0 0 1 1 1
			int width = i%score[0].length; // 0 1 2 0 1 2
			sum[height] += score[height][width];
			subsum[width] += score[height][width];

		}
		for(int i = 0; i<score.length; i++)
		{
			System.out.println(i+1+"번째 학생의 총점 : "+sum[i] + ", 평균 : " + sum[i]/3);
			}
		for(int i = 0; i<score[i].length; i++)
		{
			System.out.println(sub[i] + "과목의 총점 : " + subsum[i]);
			}
		}		
	}
