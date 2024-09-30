package BinarySearching.QuestionsBinarySearch_ForInterviews;

import java.util.Scanner;

public class FindingSmallestAndGreatestLetter {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'd', 'e'};
        Scanner sc = new Scanner(System.in);
        char target = sc.next().charAt(0);  // Reading a single character as target
        char smallestGreater = findSmallestLetterGreater(arr, target);
        char largestSmaller = findLargestLetterSmallerOrEqual(arr, target);

        System.out.println("Smallest letter greater than target: " + smallestGreater);
        System.out.println("Largest letter smaller than or equal to target: " + largestSmaller);
    }

    // Find the smallest letter greater than the target
    static char findSmallestLetterGreater(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        // If the target is greater than or equal to the last element, wrap around to the first element
        if (target >= arr[end]) {
            return arr[0];
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return arr[start % arr.length];  // To handle wrap-around case
    }

    // Find the largest letter smaller than or equal to the target
    static char findLargestLetterSmallerOrEqual(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return arr[end % arr.length];  // Handle case when we find no letter smaller or equal
    }
}
