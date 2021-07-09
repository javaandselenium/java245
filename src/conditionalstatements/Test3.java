package conditionalstatements;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
	//	int time=12;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the time");
		int time = s.nextInt();
		
		if(time<=12) {
			System.out.println("Good day");
		}
		else if(time>12 && time<=18) {
			System.out.println("Good noon");
		}
		else
		{
			System.out.println("good night");
		}
		

	}

}
