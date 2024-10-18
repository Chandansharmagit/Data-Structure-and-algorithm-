package BinarySearching.QuestionsBinarySearch_ForInterviews.AmazonQuestions;

public class PositiveNumbers {

    // Helper function to find the first index where nums[i] > 0
    static int findFirstPositive(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > 0) {
                end = mid - 1;  // Search in the left half
            } else {
                start = mid + 1;  // Search in the right half
            }
        }
        return start;
    }

    // Helper function to find the last index where nums[i] < 0
    static int findLastNegative(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < 0) {
                start = mid + 1;  // Search in the right half
            } else {
                end = mid - 1;  // Search in the left half
            }
        }
        return end;
    }

    static int maximumCount(int[] nums) {
        // Find the first positive number
        int firstPositiveIndex = findFirstPositive(nums);

        // Find the last negative number
        int lastNegativeIndex = findLastNegative(nums);

        // Count positive numbers
        int positiveCount = nums.length - firstPositiveIndex;

        // Count negative numbers
        int negativeCount = lastNegativeIndex + 1;

        // Return the maximum of the two counts
        return Math.max(positiveCount, negativeCount);
    }

    public static void main(String[] args) {
        int arr[] = {-2, -1, -1, 0, 1, 2, 3};
        System.out.println(maximumCount(arr));  // Output: 3
    }
}
