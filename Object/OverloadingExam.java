package Object;

import java.util.Arrays;

public class OverloadingExam 
{
	
	public static void main(String[] args)
	{
		//오버로딩
		//한 클래스 내에 같은 이름의 메서드를 여러개 정의 하는것
		//1.메서드 이름이 같아야됨.
		//2.매개변수 갯수 또는 타입이 달라아 한다.
		//ㄴ메서드 이름이 같더라도 매개변수 다르면 서로 구별될수 있기 때문에
		//오버로딩 가능함.
		//f3누르면 정의된곳으로 간다
		
		PrintArray(new int [] {1,2,3,4});
		
		int[] arr = {1,3,4,5,6};
		PrintArray(arr);//매개변수로 전달해서 출력
		
		int sum = calculateSum(arr);
		System.out.println(sum);
		
	}

	int add(int a, int b)
	{
		return a+b;
	}
//	int add(int x, int y){//매개변수의 이름만 다를뿐 매개변수의 타입이 같기 때문에 오버로딩x, 리턴타입만 달라도 x
//		return a+b;}
	
	// 아래는 매개변수는 동일하나 순서가 다르다.
	// 호출될때 매개변수 값에 의해 메서드가 구분되므로 오버로딩으로 간주한다.
//	long add(int a, long b)
//	{
//		return a+b;
//	}
//	long add(long a, int b)
//	{
//		return a+b;
//	}
	
	int sum(int a, int b)
	{
		return a+b;
	}
	long sum(long a, long b)
	{
		return a+b;
	}
	int sum(int [] arr)
	{
		int res = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			res+=arr[i];
		}
		return res;
	}
	
	static void PrintArray(int[] a) 
	{
		System.out.println(Arrays.toString(a));
	}
	static int calculateSum(int[] arr) 
	{
		int sum = 0;
		for(int num : arr)
		{
			sum+=num;
		}
		return sum;
	}
	//배열의 요소의 최대값 구하기
	static int findMaxValue(int[] arr)
	{
		int max = arr[0];
		for(int num: arr) // 배열 요소를 돌면서
		{
			if(num>max) // 현재 요소가 최대값보다 크다면
			{
				max=num; // 최대값을 현재 요소로 업데이트 한다.
			}
		}
		return max;
	}
	
	//배열의 평균 구하기
	
	static double Average(double[] arr)
	{
		double sum = 0;
		for(double value : arr)
		{
			sum+=value;
		}
		return sum/arr.length;
	}
	
	//짝수가 몇개냐?
	
	static int EvenNumber(int[] arr)
	{
		int count = 0;
		for(int num : arr)
		{
			if(num%2==0)//짝수냐
			{
				count++;//그럼 증가
			}
		}
		return count;
	}
	
	//특정값이 있는 인덱스를 찾아라
	
	static int findIndexOfvalue(double[] arr, double target)
	{
		for(int i =0;i<arr.length; i++)
		{
			if(arr[i]==target)
			{
				return i;
			}
		}
		return -1;
	}
	
}
