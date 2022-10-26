
public class MethodsDoubleFactorials {

	public static void main(String[] args) {
		for (int i = 0; i <= 9; i++) {
			System.out.println(i + "!! = " + doubleFactorial(i));

		}

	}

	public static int doubleFactorial(int i) {
		if (i == 1 || i == 0) {
			return 1;
		} else {
			return i * doubleFactorial(i - 2);
		}

	}

}
