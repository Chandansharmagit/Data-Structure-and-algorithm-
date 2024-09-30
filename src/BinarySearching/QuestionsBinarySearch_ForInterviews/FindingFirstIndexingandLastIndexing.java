package BinarySearching.QuestionsBinarySearch_ForInterviews;

import java.util.Scanner;

public class FindingFirstIndexingandLastIndexing {
    public static void main(String[] args) {
        int arr[] = {5, 7, 7, 8, 8, 10};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target: ");
        int target = sc.nextInt();

        // Find first and last index of the target
        int firstIndex = findFirstIndex(arr, target);
        int lastIndex = findLastIndex(arr, target);

        System.out.println("The first index of " + target + " is " + firstIndex);
        System.out.println("The last index of " + target + " is " + lastIndex);
    }

    // Function to find the first occurrence of the target
    static int findFirstIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int result = -1;  // To store the index if found

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                result = mid;   // Found the target
                end = mid - 1;  // Look for earlier occurrences in the left half
            } else if (arr[mid] < target) {
                start = mid + 1;  // Move right
            } else {
                end = mid - 1;    // Move left
            }
        }
        return result;
    }

    // Function to find the last occurrence of the target
    static int findLastIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int result = -1;  // To store the index if found

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                result = mid;   // Found the target
                start = mid + 1;  // Look for later occurrences in the right half
            } else if (arr[mid] < target) {
                start = mid + 1;  // Move right
            } else {
                end = mid - 1;    // Move left
            }
        }
        return result;
    }
}
