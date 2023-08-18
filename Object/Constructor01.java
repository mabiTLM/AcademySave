package Object;

//생성자에서 다른 생성자 호출
//같은 클래스의 멤버들 간에 서로 호출할 수 있는 것처럼
//생성자 간에도 서로 호출이 가능하다.
//1.생성자의 이름으로 클래스 이름 대신 this를 호출
//2.한 생성자에서 다른 생성자를 호출할때는 반드시 철줄에서만 호출가능

class Car01
{
	String color;
	String name;
	int price;
	
	Car01()
	{
		this("하양이","모닝",5);
	}
	Car01(String color)
	{
		//다른 생성자를 호출할때 첫번째에서만 가능한 이유 초기화를 무효시키지 않기위해
		//Car01(String color, String name, int price)를 호출
		this(color,"a",5);
//		color="dd";
		//Car01(color,"a",5); 에러
	}
	Car01(String color,String name,int price)
	{
		this.color = color;//this는 인스턴스 자신의 참조변수를 가르킨다. 정확히는 구별용도가 아니다.
		this.name=name;
		this.price=price;
	}
	//생성자를 이용한 인스턴스 복사
	//참고 : Object 클래스가 있는데 clone
	//인스턴스 복사를 위한 생성자
//	Car01(Car01 c)
//	{
//		color = c.color;
//		name = c.name;
//		price = c.price;
//	}
	Car01(Car01 c)
	{
		this(c.color,c.name,c.price);
	}
}

public class Constructor01 {
	
	public static void main(String[] args)
	{
//		Car01 c1=new Car01();
//		Car01 c2=new Car01("파랑이");
//		
//		System.out.println(c1.color+" , "+c1.name+" , "+c1.price);
//		System.out.println(c2.color+" , "+c2.name+" , "+c2.price);
		
		Car01 c1=new Car01();
		//car01의 복사본 car02 생성한다.
		Car01 c2=new Car01(c1);
		System.out.println(c1.color+" , "+c1.name+" , "+c1.price);
		System.out.println(c2.color+" , "+c2.name+" , "+c2.price);
		
		c1.price=599;
		System.out.println(c1.color+" , "+c1.name+" , "+c1.price);
		System.out.println(c2.color+" , "+c2.name+" , "+c2.price);
	}
}

//과제
//오늘한거 정리
//1.Rectangel Class 만들기
//ㄴ사각형은 가로와 세로 길이를 가지고 있음
//면적과 둘레를 계산하는 메서드가 포함되어야한다.
//결과 출력
//2.Calculator클래스 만들기
//ㄴ사칙연산 메서드 포함. 이거를 활용한 프로그램 만들기
//사칙연산메서드는 오버로딩 구현할것.
//3.Student 클래스 만들기
//이름,학번,나이등등
//생성자를 이용하여 객체를 초기화 할때 필요한 정보를 전달할수있도록한다.