package accessSpecifiers;

public class Test0 {
	public int a=10;
	
	public void add() {
		System.out.println("Public method");
	}
	
	public Test0() {
		System.out.println("public constructor");
	}

	public static void main(String[] args) {
		Test0 t=new Test0();
		t.add();
		System.out.println("public varabile "+t.a);
		
		Test4 t1=new Test4();
		t1.demo();
		System.out.println("protected varaible "+t1.a);
		

	}

}
