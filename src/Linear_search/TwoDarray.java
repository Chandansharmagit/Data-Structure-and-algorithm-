package Linear_search;

import java.util.ArrayList;
import java.util.List;

public class TwoDarray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[] evens = evenNumbers(arr);

        // Print even numbers
        System.out.println("Even numbers:");
        for (int num : evens) {
            System.out.print(num + " ");
        }
    }


    //


    //finding the even numbers of given integers of array


    static int[] evenNumbers(int[][] arr){
        List<Integer> list = new ArrayList<>();
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] % 2 == 0){
                    list.add(arr[row][col]);
                }
            }
        }

        //converting the list to any array

        int[] results = new int[list.size()];
        for(int i = 0; i<list.size(); i++){
            results[i] = list.get(i);
        }
        return results;
    }


    static int[] search(int[][] arr, int target){
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }

            }
        }
        return new int[]{-1,-1};
    }


}
