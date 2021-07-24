package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Test3 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		a.add("Jan");
		a.add("Feb");
		a.add("March");
		a.add("April");
		a.add("May");
		//Travers list using iteratos
		
		Iterator itr = a.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
