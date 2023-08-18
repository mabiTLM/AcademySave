package Object;

//생성자
//인스턴스가 생성될때 호출
//인스턴스 변수의 초기화 작업에 주로 사용
//클래스내에 선언, 구조도 메서드와 유사함.
//클래스와 이름이 같음, 리턴이 없다.

//default Constructor

//사실 모든 클래스에는 반드시 생성자가 정의 되어 있어야 한다.
//생성자를 명시적으로 정의하지 않고도 인스턴스를 생성할 수 있는 이유는 컴파일러가 default Constructor를 자동적으로 추가하기 때문임.

class Student
{
	//디폴트 생성자
	Student(){}
	//오버로딩 가능
	Student(String str, int number){}
}

class Data 
{
	int value;
}

class Data1 
{
	int value1;
	//매개변수가 있는 생성자
	Data1(int n)
	{
		value1=n;
	}
}

class Car
{
	String color;
	String name;
	String type;
	int price;
	
	Car(){}
	Car(String c, String n, String t, int p){
		color = c;
		name = n;
		type = t;
		price = p;
	}
}

public class Constructor 
{
	
	public static void main(String[] args)
	{
		//Student student = new Student();//생성자를 만들지 않아도 컴파일러가 디폴트 생성자를 만들어준다.
		
		Data data = new Data();
		data.value=5;
		System.out.println(data.value);
		
		Data1 data1 = new Data1(1);
		System.out.println(data1.value1);
		//Data1 data4 = new Data1(); 생성자가 있으면 디폴트 생성자를 만들지 않는다.
		//Data1()//정의가 되지 않았다.
		
		Car hyundai = new Car();
		hyundai.color = "검정";
		hyundai.name = "그랜저";
		hyundai.price = 5000;
		hyundai.type="auto";
		
		Car kia = new Car("빨강","모닝","auto",1000);
		
		System.out.println("현대 색상 : " + hyundai.color+"이름 : " + hyundai.name+"가격 : "+hyundai.price+"타입 : "+hyundai.type);
		System.out.println("기아 색상 : " + kia.color+"이름 : " + kia.name+"가격 : "+kia.price+"타입 : "+kia.type);
	}

}
