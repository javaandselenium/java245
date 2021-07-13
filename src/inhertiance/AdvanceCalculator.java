package inhertiance;

public class AdvanceCalculator  extends BasicCal{
	
	public void sinteta() {
		System.out.println("sinteta");
	}
	
	public void coseTeta() {
		System.out.println("coseteta");
	}

	public static void main(String[] args) {
		AdvanceCalculator a=new AdvanceCalculator();
		a.sinteta();
		a.coseTeta();
		a.add(10,89);
		a.sub(89,90);
	
	}

}
