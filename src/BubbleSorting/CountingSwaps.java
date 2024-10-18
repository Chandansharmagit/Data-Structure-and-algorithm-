package BubbleSorting;

public class CountingSwaps {
    static int countingSwaps(int arr[]) {
        int swapsCount = 0; // To count the number of swaps
        int n = arr.length;

        // Bubble sort implementation
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapsCount++; // Increment the swap count
                }
            }
        }
        return swapsCount; // Return the total number of swaps
    }

    public static void main(String[] args) {
        int arr[] = {7, 1, 2, 3, 4, 5, 6}; // Array with some unsorted elements
        int swapCount = countingSwaps(arr); // Call method and get the number of swaps

        System.out.println("The total number of swaps is: " + swapCount);

        System.out.println("Sorted Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print( " -> " + arr[i]);
        }
    }
}
