package conditionalstatements;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
	//int age=8;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age");
		int age = s.nextInt();
		
	
	if(age>=18) {
		System.out.println("Caste your vote");
	}
	else
	{
		System.out.println("you cannot caste your vote");
	}

	}

}
