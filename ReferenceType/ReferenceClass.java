package ReferenceType;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ReferenceClass {
	public static void main(String[] args) {
		//배열
		//같은 Type의 여러 variable을 하나의 묶음으로 다루는것.
		//같은 타입이여야 하고(데이터타입이 동일)서로 다른 타입의
		//변수들로 구성된 배열은 불가
		//int a1;
		//intb2;
		//1000개면 어찌할래
		//배열선언하기
		//1. 타입[] 변수이름;
		//int[] score;
		//String[] name;
		
		//2. 타입 변수이름[];
		//int score[];
		//char a[];
		//배열을 선언한 다음에는 배열을 생성
		//배열을 선언하는 것은 단지 생성된 배열을 다루기 위한 참조변수를 위한 공간만 만들어지는 것임.
		//배열을 생성하기 위해서는 new를 이용해 배열의 타입과 길이를 지정해줘야함.
		//타입[] 변수이름; => 배열을 선언(배열을 다루기 위한 참조변수 선언)
		//변수이름 = new 타입[길이]; => 배열을 생성(실제 데이터가 저장될 공간)
		//int[] = score; => int타입의 배열을 다루기 위한 score참조변수 선언
		//score = new int[5]; => int 타입의 값 5개를 저장 할 수 있는 배열
		//아래와 같이 한방에 ㄱㄱ
		//int[] score = new int[5];
		//1.int[] score;
		//int 형 배열 참조변수인 score을 선언. 데이터를 저장할수 있는 공간은 아직 x
		//2.score = new int[5];
		//연산자 new에 의해서 메모리의 빈 공간에 5개의 int형 데이터를 저장할 수 있는 공간
		//score			score[0]	score[1]	score[2]	score[3]	score[4]
		//				0x100
		//int의 default인 0으로 초기화가됨
		//마지막 대입연산자 =로 인해서 배열의 주소가 int형 배열 참조 변수인 score에 저장
		// 배열의 인덱스를 벗어나는 경우를 주의 변수는 실행할 때 대입되기에 컴파일러가 확인해 줄 수 없다.
		
		//생성된 배열의 각 저장 공간을 배열의 요소라고함.
		//인덱스는 배열의 요소마다 붙여진 일종의 순차적인 번호라고 보면된다.
		//인덱스를 이용하여 각 배열의 요소에 접근한다.
		int[] score = new int[5];
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]); //0부터 시작이므로 선언-1 이다.
		
		int k = 1;
		
		score[0] = 10;
		score[1] = 20;
		score[k+1] = 30; //score[2] = 30;
		score[3] = 40;
		score[4] = 50;
		System.out.println("score[4]에 저장된 데이터 : " + score[4]);
		for(int i=0; i<5; i++) {
			System.out.printf("score[%d] :%d ",i,score[i]);
		}
//		int temp = score[k+2]+score[4]; //int temp = score[3]+score[4];
//		System.out.println("");
//		System.out.println(temp);
//		for(int i=0; i<score.length; i++) {
//			System.out.printf("score[%d] :%d\n",i,score[i]);
//		}
		int[] number=new int[10];
		//number.length = 15; 불가능! 상수
		
//		for(int i = 0; i < 11; i++) { //길이를 벗어나서 당연히 에러
//			System.out.println(number[i]);
//		}
		for(int i = 0; i<number.length; i++) {
			number[i] = i+1;
			System.out.printf("number[%d] :%d\n",i,number[i]);
		}
		//요로한 방법도 있음
//		int[] arr = new int[] {10,20,30,40,50};
//		for(int i = 0; i<arr.length; i++) {
//			System.out.printf("arr[%d] :%d\n",i,arr[i]);
//		}
//		//new 키워드를 빼도됨.
//		int[] arr1= {100,50,123,568};
//		for(int i = 0; i<arr1.length; i++) {
//			System.out.println(arr1[i]);
//		}
//		String a = "실험용";
//		String b = "생쥐";
//		String[] arr10 = {a,b};
//		for(int i = 0; i<arr10.length; i++) {
//			System.out.println(arr10[i]);
//		}
		
		//실습
		//4개의 과목이 있음.
		//사용자 입력을 받는다.(점수입력)
		//점수를 입력한 데이터를 배열에 저장
		//배열의 저장된 점수의 합과 평균을 구해라
		
