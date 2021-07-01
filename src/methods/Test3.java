package methods;

public class Test3 {

	public static void withdrawal() {
		String name="Ramesh";
		int depositedAmt=1000;
		int withdrwaedAmt=500;
		int balance=depositedAmt-withdrwaedAmt;
		System.out.println(balance);
	}
	
	
	public static void main(String[] args) {
		withdrawal();
	}

}
