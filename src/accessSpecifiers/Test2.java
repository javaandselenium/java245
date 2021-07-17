package accessSpecifiers;

public class Test2 {
	private int a=10;
	
	private void add() {
		System.out.println("private method");
	}
	
	private Test2() {
		System.out.println("Private constructor");
	}

	public static void main(String[] args) {
		Test2 t2=new Test2();
		t2.add();
		System.out.println("Private varaible "+t2.a);
		
		Test3 t=new Test3();
		t.demo();
		System.out.println("default varaible "+t.a);

	}

}
