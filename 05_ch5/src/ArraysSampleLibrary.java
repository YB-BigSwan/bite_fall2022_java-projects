import java.util.Arrays;

public class ArraysSampleLibrary {

	public static int min(int[] numbers) {
		int smallest = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}

		return smallest;
	}

	public static int max(int[] numbers) {
		int largest = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			}
		}

		return largest;
	}

	public static double mean(int[] numbers) {
		Double sum = 0.0;
		Double mean = 0.0;

		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
			mean = sum / numbers.length;
		}
		return mean;
	}

	public static double median(int[] numbers) {
		int[] numCopy = Arrays.copyOf(numbers, numbers.length);
		Arrays.sort(numCopy);
		Double median;

		if (numCopy.length % 2 == 0) {
			median = ((double) numCopy[(numCopy.length - 1) / 2] + (double) numCopy[numCopy.length / 2]) / 2;
		} else {
			median = (double) numCopy[numCopy.length / 2];
		}

		return median;
	}

	public static double standardDeviation(int[] numbers) {
		Double sum = 0.0;
		Double mean = ArraysSampleLibrary.mean(numbers);

		for (int i = 0; i < numbers.length; i++) {
			sum += Math.pow(numbers[i] - mean, 2);
		}

		Double sDev = Math.sqrt(sum / (numbers.length - 1));

		return sDev;

	}

}
