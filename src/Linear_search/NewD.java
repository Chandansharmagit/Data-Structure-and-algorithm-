package Linear_search;

public class NewD {

    static int addingsum(int[][] arr, int targetsum){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                for(int k = 0; k<arr.length; k++){
                    for(int l = 0; l<arr[k].length; l++){
                        if(i != k || j != l){
                            int sum = arr[i][j] + arr[k][l];
                            if(sum == targetsum){
                                System.out.println("The adding of two elements is " + arr[i][j] + " and " + arr[k][l]);
                                return 1;
                            }
                        }
                    }
                }
          
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 99,80},
            {4, 5, 6},
            {7, 8, 9}
    };
    int target = 8;
    int ans = addingsum(arr,target);
    System.out.println(ans);
        
    }
}
