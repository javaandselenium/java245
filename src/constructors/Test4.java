package constructors;

public class Test4 {
	Test4(int a) {
		System.out.println(a);
	}

	Test4(String a, int b) {
		this(100);
		System.out.println(a + " " + b);
	}

	Test4(int a, int b) {
		this("Hello",60);
		System.out.println(a + b);
	}

	Test4(String a, double b) {
		this(10,30);
		System.out.println(a + " " + b);
	}

	public static void main(String[] args) {
		Test4 t=new Test4("Hi",90.00);

	}

}
