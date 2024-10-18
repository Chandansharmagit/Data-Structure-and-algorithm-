package recursion;

import java.util.ArrayList;
import java.util.List;

public class returingDublicateIndexing {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,5};
        int target = 5;
        List<Integer> indeces = sorting(arr, 0, target , new ArrayList<>());
        System.out.println(" -> " + indeces);
    }

    static List<Integer> sorting(int arr[], int indexing, int target, List<Integer> indeces){
        if(indexing == arr.length){
            return indeces;
        }

        if(arr[indexing] == target){
            indeces.add(indexing);
        }
        return sorting(arr, indexing+1, target, indeces);
    }
}
