package collections;

import java.util.ArrayList;

public class Test6 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		a.add(200);
		a.add(800);
		a.add(300);
		a.add(100);
		a.add(400);
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
//		for(int i=4;i>=0;i--) {
//			System.out.println(a.get(i));
//		}
	}

}
