package B_Selections_Sorting;

public class MinimumElements {
    static int findmin(int arr[]){
        int count = arr[0];
        for( int i = 1; i < arr.length ; i++){
            if(arr[i] < count){
                count = arr[i];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {34,12,10,4,5,12};
        System.out.println(findmin(arr));
    }
}
