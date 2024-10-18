package recursion;

public class fibonaciNumber {
    public static void main(String[] args) {
        int arr[] = {1,2,13,5,6,5,7};
        int n = 5;
        int ans = sorted(arr,0 + 1,n);
        System.out.println(ans);
    }
    static int sorted(int []arr, int index,int target){
        if(index == arr.length-1){
            return -1;
        }
        if(arr[index] == target ){
            return index;
        }
        return sorted(arr, index+1, target);
    }
}
