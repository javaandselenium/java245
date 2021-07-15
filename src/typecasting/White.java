package typecasting;

public class White extends Red{
	public void whitepen() {
		System.out.println("whitepen");
	}
	
	public void whitePaper() {
		System.out.println("whitepaper");
	}
	
	public static void main(String[] args) {
		//upcasting
		Red r=new White();
		r.redPaper();
		r.redPen();
		
		//downcasting
		White w=(White)r;
		w.whitePaper();
		w.whitepen();
		w.redPaper();
		w.redPen();
		
	}

}
