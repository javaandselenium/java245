package constructors;

public class Test3 {

	Test3(int a) {
		System.out.println(a);
	}

	Test3(int a, double b) {
		System.out.println(a + b);
	}

	Test3(String a, int b) {
		System.out.println(a + "" + b);
	}

	Test3(int a, int b, double c) {
		System.out.println(a + b + c);
	}

	public static void main(String[] args) {
		Test3 t=new Test3(10,20,40.00);
		Test3 t1=new Test3("hello",80);
		Test3 t2=new Test3(10,60.00);

	}

}
