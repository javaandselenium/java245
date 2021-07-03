package methods;

public class Test8 {

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void add(int a, double b) {
		System.out.println(a + b);
	}

	public void add(double a, double b,int c) {
		System.out.println(a + b+c);
	}

	public void add(double b, int a) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		Test8 t=new Test8();
		t.add(20,34.90);
		// TODO Auto-generated method stub

	}

}
