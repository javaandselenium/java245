package conditionalstatements;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks = s.nextInt();
		
		if(marks<=100 && marks>=90) {
			System.out.println("A+");
		}
		else if(marks<90 && marks>=80) {
			System.out.println("A");
		}
		else if(marks<80 && marks>=60) {
			System.out.println("B");
		}
		else if(marks<60 && marks>=40) {
			System.out.println("C");
		}

		else
		{
			System.out.println("Fail");
		}
	}

}
