package ReferenceType;

import java.util.Scanner;

public class ReferenClass03
{	
	
	public static void main(String[] args)
	{
		//String
		//String 참조변수 = "어쩌구저쩌구..";
		//String 참조변수 = new String("ㅇㅁㄴㅇㅁㄴㅁㅇ"); 생성자
		
//		String str = new String("안녕?");
//		String str1 = "이자식!!!";
//		System.out.println(str);
//		System.out.println(str1);
		
//		String str1 = new String("안녕?"); 
//		String str2 = str1;
//		str1 = "안녕하세요";//기존문자열을 수정하는 것이 아닌 새로운 주소를 받는다
//		System.out.println(str1);
//		System.out.println(str2);
		
//		String str1 = new String("안녕");
//		String str2 = "안녕";
//		String str3 = "안녕"; //문자열 리터럴은 앞에있으면 공유
//		String str4 = new String("안녕"); //new는 새로
//		
//		System.out.println(str1==str2); //false
//		System.out.println(str2==str3); //true
//		System.out.println(str3==str4); //false
//		System.out.println(str1==str4); //false
		
		//new로 생상하면 무조건 새롭게 객체를 생성
		//문자열 리터럴로 생성하면 힙 메모리에 리터럴로 생성된 동일한 문자열을 포함하고 있는 객체가 있으면 그 객체를 공유한다.
		
		//String 메서드들...
		//length() : 문자열의 길이. 리턴타입은 int
		//charAt():문자열에서 특정 index에 위치해있는 문자를 확인할때 리턴타입은 char
		//indexOf() : 문자열에서 특정 문자나 특정 문자열을 앞에서부터 찾아서 위치값을 알아낸다. int
		
		//charAt()
		//			 01234567
//		String text="Hello, World";
//		int idx=7;
//		char character= text.charAt(idx); //하나씩 접근하면서 가져옴
//		System.out.println("character의 idx " + idx + ":" + character);
//		
//		//문자열 역순으로 출력하기
//		String word = "Java";
//		String reverseString="";
//		
//		//문자열의 인덱스는 0부터 시작하니꽈
//		//길이가 n이라면 당연히 인덱스의 범위는 n-1임
//		for(int i = word.length()-1; i>=0; i--) //성능상의 문제가 있으니 빌더를 권장
//		{
//			reverseString+=word.charAt(i);
//		}
//		System.out.println(reverseString);
		
		
		//subString
		//주어진 시작 인덱스부터 문자열의 끝까지 부분 문자열을 반환
//		String text="Hello, World";
//		int idx = 7;
//		
//		String subText=text.substring(idx); //이름은 같으나 매개변수가 다르다 함수오버로딩
//		System.out.println(subText);
//		String number="941023-1234567";
//		//substring(0,6) -> startIndex, enxIndex
//		//두번째 매개변수(6) 주어진 인덱스의 -1 까지
//		String birth=number.substring(0, 6);//-
//		System.out.println(birth);
		
		
		//indexOf
		//문자열에서 특정 문자나 문자열이 처음으로 등장하는 인덱스를 반환한다.
		//찾지 못하면 -1 리턴한다.
		//특정문자의 인덱스 찾기
//		String text="Hello, World";
//		char target='W';
//		int index=text.indexOf(target);
//		if(index !=-1)
//		{//찾았다면
//			System.out.println("찾았다!!!"+index);
//		}
//		else
//		{
//			System.out.println("없다!!!");
//		}
		//문자열로 찾기
//		String text="Java programming";
//		String target="programming";
//		int index=text.indexOf(target);
//		if(index !=-1)
//		{//찾았다면
//			System.out.println("찾았다!!!"+index);
//		}
//		else
//		{
//			System.out.println("없다!!!");
//		}
		
		// isEmpty : 문자열이 비어있냐?(길이가 0이냐)
		// 비어 있으면 true, 아니면 false
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("문자열 입력해라");
//		String input = scanner.nextLine();
//		if(input.isEmpty())
//		{
//			System.out.println("비어있다");
//		}
//		else
//		{
//			System.out.println(input);
//		}
		
//		//문자열 배열에서 빈 문자열은 몇개냐?
//		String[] strArr={"Hello","","Java","","World",""};
//		int count=0;
//		for(String string : strArr)
//		{
//			if(string.isEmpty())
//			{
//				count++;
//			}
//		}
//		System.out.println(count);
//		
//		//split
//		//문자열을 특정 구분자를 기준으로 분리한다음 문자열 배열로 반환
//		String text = "Hello, World! Java Programming";
//		String[] words=text.split(" ");//공백을 구분자로 사용하여 분리
//		
//		for(String word:words)
//		{
//			System.out.println(word);
//		}
//		
//		String data = "apple,banana;mango|test";
//		String[] items=data.split("[,;|]");
//		for(String item:items)
//		{
//			System.out.println(item);
//		}
		
		// 실습
		//입력받은 문장의 단어가 몇개냐?
		//구분은 공백으로 함.
		//input : I am a boy
		//output : 4개
//		Scanner scan = new Scanner(System.in);
//		System.out.print("문장을 입력해주세요 : ");
//		String words = scan.nextLine();
//		int count = 0;
//		
//		String[] word=words.split(" ");
//		for(String splitWord:word)
//		{
//			if(!splitWord.isEmpty()) {
//			count++;
//			}
//		}
//		System.out.println("단어의 갯수는 "+count);
		
		////////////////////////////////////////
		
		//trim 0816
		//문자열의 앞뒤 공백을 제거한다.
//		String textString=" Hello, World ";
//		String trimText=textString.trim();
//		System.out.println(textString);
//		System.out.println(trimText);
		
		//toCharArray
		//문자열을 문자배열로 변환
		
//		String text="Hello, World";
//		char [] charArray=text.toCharArray();
//		
//		for(char c : charArray)
//		{
//			System.out.print(c+" ");
//		}
	
		//문자열 내에서 대소문자 변환하기
		
		String originalText = "Hello, World";
		//문자열을 문자배열로 변환
		char[] charArr = originalText.toCharArray();
		
		for(int i = 0; i<charArr.length; i++)
		{
			//만약에 문자가 대문자냐?
			if(Character.isUpperCase(charArr[i]))
			{
				charArr[i] = Character.toLowerCase(charArr[i]);
			}
			else if(Character.isLowerCase(charArr[i]))
			{
				charArr[i] = Character.toUpperCase(charArr[i]);
			}
		}
		
		//문자배열을 문자열로 바꾸자
		String trans = new String(charArr);
		System.out.println(originalText);
		System.out.println(trans);
		
		//변수
		//배열
		//구조체 struct c에선 함수불가 c++은 객체지향이라 함수가능
		//클래스는 구조체에서 public private만 차이
		//설계도로부터 만들어진 제품 객체 인스턴스
		
		
	}//end of main

}
