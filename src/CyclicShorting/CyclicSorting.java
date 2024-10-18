package CyclicShorting;

public class CyclicSorting {
    static void CyclicSorting(int[] arr) {
        int start = 0;
        while (start < arr.length) {
            int correct = arr[start] - 1;
            if (arr[start] != arr[correct]) {
                swap(arr, start, correct);
            } else {
                start++;
            }
        }
    }

    static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;

        //this will throw the output in the wrong position

    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 2, 1, 4};
        CyclicSorting(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
