package BinarySearching.QuestionsBinarySearch_ForInterviews.AmazonQuestions;

public class Search_in_Rotated_Sorted_Array {
    static int rotatedArray(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            // Check if the left half is sorted
            if (arr[start] <= arr[mid]) {
                // If the target is in the left half, update the end pointer
                if (arr[start] <= target && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                // If the right half is sorted
                // If the target is in the right half, update the start pointer
                if (arr[mid] < target && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 6;
        int ans = rotatedArray(arr, target);
        System.out.println(ans);
    }
}