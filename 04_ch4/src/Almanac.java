//ಠ_ಠ
import java.time.LocalDate;
import java.util.Scanner;

public class Almanac {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

//		Get the input
		System.out.print("Enter year: ");
		int year = Integer.parseInt(input.nextLine());

		System.out.print("Enter month: ");
		int month = Integer.parseInt(input.nextLine()) - 1;
		input.close();
		
//		Call the method
		printMonthCalendar(year, month);
		System.out.println();
	}

	public static void printMonthCalendar(int year, int month) {
		String[] monthNames = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		
//		Get date and adjust month to be 1 instead of 0
		LocalDate myDate = LocalDate.of(year, month + 1, 1);

		int dayInMonth = myDate.lengthOfMonth();

//		Also need to change this by -1 cause indexing was off
		int dayOfWeek = myDate.getDayOfWeek().getValue() - 1;
		String[] dayOfWeekName = { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" };

		System.out.println();
		
//		Month and day names
		System.out.println(" > " + monthNames[month] + " " + year + " <");

		for (int i = 0; i < 7; i++) {
			System.out.print(" " + dayOfWeekName[i]);
		}

		System.out.println();

//		set date and print first week of month
		int n = 0;
		int dow = dayOfWeek;
		for (int i = 0; i <= dayOfWeek; i++) {
			if (i == dayOfWeek) {
				while (dow < 7) {
					dow++;
					n++;
					System.out.printf("%4d", n);
				}
			} else {
				System.out.print("    ");
			}
		}
//		ミ●﹏☉ミ
//		print rest of the month
		for (int x = 0; x < (dayInMonth - n); x++) {
			if (x % 7 == 0) {
				System.out.println();
				System.out.printf("%4d", x + (n + 1));
			} else {
				System.out.printf("%4d", x + (n + 1));
			}
		}
	}
}
//(╯°□°）╯︵ ┻━┻ I need to sleep...