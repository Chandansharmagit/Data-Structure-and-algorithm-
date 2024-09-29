package packageDSA;

public class transposing {

    public static int[][] transpose(int arr[][]){
        int rows = arr.length;
        int cols = arr[0].length;

        int[][] transposed = new int[rows][cols];
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                transposed[i][j] = arr[i][j];
            }
        }
        return transposed;
    }


    //making the helper method which helps to me find or assign the flipping the first order to lastone

    public static void printflip(int[][]arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;i<arr[i].length;j++){
                System.out.println(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        //assignong the matrix

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] transposedMatrix = transpose(matrix);

        System.out.println("origal matrix");
        printflip(matrix);

        System.out.println("transposed matrix");
        printflip(transposedMatrix);


        //this is the complete code for the tranposing the matrix and the qno 3 solved sucess...
     }
}
