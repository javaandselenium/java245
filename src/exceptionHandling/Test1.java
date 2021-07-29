package exceptionHandling;

public class Test1 {

	public static void main(String[] args) {
		try {
		int i=1/0;
		}
		
		catch(Exception e)
		{
		System.out.println(e);
		System.out.println("Handled");
		}
		System.out.println("hello");
		System.out.println("Bye");

	}

}
