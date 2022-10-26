import java.util.Scanner;

public class ArraysVoting {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of candidates: ");
		int candidateNum = Integer.parseInt(input.nextLine());

		String[] candidateName = new String[candidateNum];
		int[] votes = new int[candidateNum];

		for (int i = 0; i < candidateNum; i++) {
			System.out.print("Enter candidate's name: ");
			candidateName[i] = input.nextLine();

			System.out.print("Enter " + candidateName[i] + "'s votes: ");
			votes[i] = Integer.parseInt(input.nextLine());
		}

		input.close();

		int highVote = 0;

		int count = 0;
		String winner = "";
		String tie = "";

		for (int i = 0; i < votes.length; i++) {
			if (votes[i] > highVote) {
				highVote = votes[i];
				winner = candidateName[i] + " is the winner with " + votes[i] + " votes!";
			}
		}

		for (int i = 0; i < votes.length; i++) {
			if (highVote == votes[i]) {
				count++;
				tie += candidateName[i] + " (" + votes[i] + " votes)" + "\n";
			}
		}

		if (count == 1) {
			System.out.println();
			System.out.println(winner);
		} else {
			System.out.println();
			System.out.println("It is a tie!");
			System.out.println(tie);
		}

	}

}
