import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ObjectsCityNames {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String cityName = "";
		ArrayList<String> cities =  new ArrayList<String>();
		
		
		while (!cityName.equalsIgnoreCase("quit")) {
			System.out.print("Enter city name: ");
			cityName = input.nextLine().toUpperCase();
			if(!cityName.equalsIgnoreCase("quit")) {
				cities.add(cityName);
			}	
		}
		Collections.sort(cities);
		input.close();
		
		System.out.println();
		for (int i = 0; i < cities.size(); i++) {
			System.out.println(cities.get(i));
		}

	}

}
