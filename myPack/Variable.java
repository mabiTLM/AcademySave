package myPack;

public class Variable {
	public static void main(String[] args) {
		//변수?
		//프로그래밍에서 가장 기본적인 동작은 데이터를 저장,
		//저장된 데이터 값을 읽어온다.
		
		//데이터를 저장하려면 메모리에 값을 저장할 공간을 생성한다.
		//이름을 부여해야한다.
		
		//사물함이 여러개 있을 때 물건을 보관하고 번호를 매겼다면?
		//사물함이 메모리, 사물함의 번호가 변소라고 보면된다.
		
		//단 하나의 값을 저장할 수 있는 메모리 공간임.
		
		//1,2,3,4 -> 정수형
		//3.14,...-> 실수형
		//a, b, 한 , -> 문자
		//안녕, 여긴지옥->문자열
		
		//정수형
	//==============================
	//변수 선언 방법
	//자료형 변수명;=>int num;
	//데이터를 저장하기 위해 생성하는 메모리 공간은
	//목적에 따라 크기와 특징이 다른데 이를 자료형(Data Type) 이라고 부른다.
	//==============================
		
	//변수를 사용하기 전에 반드시 자료형을 선언
		int num =10;
		System.out.println("정수형 타입의 변수 num에 저장된 값 : "+num);
		//a=1; 데이터 타입이 명시 되지 않았으므로 Error
		//변수 초기화 방법
		//초기화는 변수의 어떠한 값을 대입하는것이 초기화다.
		//1.변수의 선언과 동시에 초기화
		int number = 5;
		System.out.printf("변수 number에 저장된 값 : %d", number);
		System.out.println();
		//2.변수 선언 후 초기화
		int player; //선언하고
		player = 100; //초기화
		System.out.printf("변수 player에 저장된 값 : %d", player);
		
		//이게 뭐야?
		int a;
		int a1;
		int a2;
		//변수 이름을 지을 때 반드시 지켜야 하는 사항
		/*
		1. 대소문자가 구분되며 길이에 제한은 없다.
		ㄴ int abCaguig;
		int abc;
		int ABC;
		
		2.특수문자는 언더바(_),$도 사용가능
		int _abc;
		int ab_c;
		
		3. 아라비아 숫자도 사용가능
		int a1;
		int 1a;//에러
		
		4.예약어를 사용할 수 없다.
		int int;
		int break;
		int public;
		
		%변수명을 지을때 반드시 지켜야 할 것.%
		 1. 영문 소문자로 시작
		 int average;
		 int name;
		 
		 2.영문단어를 2개이상 결합할때는 새로운 단어의 첫글자를 대문자로 시작(카멜표기법)
		 int maxValue;
		 int nNUM; 헝가리안 표기법 잘안씀
		 */
		//int 근본없는한글변수 = 44880; // 그냥 쓰지마
		//System.out.println(근본없는한글변수); //하지마 출력도 하지마
		
		//===============================================
		//					자료형의 종류
		//===============================================
		/*
		 분류					타입				크기(byte)
		 
		 정수형				byte			1
		 					short			2			메모리절약
		 					int				4			보통
		 					long			8			부족한경우
		 							 
		 실수형				float			4
		 					double		 	8
		 
		 논리형				boolean			1
		 
		 문자(정수)			char			2
		 
		 */
		
		boolean isCheck = false;
		byte flag = 1;
		int count = 10;
		short index = 2;
		long phoneNumber = 123456;
		float temperature = 1.0005f;
		double pi = 3.1415921234;
		char grade = 'A';
		
		System.out.println(isCheck);
		System.out.println(flag);
		System.out.println(count);
		System.out.println(index);
		System.out.println(phoneNumber);
		System.out.println(temperature);
		System.out.println(pi);
		System.out.println(grade);
		
		//실수형
		float f1 = 1.0000001f;
		System.out.println("f1에 저장된 값 : "+f1);
		float f2 = 1.00000012f;
		System.out.println("f2에 저장된 값 : "+f2);
		//float 정밀도 소수점7자리까지
		
		double d1 = 1.000000000000005;
		System.out.println("d1에 저장된 값 : "+d1);
		double d2 = 1.0000000000000055;
		System.out.println("d2에 저장된 값 : "+d2);
		
		//float f1; -> 재선언 불가능
		f1 = 5.44444f; //재할당은 가능
		
		//상수
		//변수와 마찬가지로 값을 저장할 수 있지만 한번저장하면 다른값으로 변경할 수 없다.
		//자바에선 final int 다른데선 const, 변수이름은 대문자를 쓴다.
		final int MAXSPEED = 10;
		//MAXSPEED = 20; //에러=> 상수로 선었했기때문에 재할당 불가
		//final int MOVE;
		//System.out.println(MOVE);
		/*int triangleArea = (20*10)/2;
		int rectangleArea = 20*10;
		System.out.println(triangleArea);
		System.out.println(rectangleArea);
		*/
		//상수로 변경
		//다른값으로 계산할때도 여러 곳을 수정할 필요없이 상수값만 변경해주면 된다. 
		final int WIDTH = 20; //폭
		final int HEIGHT = 10;//높이
		int triangleArea = (WIDTH*HEIGHT)/2;
		int rectangleArea = WIDTH*HEIGHT;
		
		//자료형을 이용하여
		//본인의 전화번호, 나이, 키, 몸무게 등등을 출력해라.
		
		String myPhoneNumber = "010";
		byte age = 26;
		int growth = 176;
		short weight = 65;
		System.out.println("전화번호 : "+myPhoneNumber);
		System.out.println("나이 : "+age);
		System.out.println("키 : "+growth);
		System.out.println("몸무게 : "+weight);
		
		int octNum = 010;
		int hexNum = 0x10;
		int binNum = 0b10;
		System.out.println(octNum);
		System.out.println(hexNum);
		System.out.println(binNum);
		
		float pi2 = 3.14f; //리터널 f같은 접미를 붙여서 타입을 구별해줘야한다.
		
		//개행
		System.out.printf("\n");
		System.out.printf("안녕\t안녕");
		
		//기본자료형 int같은것 Stack에 저장 참조자료형String heap에 저장 스택에는 주소값이 저장됨
		
		int data = 10;
		//10->2진수
		System.out.println(Integer.toBinaryString(data));
		//10진수->8진수
		System.out.println(Integer.toOctalString(data));
		//10진수->16진수
		System.out.println(Integer.toHexString(data));
		//2진수 1010을 -> 10진수로
		System.out.println(Integer.parseInt("1010",2));
		
		//가비지컬렉터가 변수를 회수함
		
		{
			int t;//지역변수는 감싸고 있는 영역을 벗어나는 순간 사라진다.
			{
				t = 3;
			}
			//System.out.println(t);
			
		}
	}

}
