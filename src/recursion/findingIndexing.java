package recursion;

import java.util.ArrayList;
import java.util.List;

public class findingIndexing {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 4, 6, 8};
        int target = 4;
        List<Integer> indices = indexing(arr, target, 0, new ArrayList<>());
        System.out.println("Target found at indices: " + indices);
    }
    
    static List<Integer> indexing(int[] arr, int target, int index, List<Integer> indices) {
        if (arr == null) {
            throw new NullPointerException("Input array is null");
        }
        if (index == arr.length) {
            return indices;
        }
        if (arr[index] == target) {
            indices.add(index);
        }

        return indexing(arr, target, index + 1, indices);
    }
}