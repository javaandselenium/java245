package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test5 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		a.add(200);
		a.add(800);
		a.add(300);
		a.add(100);
		a.add(400);
		
		//sorting the list
		
		Collections.sort(a);
		
		for(Object ele:a) {
			System.out.println(ele);
		}
		
		Collections.sort(a,Collections.reverseOrder());
	System.out.println(a);
	
	}

}
