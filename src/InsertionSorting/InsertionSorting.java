package InsertionSorting;

public class InsertionSorting {

    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 1, 2};  // Array to be sorted

        // Insertion Sort Algorithm
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];  // The current element to be inserted in the correct position
            int j = i - 1;

            // Shift elements that are greater than current to one position ahead
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place the current element in its correct position
            arr[j + 1] = current;
        }

        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
