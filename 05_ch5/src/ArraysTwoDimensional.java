
public class ArraysTwoDimensional {

	public static void main(String[] args) {
	    int[][] m1 = { {1, 2, 0}, {2, 3, 4} };
	    int[][] m2 = { {3, 2, 5}, {6, 4, 3} };
	    int[][] m3 = { {1, 1, 1, 1}, {3, 3, 2, 1}, {2, 2, 2, 2} };
	    int[][] m4 = { {2, 2, 2, 3}, {2, 3, 1, 0}, {1, 2, 3, 4} };
	   
	    printMatrixSum(m1, m2);
	    System.out.println();

	    printMatrixSum(m3, m4);
	}
	
	public static void printMatrixSum(int[][] m1, int[][]m2) {
		for (int i = 0; i < m1.length; i++) {
			for (int n = 0; n < m1[0].length; n++) {
				System.out.print(m1[i][n] + m2[i][n] + " ");
			}
			System.out.println();
		}
	}
}
