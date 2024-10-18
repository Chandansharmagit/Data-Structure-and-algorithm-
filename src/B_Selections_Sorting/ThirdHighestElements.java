package B_Selections_Sorting;

public class ThirdHighestElements {
    static int findThirdHighest(int[] arr) {
        // Perform Bubble Sort to sort the array in ascending order
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }


        if (arr.length >= 3) {
            return arr[arr.length - 3];
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int arr[] = {3, 4, 22, 10, 15, 20};
        System.out.println("Third highest element: " + findThirdHighest(arr));  // Output should be 15
    }
}
