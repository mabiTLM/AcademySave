package Object;

public class Exam
{
	//같은 패키지 내에서만 사용가능하다.
	void packagePrivateMethod() { //디폴트
		System.out.println("나는 packagePrivateMethod!!");
	}
	
	//같은 패키지영역에서만 사용가능
	static void staticMethod() 
	{
		System.out.println("나는 staticMethod!! 클래스 이름으로 호출 가능");
	}
	
	//오로지 나밖에 모름
	private void PrivateMethod() 
	{
		System.out.println("나는 PrivateMethod!! 나만의 비자금");
	}
	
	private static void staticPrivateMethod() 
	{
		System.out.println("나는 staticMethod!! 클래스 이름으로 호출 가능");
	}
	
	public void publicMethod() 
	{
		System.out.println("나는 publicMethod!!");
	}
	
	public static void publicStaticMethod() 
	{
		System.out.println("나는 publicstaticMethod!!");
	}

	
	public void getPrivateMethod()
	{
		PrivateMethod();
	}
}

//public class Class04 {
//	
//	public static void main(String[] args)
//	{
//		Exam exam = new Exam();
//		exam.packagePrivateMethod();
//		// exam.PrivateMethod(); 불가능
//		Exam.staticMethod();
//		exam.publicMethod();
//		
//		
//		exam.getPrivateMethod();
//	}
	//1.packagePrivate(default) 같은 패키지 내에서만 사용가능
//2.private 키워드가 명시될때는 자기 자신 클래스외에 접근 불가
//3.public이 없고 static만 붙어 있을경우, packagePrivate와 같다
//4.public이 붙은 메서드는 외부패키지 어디서든지 접근가능하다.
//
//}
