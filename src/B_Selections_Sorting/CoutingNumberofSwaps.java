package B_Selections_Sorting;

public class CoutingNumberofSwaps {
    static int NumberOfSwaps(int []arr){
        int start = 0;
        int end = arr.length-1;
        int CountSwaps = 0;
        for(int i = start; i< end; i++){
            for(int j = 0; j < arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    CountSwaps++;
                }
            }
        }
        return CountSwaps;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(NumberOfSwaps(arr));
    }
}
