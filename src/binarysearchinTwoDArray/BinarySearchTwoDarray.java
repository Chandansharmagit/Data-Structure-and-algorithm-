package binarysearchinTwoDArray;

public class BinarySearchTwoDarray {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };

        int target = 17;

        int[] result = binarySearching(matrix, target);
        if (result[0] != -1) {
            System.out.println(target + " found at position: (" + result[0] + ", " + result[1] + ")");
        } else {
            System.out.println(target + " not found in the matrix.");
        }
    }

    static int[] binarySearching(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[] {row, col};
            }
            if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return new int[] {-1, -1};
    }
}
