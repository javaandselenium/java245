package accessSpecifiers;

public class Test4 {
	
	protected int a=100;
	
	protected void demo() {
		System.out.println("protected method");
	}
	
	protected Test4() {
		System.out.println("protected constructor");
	}
	
	public static void main(String[] args) {
		Test4 t1=new Test4();
		t1.demo();
		System.out.println("protected varaible "+t1.a);
		
	}

}
