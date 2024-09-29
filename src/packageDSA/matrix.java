package packageDSA;

import java.util.Scanner;

public class matrix {

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Declaring and initializing the 2D array
        int[][] matrix = {
                { 3, 2, 1, 7 },
                { 9, 11, 5, 4 },
                { 6, 0, 13, 17 },
                { 7, 21, 14, 15 }
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find: ");
        int x = sc.nextInt();
        sc.close();

        boolean found = false;

        // Finding the position of the specified number
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == x) {
                    System.out.println("Number " + x + " found at position: (" + i + ", " + j + ")");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Number " + x + " not found in the matrix.");
        }

        printMatrix(matrix);
    }
}
