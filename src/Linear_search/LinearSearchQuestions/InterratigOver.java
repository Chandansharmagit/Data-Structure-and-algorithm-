package Linear_search.LinearSearchQuestions;

public class InterratigOver {
    static int interatinOverArray(int arr[] , int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,6,7,8,10};
        int target = 8;
        int ans = interatinOverArray(arr,target);
        System.out.println("the index of " + target + " is " + ans);
    }
}
