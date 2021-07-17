package accessSpecifiers;

public class Test3 {
	
	int a=10;
	
	void demo() {
		System.out.println("default method");
	}
	
	Test3(){
		System.out.println("default constructor");
	}

	public static void main(String[] args) {
		Test3 t=new Test3();
		t.demo();
		System.out.println("default varaible "+t.a);

	}

}
