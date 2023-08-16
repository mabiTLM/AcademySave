package ReferenceType;

import java.util.Arrays;
import java.util.Scanner;

public class ReferenceClass02 {
	
	public static void main(String[] args) 
	{
		//int[][] a = new int[4][3];
		
//		//jagged Array 가변 배열
//		int [][] jaggedArr=new int[3][];
//		//첫번째 길이 3
//		jaggedArr[0]=new int[] {1,2,3};
//		//두번째 길이 2
//		jaggedArr[1]=new int[] {4,5};
//		//세번째 길이 4
//		jaggedArr[2]=new int[] {6,7,8,9};
//		
//		for(int i = 0; i<jaggedArr.length; i++)
//		{
//			for(int j = 0; j<jaggedArr[i].length;j++)
//			{
//				System.out.print(jaggedArr[i][j]+" ");
//			}
//			System.out.println();
//		}
//		System.out.println();
//		System.out.println();
//		
//		//배열의 크기를 명시하지 않고 가능
//		int[][] jaggedArr1 ={
//			{1,2,3},
//			{4,5},
//			{6,7,8,9}				
//			};
//		
//		for(int i = 0; i<jaggedArr1.length; i++)
//		{
//			for(int j = 0; j<jaggedArr1[i].length;j++)
//			{
//				System.out.print(jaggedArr1[i][j]+" ");
//			}
//			System.out.println();
//		}
		
//		int[][]grades = {
//				{90,85,73},
//				{59,89,75,61},
//				{35,91,45}
//		};
		
//		for(int i =0; i<grades.length; i++)
//		{
//			System.out.println("못난이"+(i+1)+"의 성적");
//			for(int grade : grades[i])
//			{
//				System.out.println(grade + " ");
//			}
//			System.out.println();
//		}
		
		/////////////////////////
		
		
//		int[][]grades =
//			{
//				{90,85,73},
//				{59,89,75,61},
//				{35,91,45}
//				};
//		int count=1;
//		for(int[] studentGrade : grades)
//		{
//			System.out.println("못난이"+count+"의 성적");
//			for(int grade : studentGrade)
//			{
//				System.out.print(grade + " ");
//				}
//			System.out.println();
//			count++;
//			}
		
		//입력으로
		//1.학생수(입력)
		//ㄴ학생수 입력받는 변수
		
		//2.과목도(입력)
		//ㄴ과목수 입력받는 변수
		
		//입력을 하기위한 녀석
//		Scanner scanner=new Scanner(System.in);
//		
//		System.out.print("학생 수를 입력해라 : ");
//		int studentCount=scanner.nextInt();
//		scanner.nextLine();
//		
//		
//		
//		//학생수에 따른 jagged Array(가변배열)생성
//		int grades[][] = new int[studentCount][];
//		
//		//입력
//		for(int student = 0; student<studentCount;student++)
//		{
//			System.out.print("못난이"+(student+1)+"의 과묵수를 입력해라 : ");
//			int subjectCount=scanner.nextInt();			
//			scanner.nextLine();
//			//각 학생별 과목수에 따른 배열 생성  // 배열을 배열로 묶은 모양이기에 이런 모양이 나온다
//			grades[student] = new int[subjectCount];
//			
//			//성적 입력용 for
//			for(int subject = 0; subject<subjectCount;subject++) 
//			{
//				System.out.print("못난이"+(student+1)+"의 과묵"+(subject+1)+"성적을 입력해라 : ");
//				//각 과목의 성적입력
//				grades[student][subject] = scanner.nextInt();	
//				scanner.nextLine();
//			}			
//		}
//		//출력
//		int studentNumber=1;
//		for(int[]studentGrades: grades) 
//		{
//			System.out.print("못난이"+studentNumber+"성적");
//			for(int grade:studentGrades) 
//			{
//				System.out.print(grade+" ");
//			}
//			System.out.println();
//			studentNumber++;
//		}
//		scanner.close();
		
		
//		int[] numbers=new int[999999999]; //for문과 foreach 결론 시간차이 거의없다 컴파일러가 알아서 최적화를 하기때문
//		long startTime, endTime;
//		
//		int sum = 0;
//		
//		for(int i = 0; i<numbers.length; i++) {
//			numbers[i]=i;
//		}
//		startTime=System.currentTimeMillis();
//		for(int i = 0; i < numbers.length; i++) {
//			sum+=numbers[i];
//		}
//		endTime = System.currentTimeMillis();
//		System.out.println("뽀문 : " + (endTime-startTime)/1000.0+"초");
//		startTime=System.currentTimeMillis();
//		for(int num:numbers) {
//			sum+=num;			
//		}
//		endTime = System.currentTimeMillis();
//		System.out.println("foreach : " + (endTime-startTime)/1000.0+"초");
		
		
		// 혼자해본것
//		int []a = {2,3,4};
//		for(int i : a)
//		{
//			System.out.println(i);
//		}
		// Arrays.copyOf(); 복사전용 메소드가 자바에는 있다
		
//		int[] a = new int[3];
//		int[]numberArr= {5,7,1,3,10};
//		Arrays.sort(numberArr); // 자세히 보니까 upper lower 방식으로 이뤄진듯
//		for(int i : numberArr) 
//		{
//		System.out.println(i);
//		}
		
		////////////////
		//과제저장용
		////////////////
		
		//빙고 종료조건 빙고3개면끝
		
		int[] number = new int[25];
		
		int inputNum = 0;
		int bingoCount = 0;
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
		}
		
		//루프
		//1. 입력받은 숫자를 특수기호로 바꿈
		//2. 나머지 부분 계산
		//3. 3줄이 되면 끝
		while(true)
		{
			System.out.println("빙고 카운트 : " + bingoCount);
			for(int i = 0; i< number.length;i++) 
			{
				System.out.print(number[i]+"\t");
				
				//줄바꿈
				if((i+1)%5==0)
				{
					System.out.print("\n\n");
				}
			}
			
			String inputString=scanner.nextLine();
			inputNum=Integer.parseInt(inputString); //문자를 숫자로 받는다
			 
			
			for(int i = 0; i<5; i++)
			{
				//가로 하드코딩
				if(number[i]==35&&number[i*5+1]==35&&number[i*5+2]==35) { //이런느낌
					bingoCount++;
				}
			}
			
			//형변환으로 받을것
			
			//대각선 0 6 12 18 24 , 4 8 12 16 20
			
					//2번숙제 숫자 퍼즐	
		}
		
		}	
	
	}
