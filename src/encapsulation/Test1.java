package encapsulation;

public class Test1 {
	private String name="John";
	private int phnumb=12345;
	private String emailid="test@gmail.com";
	private int pwd=900;
	
	public int getPhnumb() {
		return phnumb;
	}
	public void setPhnumb(int phnumb) {
		this.phnumb = phnumb;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getName() {
		return name;
	}
	
	

}
