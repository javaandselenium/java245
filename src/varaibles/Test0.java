package varaibles;

public class Test0 {
	
	 int d=100;
	 static int q=90;
	
	public void add() {
	    int a=10;
		int b=20;
		System.out.println(a+b);
		
	}

	public static void main(String[] args) {
		Test0 t=new Test0();
		t.add();
		System.out.println(t.d);
		System.out.println(Test0.q);

	}

}
