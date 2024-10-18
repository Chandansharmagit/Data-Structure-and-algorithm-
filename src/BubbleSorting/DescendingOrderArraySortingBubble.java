package BubbleSorting;

public class DescendingOrderArraySortingBubble {
    static void DescendingOrder(int[] arr){
        int start = 0;
        int end = arr.length-1;

        for(int i = start; i<end; i++){
            for(int j = 1; j < end - i; j++){
                //making in descending order
                if(arr[j-1] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] ={3,60,35,2,45,320,5};

        System.out.println("Array Before Bubble Sort");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        DescendingOrder(arr);//sorting array elements using bubble sort

        System.out.println("Array After Bubble Sort");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}