package abstraction;

public class Amazon1 implements Test2{


	@Override
	public void user() {
		System.out.println("user");
		
	}
	
public static void main(String[] args) {
		Amazon1 a=new Amazon1();
		a.user();
	Test2.payment();

	}

}
