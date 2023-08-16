package ControlStamament;

public class ForHomeWokr {
	public static void main(String[] args){
		int num = 5;
	
	//1번코드 완성
	for(int i =1; i <= num; i++) 
	{
		for(int j =5; j>=i;j--) 
		{
			System.out.print(" * ");
		}
		System.out.println();
	}
	System.out.println();
	//2번 코드
	for(int i =1; i <= num; i++) 
	{
		for(int k = 5; k>i; k--) {
			System.out.print("   ");				
		}
		for(int j =1; j<=i;j++) 
		{
			System.out.print(" * ");
		}
		System.out.println();
	}
	System.out.println();
	//3번 코드 완성
	for(int i =1; i <= num; i++) 
	{
		for(int k = 1; k<i; k++) {
			System.out.print("   ");				
		}
		for(int j =5; j>=i;j--) 
		{
			System.out.print(" * ");
		}
		System.out.println();
	}
	System.out.println();
	//추가 코드	 
	for(int i =1; i <=num; i++)
	{
		for(int k = 5; i<k; k--) {
			System.out.print("  ");			
		}
		for(int j = 1; j<=i;j++) {
			System.out.print(" *  ");
		}
		System.out.println();
	}
	for(int i = 2; i<=num; i++) {
		for(int k = 1; k<i ; k++) {
			System.out.print("  ");		
		}
		for(int j = 5; j>=i;j--) {
			System.out.print(" *  ");
		}
		System.out.println();
	}}
	}
