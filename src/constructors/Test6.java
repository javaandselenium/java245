package constructors;

public class Test6 {
	String name;
	String price;
	String phonetype;
	
	
	public Test6(String name, String price, String phonetype) {
		this.name = name;
		this.price = price;
		this.phonetype = phonetype;
	}


	public static void main(String[] args) {
	Test6 t=new Test6("John","900","andoid");
	System.out.println(t.name);
	System.out.println(t.price);
	System.out.println(t.phonetype);

	}

}
