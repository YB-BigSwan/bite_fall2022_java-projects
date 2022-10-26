import java.util.Arrays;
import java.util.Random;

public class ArraysLotto {

	public static void main(String[] args) {
		Random randomGenerator = new Random();

		Integer[] lottoNumbers = new Integer[7];
		int i = 0;

		while (i < 7) {
			int number = randomGenerator.nextInt(40);
			if (!Arrays.asList(lottoNumbers).contains(number)) {
				lottoNumbers[i] = number;
				i++;
			}
		}

		System.out.println(Arrays.asList(lottoNumbers));

	}

}
