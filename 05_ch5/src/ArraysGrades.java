import java.text.DecimalFormat;
import java.util.Scanner;

public class ArraysGrades {

	public static void main(String[] args) {
		String[] grades = {"A", "A", "B", "A", "C", "B", "C", "F", "B", "B", "A", "A", "C", "C", "C"};
		
		Scanner input = new Scanner(System.in);
		DecimalFormat oneDecimal = new DecimalFormat("0.0");
		
		System.out.print("Enter grade letter: ");
		String userGrade = input.nextLine();
		input.close();
		Double count = 0.0;
		
		for (int i = 0; i < grades.length; i++) {	
			if (userGrade.equalsIgnoreCase(grades[i])) {
				count++;
			}
		}
		
		Double counted = count * 100;
		Double output = counted / grades.length;
		
		System.out.println(oneDecimal.format(output) + "%");
	
		

	}

}
