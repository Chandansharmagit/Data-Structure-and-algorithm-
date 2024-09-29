package BinarySearching;

import java.util.Scanner;

public class OrderDiagnisticsQuestions {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int target = sc.nextInt();
        int ans = AdscDesc(arr, target);
        System.out.println("the index "+ target + " found at position : " + ans);
    }

    static int AdscDesc(int []arr, int target){
        int start = 0;
        int end = arr.length-1;

        boolean found = arr[start] > arr[end];
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == arr[mid]){
                return mid;
            }else if(found){
                if(target < arr[mid]){
                    end = mid -1;

                }else{
                    start = mid + 1;
                }
            }else{
                if(target > arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid -1 ;
                }
            }
        }
        return -1;
    }
}
