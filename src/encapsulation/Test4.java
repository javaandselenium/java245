package encapsulation;

public class Test4 extends Test3 {

	public static void main(String[] args) {
	Test4 t=new Test4();
	System.out.println(t.getAccountHoldername());
	System.out.println(t.getAccountNumb());
	System.out.println(t.getBalance());
	t.setBalance(97600);
	System.out.println("current blance "+t.getBalance());

	}

}
