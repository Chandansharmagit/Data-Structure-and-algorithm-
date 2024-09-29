package Linear_search;

import java.util.Scanner;

public class TwoDArrayQuestions {

    static String linearSearch(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    System.out.println("Element found at indices [" + i + "][" + j + "]");
                    return "adding of two element succesful found in this array";
                }
            }
        }
        System.out.println("Element not found");
        return "Element not found";
    }



    //making the method to find the sum of its individual array element

    static String addingsum(int[][] arr, int targetsum){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                for(int k = 0; k<arr.length; k++){
                    for(int l = 0; l<arr[k].length; l++){

                            int sum = arr[i][j] + arr[k][l];
                            if(sum == targetsum){

                                //finding the target sum indexing
                                if(arr[i][j] == targetsum && arr[k][l] ==targetsum){
                                    System.out.println("the element is found at the indexex " + i + " and the indexex " + j + " and the another index is "+ k + " " + l );
                                }

                                System.out.println("the adding element of " + arr[i][j] + " and " + arr[k][l] + " is : "+ targetsum + ", and the position of " + arr[i][j] + " is found at [" + i +","+ j + "] whereas  " + arr[k][l] + " is found at " + "[" + k +","+ l + "] ");
                                return "adding of two element succesful found in this array";
                            }

                    }
                }
          
            }
        }
        return "Element not found";
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 99,80},
                {4, 5, 6},
                {7, 8, 9}
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the target value which you want to search for : ");
        int target = sc.nextInt();

        String ans = addingsum(arr,target);
        System.out.println(ans);
    }
}