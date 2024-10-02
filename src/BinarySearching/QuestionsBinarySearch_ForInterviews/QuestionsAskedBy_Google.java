package BinarySearching.QuestionsBinarySearch_ForInterviews;

import java.util.Scanner;

//finding the ceiling of the array

public class QuestionsAskedBy_Google {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48, 50};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target number: ");
        int target = sc.nextInt();
        int ans = findingCeilling(arr, target);
        int floor_ans = findingfloor(arr, target);
        //finding the last index value of given array
        int lastindexvalue = arr.length - 1;
        int value = arr[lastindexvalue];
        try {
            if (ans != -1) {
                System.out.println("Ceiling of the target is: " + arr[ans]);
                System.out.println("floor of the target is: " + arr[floor_ans]);
            } else {
                System.out.println("No ceiling found for the target.");
                System.out.println("No floor found for the target.");
            }
        } catch (Exception e) {
            System.out.println("sorry this element is not found in given array : " + target + " you have to enter any Random number i.e less than or equal to " + value);
            System.out.println("sorry this element is not found in given array : " + target + " you have to enter any Random number i.e less than or equal to " + value);
        }


    }

    static int findingCeilling(int[] arr, int target) {
        int starting = 0;
        int end = arr.length - 1;

        while (starting <= end) {
            int mid = starting + (end - starting) / 2;


            //printing the number less than target
            if (arr[mid] == target) {

                return mid;
            } else if (arr[mid] < target) {
                starting = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return starting;
    }

    //finding the floor

    static int findingfloor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            for (int i = 0; i < arr.length - 1; i++) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] < target) {

                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }
        return end;
    }
}
