package Object;

public class MethodTest 
{
	
	public static void main(String[] args) 
	{
		Exam exam = new Exam();
		
		exam.packagePrivateMethod();
		
		Exam.staticMethod();
		
		exam.publicMethod();
	}

}
