package methods;

public class Test13 extends Test12{
	public void status() {
		System.out.println("message and photos and videos");
		super.status();
	}
	
	public static void main(String[] args) {
		Test13 t=new Test13();
		t.status();
	}

}
