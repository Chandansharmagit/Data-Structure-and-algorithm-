package packageDSA;

public class twodarray {
    public static void main(String[] args) {
        int[][] matrix = {
                {3, 2, 1, 7},
                {9, 11, 5, 4},
                {6, 0, 13, 17},
                {7, 21, 14, 15}
        };

        int[][] matrix2 = {
                {4, 5, 7, 8},
                {2, 4, 6, 1},
                {9, 5, 6, 3},
                {2, 5, 6, 3}
        };


        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                for (int m = 0; m < matrix2.length; m++) {
                    for (int n = 0; n < matrix2[m].length; n++) {
                        sum += (matrix[i][j] * matrix2[m][n]);
                    }
                }

            }
            System.out.println("sum = " + sum);
        }
    }
}