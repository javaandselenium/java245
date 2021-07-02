package methods;

public class Test6 {
	int a=100;
	static int b=200;
	
	public void add() {
		System.out.println("addition");
	}
	
	public static void sub() {
		System.out.println("subtraction");
	}
	
public static void main(String[] args) {
	Test6 t=new Test6();
		System.out.println(t.a);
		
		System.out.println(Test6.b);
		t.add();
		Test6.sub();
		
		
		
	}

}
