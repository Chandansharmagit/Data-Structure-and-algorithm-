package packageDSA;

public class MatrixTranspose {

    // Method to compute the transpose of a given matrix
    public static int[][] transpose(int[][] matrix) {
        // Number of rows and columns in the original matrix
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Create a new matrix to hold the transpose
        int[][] transposedMatrix = new int[cols][rows];

        // Loop through the original matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Assign the element at position (i, j) in the original matrix
                // to the position (j, i) in the transposed matrix
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        // Return the transposed matrix
        return transposedMatrix;
    }

    // Helper method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        // Example matrix
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // Compute the transpose
        int[][] transposedMatrix = transpose(matrix);

        // Print the original matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        

        // Print the transposed matrix
        System.out.println("Transposed Matrix:");
        printMatrix(transposedMatrix);
    }
}
