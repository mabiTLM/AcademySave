package Object;

class Example
{
	void Print() {
		//void 이므로 리턴타입 없음
		System.out.println("Print 함수 호출");
	}
	int num(){
		return 3;
	}
	int sum(int a, int b){
		return a+b;
	}
	void PrintMonth(int num){
		if(num<0||num>12) 
		{
			System.out.println("잘못된 입력");
			return;//함수끝내라
		}
		else {
			System.out.println(num+"임");
		}
	}
}

class Calculator
{
	int num1;
	int num2;
	
	void setNum(int num1, int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	int add()
	{
		return num1+num2;
	}
	int minus()
	{
		return num1-num2;
	}
	double divide() 
	{
		double num1 = this.num1;
		double num2 = this.num2;
		return num1/num2;
	}
	void getDivide() 
	{
		System.out.println("나누기 "+divide());
	}
	int multiple() 
	{
		return num1*num2;
	}
}

class MyMath
{
	int a;
	int b;
	
	int add()
	{
		return a+b;
	}
	int subStract() 
	{
		return a-b;
	}
	//인스턴스 변수와 관계없이 매개변수로 처리
	static int add(int a, int b) //a,b는 local Variable
	{
		return a+b;
	}
}

public class Class03
{
	//method
	//반환타입 메서드이름(요기는 매개변수->경우에따라 O,X) //선언부
	//{
		//호출되면 실행할코드 = > 구현부
	//}
	
//	int add(int a, int b) 
//	{
//		int result=a+b;
//		return result; //void가 아닌경우 반드시 return이 필요
//		//return a+b;
//	}
//	void Print(int a)
//	{
//		System.out.println(a);
//	}
	
	
	public static void main(String[] args)
	{
		Example example = new Example();
		
		example.Print();
		example.PrintMonth(0);
		example.PrintMonth(20);
		int number = example.num();
		System.out.println(number);
		int result = example.sum(3, 4);
		System.out.println(result);
		
		//실습
		// +, -, *, / 메서드 구현후 각 해당 메서드를 호출해라
		
		Calculator cal = new Calculator();
		cal.num1 = 30;
		cal.num2 = 10;
		System.out.println("더하기 "+cal.add());
		System.out.println("빼기 "+cal.minus());
		cal.getDivide();
		System.out.println("곱하기 "+cal.multiple());
		
	}
}

//static method(클래스 메서드), instance method
/*
 1.메서드 앞에 static이 있으면 클래스 메서드, 없으면 인스턴스 메서드
 2.클래스 메서드는 클래스이름.메서드이름으로 호출가능.인스턴스 메서드는 객체를 생성해야만 호출가능
 3.인스턴스 메서드는 인스턴스 변수와 관련된 작업을 한다.
 ㄴ작업을 수행하는데 인스턴스 변수를 필요로하는 메서드
 4. 클래스 메서드는 인스턴스와 관계가 없는 것을 정의한다.
 5. 클래스 메서드는 인스턴스변수를 사용할 수 없다. 메서드 내에서 인스턴스 변수를 안쓸것 같으면 static 상대적으로 static이 짧다.
 6. 
 
 */