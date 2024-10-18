package B_Selections_Sorting;

public class SwappingWithMinimum {
    static void SelectionMinimun(int []arr){
        int start = 0;
        int end = arr.length-1;
        for(int i = start; i< end ; i++){
            for(int j = 0; j < end - i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int []arr = {29, 10, 14, 37, 13};
        SelectionMinimun(arr);
        for(int i : arr){
            System.out.print(i + " -> ");
        }
    }
}
