package abstraction;

public class Atm implements Test1{

	@Override
	public void cardSlot() {
		System.out.println("Card slot to insert card");
		
	}

	@Override
	public void pinNumb() {
		System.out.println("Enter the valid pin");
		
	}

	@Override
	public void amount() {
	System.out.println("collect the amount");
		
	}
public static void main(String[] args) {

	Atm a1=new Atm();
	a1.cardSlot();
	a1.pinNumb();
	a1.amount();

	
}

}
