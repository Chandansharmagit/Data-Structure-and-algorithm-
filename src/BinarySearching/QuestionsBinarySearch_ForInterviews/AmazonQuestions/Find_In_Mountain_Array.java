package BinarySearching.QuestionsBinarySearch_ForInterviews.AmazonQuestions;

import java.util.Scanner;

public class Find_In_Mountain_Array {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 3, 1};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int target = sc.nextInt();
        int ans = finding(arr, target);
        System.out.println("The mountain array is : " + ans);
    }

    static int finding(int arr[], int target) {
        int peak = findPeak(arr);
        int result = binarySearchAscending(arr, target, 0, peak);
        if (result == -1) {
            result = binarySearchDescending(arr, target, peak + 1, arr.length - 1);
        }
        return result;
    }

    static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    static int binarySearchAscending(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int binarySearchDescending(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
