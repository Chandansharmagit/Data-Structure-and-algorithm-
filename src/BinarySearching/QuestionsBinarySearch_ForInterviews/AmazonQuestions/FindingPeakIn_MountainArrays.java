package BinarySearching.QuestionsBinarySearch_ForInterviews.AmazonQuestions;

// Questions By Amazon
// Finding the peak element in a mountain array
// Difficulty level: Medium

public class FindingPeakIn_MountainArrays {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 6, 5, 4, 3, 2, 1};
        int ans = findPeakElement(arr);
        System.out.println(ans);
    }

    static int findPeakElement(int arr[]) {
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
}