package exceptionHandling;

public class Test6 {

	public static void add() {
		int a=10;
		int b=20;
		System.out.println(a+b);
		System.out.println("connected to database");
	}
	


	public static void main(String[] args) {
		try {
		int i=1/0;
		
		}
		catch(Exception e) {
			System.out.println("handled");
		}
		
		finally {
		Test5.add();
		}
	}

}
