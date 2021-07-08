package constructors;

public class Test5 {
	String name="xyz";
	String price="123";
	String phonetype="Android";
	
	Test5(){
		String name="abc";
		System.out.println(name);
		String price="234";
		System.out.println(price);
		String phonetype="ios";
		System.out.println(phonetype);
	}

	public static void main(String[] args) {
		Test5 t=new Test5();
		
	}

}
