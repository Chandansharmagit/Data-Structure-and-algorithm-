package BinaryPractiseQuestions;

import java.util.Scanner;

public class LessthenEqualLetters {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'd', 'e'};
        Scanner sc = new Scanner(System.in);
        char target = sc.next().charAt(0);
        char ans = lessthenorequal(arr, target);
        char ans1 = greaterthenValue(arr,target);
        System.out.println("The target is " + ans);
        System.out.println("The target is " + ans1);

    }

    //finding the letter greater than target

    static char greaterthenValue(char[] arr, char target){
        int start = 0;
        int end = arr.length -1;
        if (target >= end){
            return arr[0];
        }

        while(start <= end){
            int mid = start + (end - start) /2;
            if(arr[mid] >= target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return arr[start % arr.length];

    }

    static char lessthenorequal(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;


        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[end % arr.length];


    }
}
