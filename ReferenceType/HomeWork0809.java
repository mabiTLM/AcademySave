package ReferenceType;

public class HomeWork0809 {
	public static void main(String args[]) {
	int[] array = {78,10,5,100,98};
	int max = array[0];
	int min = array[0];
	for(int i = 0; i<array.length;i++) {
		max = array[i] > max ? array[i]:max;
		min = array[i] > min ? min:array[i];
	}
	System.out.println("최대값 : " + max);
	System.out.println("최소값 : " + min);
	}
}
