package Object;

//import java.util.Scanner;
////다른 패키지의 클래스를 사용하고자 할 때 포함
//import ReferenceType.ReferenceClass01;
//
////외부클래스
////public 키워드는 쓸 수 없다.
//class Student 
//{
//	
//}
////public 바깥에 package, import, 외부클래스
//
class TV
{
	String color; // 인스턴스 변수
	boolean power;
	int channel;
	
	void power()
	{
		power = !power;
	}
	
	void ChannelUp() 
	{
		channel++;
	}
	
	void ChannelDown()
	{
		channel--;
	}
		
}
//
//
//
////클래스는 대문자로 시작한다.
//public class Class01 // public이 붙은 클래스는 파일명과 동일해야 한다.
//{
//	int a = 3; //인스턴스변수
//	
//	static int num = 5; //클래스변수
//	
//	//메서드 : 클래스가 지니고 있는 기능..
//	//사람과 관련된 클래스라면 밥먹기, 운동하기 등등..
//	
//	//int sum(int a, int b) 메서드
//	
//	//Class01(){} 생성자 한번만 호출가능
//	//Class01(int a, int b){} 오버로딩
//	//class Test{} 이너클래스
//	
//	
//	public static void main(String[] args)
//	{	
//		TV tv; // 인스턴스를 참조하기 위한 변수 선언
//		tv = new TV(); //인스턴스 생성
//		tv.channel=11; // tv의 인스턴스 변수인 channel값을 11로 한다.
//		tv.ChannelDown();// tv 인스턴스 메서드 ChannelDown()호출
//		System.out.println("현재 내가 누른 채널은 : " + tv.channel+"임");
//		
//		TV tv1 = new TV();
//		tv1.channel=12;
//		tv1.ChannelDown();
//		System.out.println("현재 내가 누른 채널은 : " + tv1.channel+"임");
//	}
	
	//오늘 과제
	//클래스
	//클래스란 무엇인가?
	//클래스의 구성요소
	//인스턴스 변수 및 인스턴스 메서드
	//학생이라는 클래스를 만들어서
	//이름, 나이, 학번, 키, 전화번호가 있고
	//학생정보를 출력하는 메서드를 만들어서 출력해라.

//0817
public class Class01 // public이 붙은 클래스는 파일명과 동일해야 한다.
{
	public static void main(String[] args) {
	
	TV tv1; 
	tv1 = new TV(); 
	tv1.channel=11; 
	tv1.ChannelDown();
	System.out.println("현재 내가 누른 채널은 : " + tv1.channel+"임");
	
	TV tv2;
	tv2 = new TV(); 
	tv2.channel=12; 
	tv2.ChannelDown();
	System.out.println("현재 내가 누른 채널은 : " + tv2.channel+"임");
	
	
	tv2=tv1; //둘 이상의 참조변수가 하나의 인스턴스를 가르키는것은 가능
	tv1.channel=7; // 하나의 참조변수가 둘 이상의 인스턴스를 가르키는것은 불가능
	System.out.println("tv1의 channel : "+tv1.channel);
	System.out.println("tv2의 channel : "+tv2.channel);
	
	//TV tv1,tv2,tv3;
//	TV[] tvArr = new TV[3];//참조변수 배열을 만들고
	
	//객체를 생성-> 배열에 각요소에 저장
//	tvArr[0]= new TV();
//	tvArr[1]= new TV();
//	tvArr[2]= new TV();
	//TV[] tvArr = {new TV(),new TV(),new TV()};
	
//	TV[] tvArr = new TV[100];
//	
//	for(int i = 0; i<tvArr.length;i++)
//	{
//		tvArr[i]=new TV();
//	}
	
	TV[] tvArr = new TV[3];
	
	for(int i = 0; i<tvArr.length;i++)
	{
		tvArr[i]=new TV();
		tvArr[i].channel=i+10;
		
		System.out.printf("tvArr[%d].channel = %d\n",i,tvArr[i].channel);
	}
	
	for(int i = 0; i<tvArr.length;i++)
	{
		tvArr[i].ChannelUp(); //tv[i]의 메서드를 호출. 채널이 1씩증가
		
		System.out.printf("tvArr[%d].channel = %d\n",i,tvArr[i].channel);
	}
	
	}

}
