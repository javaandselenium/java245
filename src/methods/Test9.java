package methods;

public class Test9 {

	public static void serach(String name) {
		System.out.println(name);
	}
	
public static void serach(String sub,int date) {
		System.out.println(sub+date);
	}


public static void serach(String cc,String Sub) {
	System.out.println(cc+Sub);
}
	
	public static void main(String[] args) {
		Test9.serach("bharani");
		Test9.serach("john","hello");

	}

}
