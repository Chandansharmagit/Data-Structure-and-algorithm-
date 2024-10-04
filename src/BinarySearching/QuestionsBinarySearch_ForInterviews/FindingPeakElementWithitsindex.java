package BinarySearching.QuestionsBinarySearch_ForInterviews;

import java.util.Scanner;

public class FindingPeakElementWithitsindex {
    public static void main(String[] args) {
        int arr[] = {5, 7, 7, 8, 8,8, 10};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target: ");
        int target = sc.nextInt();
        int ans = fidningPeak(arr,target);
        System.out.println("the peak is : " + ans);
    }
    static int fidningPeak(int []arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] <= target){
                end = mid -1;

            }else{
                start = mid +1;
            }
        }
        return -1;//this will be the wrong answer check the another anser int he console in the data 
    }
}
