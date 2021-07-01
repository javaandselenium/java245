package methods;

public class Test2 {
	//method without paramater
	public static void add() {
		int a=10;
		int b=90;
		int c=a+b;
		System.out.println(c);
	}
	//method with parameter
	public static void addition(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	

	public static void main(String[] args) {
		add();
		add();
		addition(10,20);
		addition(30,30);
		addition(90,30);
	}

}
