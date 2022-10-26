import java.util.ArrayList;

public class ObjectsSongArrayList {

	public static void main(String[] args) {
		ArrayList<String> songArray = new ArrayList<String>();
		
		Song one = new Song("Easy on Me", "Adele", 2021);
		Song two = new Song("Shivers", "Ed Sheeran", 2021);
		Song three = new Song("Holy Ghost Fire", "Larkin Poe", 2020);
		
		songArray.add(one.toString());
		songArray.add(two.toString());
		songArray.add(three.toString());
		
		System.out.println("=== List of songs ===");
		for (int i = 0; i < songArray.size(); i++) {
			System.out.println(songArray.get(i));
		}
		
		
	}

}
