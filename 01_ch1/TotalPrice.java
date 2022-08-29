package week_01;

import java.util.Scanner;

public class TotalPrice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter price: ");
		int price = Integer.parseInt(input.nextLine());
		
		System.out.print("Enter handling fee: ");
		int fee = Integer.parseInt(input.nextLine());
		
		int sum = price + fee;
		
		System.out.println("");
		
		System.out.println("The total price is " + sum);
	}

}