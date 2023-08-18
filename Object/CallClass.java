//package Object;
//
//class Data
//{
//	int x;
//}
//
//public class CallClass 
//{
//	public static void main(String[] args)
//	{
////		Data d = new Data();
////		d.x=10;
////		System.out.println("메인에서의 x : "+d.x);
////		
////		Change(d.x);
////		System.out.println("Change(d.x)이후");
////		System.out.println("메인에서의 x : " + d.x);
////		
////		System.out.println("==================");
////		Change(d);
////		System.out.println("Change(d)이후");
////		System.out.println("메인에서의 x : " + d.x);
////		System.out.println("==================");
//		
//		Data c = new Data();
//		c.x=10;
//		
//		Data c2 = copy(c);
//		//1. copy메서드를 호출하면서 참조변수 c의 주소가 매개변수 d에 복사
//		//2. 새로운 객체를 생성한 다음에 d.x에 저장된 값을 temp.x에 복사
//		//3. copy메서드 종료 -> 리턴한 temp의 값은 참조변수 c2에 저장
//		//4. copy메서드 종료(temp 사라짐) c2로 새로운 객체를 사용할 수 있음.
//		
//		
//		System.out.println("c의 값 : "+c.x + " c의 값 : " +c2.x);
//	}
//	
//	static void Change(int x) //대입이 아닌 복사가 이루어진다
//	{
//		x=100;
//		System.out.println("Change메서드의 x : " + x);
//	}//끝나는 순간 매개변수는 사라진다 콜바이밸류
//	
//	static void Change(Data d) //주소값이 복사
//	{
//		d.x=100;//참조한 변수를 변경
//		System.out.println("Change메서드의 x : " + d.x);
//	}//콜바이레퍼런스차이점
//	
//	//참조형
//	static Data copy(Data d) //리턴 타입이 참조형
//	{
//		Data temp = new Data(); //새로운 객체 temp를 만들고
//		temp.x=d.x; //d.x의 값을 temp.x에 복사
//		return temp; //참조형 리턴
//	}
//
//}
