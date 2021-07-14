package typecasting;

public class ColdCoffee extends HotCoffee{

	public void coldcoffee() {
		System.out.println("drinking cold coffee");
	}
	
	
	public static void main(String[] args) {
		HotCoffee c=new ColdCoffee();
		c.hotcoffee();
		
		
	}
	
}
