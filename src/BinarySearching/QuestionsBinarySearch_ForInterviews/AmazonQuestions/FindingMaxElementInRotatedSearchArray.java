package BinarySearching.QuestionsBinarySearch_ForInterviews.AmazonQuestions;

public record FindingMaxElementInRotatedSearchArray() {
    static int findingMaxElementIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
        }

        // If the array is not rotated, the maximum element is at the end
        return start;
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 3, 4};

        int ans = findingMaxElementIndex(arr);
        System.out.println("Index of the maximum element: " + ans);
    }
}