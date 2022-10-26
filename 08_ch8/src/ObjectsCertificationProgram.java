import java.util.Scanner;

public class ObjectsCertificationProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Coach[] coachArray = new Coach[4];

		for (int i = 0; i < coachArray.length; i++) {
			System.out.print("Enter coach name: ");
			String name = input.nextLine();
			System.out.print("Enter " + name + "'s score: ");
			int score = Integer.parseInt(input.nextLine());

			coachArray[i] = new Coach(name, score);
		}

		System.out.println();
		System.out.print("Enter the minimum passing score: ");
		int minScore = Integer.parseInt(input.nextLine());
		input.close();
		
		int count = 0; 
		System.out.println();
		System.out.println("Passing scores");
		for (int i = 0; i < coachArray.length; i++) {
			
			if (coachArray[i].getScore() >= minScore) {
				System.out.println(coachArray[i].getName() + " (" + coachArray[i].getScore() + " points)");
				count++;
			}
		}
		
		int percent = (count*100) / coachArray.length;
		System.out.println("The passing rate is " + percent + ".0%");
	}
}
