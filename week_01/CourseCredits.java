package week_01;

import java.util.Scanner;

public class CourseCredits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter credits: ");
		int credits = Integer.parseInt(input.nextLine());
		
		System.out.print("Enter course name: ");
		String courseName = input.nextLine();
		
		System.out.println("");
		
		System.out.print(courseName + " " + "(" + credits + "cr)");
		
	}

}
