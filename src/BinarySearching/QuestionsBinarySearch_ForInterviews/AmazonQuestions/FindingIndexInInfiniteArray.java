package BinarySearching.QuestionsBinarySearch_ForInterviews.AmazonQuestions;

import java.util.Scanner;

public class FindingIndexInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element which u want searched : " );
        int n = sc.nextInt();
        int ans = findingIndexing(arr,n);
        if(ans != -1) {
            System.out.println("The index of : " + n + " is : " + ans);
        } else {
            System.out.println("The element " + n + " is not found in the array.");
        }
    }

    static int findingIndexing(int arr[], int target){
      int start = 0;
      int end = arr.length-1;
      while(start <= end){
          int mid = start + (end - start)/2;
          if(arr[mid] == target){
              return mid;
          }else if(arr[mid] < target){
              start = mid + 1; //this will traverse into the right side of the array

          }else{
              end = mid -1 ;
          }
      }
      return -1;
    }
}