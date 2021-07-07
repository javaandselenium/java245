package constructors;

public class Test2 {
	
	Test2(int a,int b){
		System.out.println(a+b);
	}
	
	Test2(){
		System.out.println("hello ge");
	}

	public static void main(String[] args) {
		Test2 t=new Test2();
		Test2 t1=new Test2(10,30);

	}

}
