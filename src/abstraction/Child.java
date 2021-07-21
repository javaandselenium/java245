package abstraction;

public class Child extends Parent1 implements Parent2,Parent3{

	@Override
	public void cycle() {
		System.out.println("Cycle");
		
	}

	@Override
	public void home() {
		System.out.println("home");
		
	}

	public static void main(String[] args) {
		Child c=new Child();
		c.cycle();
		c.home();
		c.car();
	}

}
