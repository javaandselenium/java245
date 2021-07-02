package methods;

public class Test7 {
static int a=90;
int c=80;

public static void sub() {
	System.out.println("subtraction");
}

public void mul() {
	System.out.println("multiplication");
}
	
	public static void main(String[] args) {
		System.out.println(Test7.a);
		Test7 t=new Test7();
		System.out.println(t.c);
		
		Test7.sub();
		t.mul();
		
		
	}

}
