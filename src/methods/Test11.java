package methods;

public class Test11 {
	int a=10;
	int b=20;
	
	public void add() {
		System.out.println(a+b);
	}
	
	public void sub() {
		int a=100;
		int b=40;
		System.out.println(a-b);
	}
	

	public static void main(String[] args) {
		Test11 t=new Test11();
		t.add();
		t.sub();

	}

}
