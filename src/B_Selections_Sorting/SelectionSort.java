package B_Selections_Sorting;

public class SelectionSort {

    static void SelectionSorting(int[] arr) {
        int n = arr.length;


        for (int i = 0; i < n - 1; i++) {

            int minIndex = findMin(arr, i, n);


            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }


    static int findMin(int[] arr, int start, int end) {
        int minIndex = start;
        for (int i = start + 1; i < end; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }


    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        SelectionSorting(arr);


        System.out.println("Sorted Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