//		final int NUM = 4;
//		Scanner scan = new Scanner(System.in);
//		double subScore = 0;
//		double[] saveScore = new double[NUM] ;
//		double sum = 0;
//		for(int i = 0; i<saveScore.length; i++) { // 배열에 저장하기
//			System.out.print("점수를 입력해주세요 : ");
//			subScore = scan.nextInt();
//			saveScore[i] = subScore;
//		}
//		for(int i = 0; i<saveScore.length; i++) { //배열에 저장된 값 불러오기 위에 하나로 합쳐도되지만 구분을 위해서
//			sum +=  saveScore[i];
//		}
//		
//		System.out.println("배열의 합 : " + sum + ", 배열의 평균 : " + sum/saveScore.length);
//		// 추가로 만들어 본 것
//		String[] sub = {"국어","영어","수학","과학"}; 
//		for(int i =0; i<sub.length;i++) {
//			System.out.println(sub[i]+"과목의 점수 :" + saveScore[i]);
//		}
		 // 예제
//		final int NUM = 4;
//		int [] scores = new int[NUM];
//		int sum = 0;
//		Scanner scanner = new Scanner(System.in);
//		//입력받기
//		for(int i = 0; i < NUM; i++)
//		{
//			System.out.print("과목 " +(i+1) + "의 점수를 입력해라");
//			scores[i] = scanner.nextInt();
//			sum+=scores[i];
//		}
//		scanner.close();
//		double average = sum /NUM;
//		System.out.println("합계 : " + sum);
//		System.out.println("평균 : " + average);
		
//		배열의 복사
//		기본적으로 배열을 한번 생성하면 그 길이를 변경 할 수 없음
//		더 많은 공간이 필요하면 큰 배열을 새로 만들어서 기존 배열로 부터 copy를 해야함.
//		for문을 이용해서 배열을 복사하는 방법
//		int [] arr = new int[5];
//		int [] temp= new int[arr.length*2];//기존 배열보다 길이가 2배인 배열
//		for(int i = 0; i < arr.length; i++) {
//			temp[i]=arr[i]; //arr[i]값을 temp[i]에 저장
//		}
//		arr=temp;
//		System.out.println(arr[9]);
		//참조변수 arr이 새로운 배열을 가르케한다.
		//배열 arr의 길이인 arr.length의 값이 5이므로 길이가 10인 int배열 temp가 생성되고 배열 temp의 각 0으로 초기화
//		arr			arr0	arr1	arr2	arr3	arr4
//		0x123		1		2		3		4		5
//		temp		temp0	temp1	temp2	~~~		temp9
//		0x456		1		2		3		4 5	0	0	0	0	0
// arr에 참조 변수 temp를 저장하라 arr = 0x456 저장되는 순간 기존 arr[]은 gc가 돌아가서 사라지고 arr은 temp[]를 가르킨다.

		//배열복사
		int[] arr = new int[5];
		for(int i = 0; i< arr.length;i++) {
			arr[i]=i+1;//arr[0]부터 순차적으로 값을 대입한다.
		}
		System.out.println("[변경전]");
		System.out.println("arr의 길이 : " +arr.length);
		
		for(int i = 0; i<arr.length;i++) {
			System.out.println("arr["+i+"] : "+arr[i]);
		}
		
		int[]temp = new int[arr.length*2];
		for(int i =0; i < arr.length;i++) {
			temp[i]=arr[i];
		}
		arr=temp;//temp에 저장된 값(주소값)을 arr에 저장한다.
		System.out.println("[변경후]");
		System.out.println("arr의 길이 : " +arr.length);
		for(int i = 0; i<arr.length;i++) {
			System.out.println("arr["+i+"] : "+arr[i]);
		}
		
		//과제
		//1. 배열의 요소 중에서 제일 큰 값과 제일 작은값을 찾는다.
		//ex) 78,10,5,100,98
		//결과(최대값) 100, (최소값) : 5
		//2.숫자야구 게임
		//1~9 3개의 숫자를배열
		//숫자만 맞으면 볼 숫자와 위치가 맞으면 스트라이크 3개다 맞추면 승리
	}
}
