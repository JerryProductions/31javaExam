package thirdyr.firstse.collection.java.ch7;

/*
	Practice 7.2
	
	Write a Java program to print the following grid.
	Expected Output:
	
	----------
	----------
	----------
	----------
	----------
	----------
	----------
	----------
	----------
	----------
*/

public class Grid {
	public static void main(String[] args) {
		int[][] arr = new int[10][10];
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++)
				System.out.printf("%2d", arr[i][j]);
			System.out.println();
		}
	}
}
