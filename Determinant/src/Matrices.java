

import java.util.Arrays;
import java.util.Scanner;

public class Matrices {
	static int array[] = { 80, 12, 30, 50, 50, 25, 57, 25, 17, 42, 30, 25 };

	public static void removeSort() {

		int i;

		for (i = 0; i < array.length; i++) {
			int temp = 0;
			for (int j = 0; j < i; j++) {
				if (array[i] == array[j]) {
					temp = 1;
					break;
				}
			}
			if (temp == 0) {
				Arrays.sort(array);

				System.out.println(array[i] + " ");
			}
		}

		System.out.println('\n');
	}

	public static void frequency() {
		int n = 12;
		boolean temparray[] = new boolean[n];

		Arrays.fill(temparray, false);

		for (int i = 0; i < array.length; i++) {

			if (temparray[i] == true)
				continue;

			int arttýr = 1;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					temparray[j] = true;
					arttýr++;
				}
			}
			System.out.println("Item " + i + ": " + array[i] + " – Frequency: " + arttýr);
		}
	}

	public static void detOfMatrix() {

		int m, n, i, j;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number " + "of rows of the matrix");
		m = in.nextInt();
		System.out.println("Enter the number " + "of columns of the matrix");
		n = in.nextInt();

		int matrix[][] = new int[m][n];

		System.out.println("Enter the elements of the matrix");
		for (i = 0; i < m; i++)
			for (j = 0; j < n; j++)
				matrix[i][j] = in.nextInt();

		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + " ");
			}

			System.out.println(" ");

		}
		int determinant, x, y, z;
		x = (matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]));
		y = (matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]));
		z = (matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]));
		determinant = x - y + z;

		System.out.print("Determinant of Matrix:" + determinant);
	}

	public static void multiplication() {

		int m, n, i, j, k, l, z, sum;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number " + "of first matrix rows of the matrix");
		m = in.nextInt();

		System.out.println("Enter the number " + "of first matrix columns of the matrix");
		n = in.nextInt();

		int matrix[][] = new int[m][n];

		System.out.println("Enter the elements of the first matrix");
		for (i = 0; i < m; i++)
			for (j = 0; j < n; j++)
				matrix[i][j] = in.nextInt();

		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + " ");

			}
			System.out.println(" ");
		}
		System.out.println("Enter the number " + "of second matrix rows of the matrix");
		k = in.nextInt();
		System.out.println("Enter the number " + "of second matrix columns of the matrix");
		l = in.nextInt();

		int matrix2[][] = new int[k][l];

		System.out.println("Enter the elements of the second matrix");
		for (i = 0; i < k; i++)
			for (j = 0; j < l; j++)
				matrix2[i][j] = in.nextInt();

		for (i = 0; i < k; i++) {
			for (j = 0; j < l; j++) {
				System.out.print(matrix2[i][j] + " ");

			}

			System.out.println(" ");

		}

		if (n != k) {
			System.out.println("Matrices dont match!\r\n");

		} else {
			int res[][] = new int[m][l];
			System.out.println("\n\n  Multiplication matrixs:");
			for (i = 0; i < m; i++)

				for (j = 0; j < l; j++) {
					sum = 0;
					for (z = 0; z < k; z++) {
						sum += matrix[i][z] * matrix2[z][j];

					}
					res[i][j] = sum;
				}
			for (i = 0; i < m; i++) {
				for (j = 0; j < l; j++)
					System.out.print(res[i][j] + " ");

				System.out.println();
			}

		}
	}

	public static void main(String[] args) {
		frequency();
		System.out.println("*******************************");
		removeSort();
		System.out.println("*******************************");
		detOfMatrix();
		System.out.println("\n*******************************");
		multiplication();
		System.out.println("*******************************");

	}
}
