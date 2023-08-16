package myPack;

public class Variable01 { // 클래스 이름 숫자 붙이지 말것
	
	public static void main(String[] args) {
		//TypeCasting(형변환)
		//대입연산자를 중심으로 왼쪽과 오른쪽 자료형을 일치시켜야 할때가 있음
			
		double num = 58.2;
		
		//(타입) 피연산자
		int score = (int)num;
		System.out.println(score);
		System.out.println(num);
		
		float value = (int)5.3;
		float value2 = (float)5.8;
		float value3 = 5.8f;
		
		int charTypeCasting = 65;
		char intTypeCasting = 65; //'A'
		int intTofloat = 10;
		
		System.out.println((int)intTypeCasting);
		System.out.println((char)charTypeCasting);
		System.out.println((float)intTofloat);
		
	}
}
