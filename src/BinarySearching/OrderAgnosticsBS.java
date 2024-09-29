package BinarySearching;

import java.util.Scanner;

public class OrderAgnosticsBS {

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target element:");
        int target = sc.nextInt();
        int ans = OrderAgnosticsBinarySearch(arr, target);
        System.out.println(ans);
    }

    static int OrderAgnosticsBinarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}