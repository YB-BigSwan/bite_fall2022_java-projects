import java.util.ArrayList;

public class Crew {

	private ArrayList<Sailor> sailorList = new ArrayList<Sailor>();
	
	public Crew() {
		sailorList = new ArrayList<Sailor>();
	}
	
	public void addCrewMember(Sailor sailor) {
		sailorList.add(sailor);
	}
	
	public String toString() {
		String output = "";
		
		for (int i = 0; i < sailorList.size(); i++) {
			output += sailorList.get(i).getName() + " (" + sailorList.get(i).getEmail() + ")\n";
		}
		
		return output;
	}
}
