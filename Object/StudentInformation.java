package Object;

import java.util.Scanner;

class Student
{
	String name;
	int age;
	int studentId;
	int tall;
	String phoneNumber;
	Student()
	{
		
	}
	Student(String name, int age, int studentId, int tall, String phoneNumber){ //오버로딩
		this.name = name;
		this.age = age;
		this.tall = tall;
		this.studentId = studentId;
		this.phoneNumber = phoneNumber;	
	}
	public void info()
	{
		System.out.println("이름은 " + name);
		System.out.println("나이 " + age);
		System.out.println("학번 " + studentId);
		System.out.println("키 " + tall);
		System.out.println("전화번호 " + phoneNumber);	
	}
}
//class Overide extends Student {
//	public void info() 
//	{
//		super.info();
//		System.out.println("오버라이드");
//	}
//	
//}

public class StudentInformation
{	
	public static void main(String[] args)
	{
		Student st =new Student();
//		st.name = "임현규";
//		st.age = 26;
//		st.studentId = 2015270;
//		st.tall = 176;
//		st.phoneNumber = "010-2052-7296";
//		System.out.println("이름 : " + st.name + " 나이 :"+ st.age+ " 학번 :"+ st.studentId + " 키 :" + st.tall + " 전화번호 :"+ st.phoneNumber);
//		System.out.println();
//		
//		st.info();
//		System.out.println();
		
		Student st1=new Student("임현규",26,15,176,"01020527296");
		st1.info();
		System.out.println();
		
//		Overide ov = new Overide();
//		ov.name = "오버라이드";
//		ov.info();
//		System.out.println();		
		
//		Scanner scan = new Scanner(System.in);		
//		System.out.print("이름 :");
//		st.name = scan.nextLine();
//		System.out.print("나이 :");
//		st.age = scan.nextInt();
//		System.out.print("학번 :");
//		st.studentId = scan.nextInt();
//		System.out.print("키 :");
//		st.tall = scan.nextInt();
//		System.out.print("번호 :");
//		scan.nextLine();
//		st.phoneNumber = scan.nextLine();
//		System.out.println("이름 : " + st.name);
//		System.out.println("나이 :"+ st.age);
//		System.out.println("학번 :"+ st.studentId);
//		System.out.println("키 :" + st.tall );
//		System.out.println("전화번호 :"+ st.phoneNumber);
		
	}

}
