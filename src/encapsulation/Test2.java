package encapsulation;

public class Test2 {

	public static void main(String[] args) {
		Test1 t=new Test1();
		System.out.println(t.getName());
		
		System.out.println("current email address "+t.getEmailid());
		t.setEmailid("skillrary@gmail.com");
		System.out.println("after chageing email address "+t.getEmailid());
		
		System.out.println("current phnumb"+t.getPhnumb());
		t.setPhnumb(5678);
		System.out.println("after changeing "+t.getPhnumb());
		

	}

}
