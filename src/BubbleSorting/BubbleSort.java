package BubbleSorting;

public class BubbleSort {
    public static void bubbleSort(String[] arr) {
        int start = 0;
        int end = arr.length-1;
        for(int i = 0; i < end ; i++){
            for(int j = 0; j < end - i; j++){
                if(arr[j].compareTo(arr[j+1]) > 0){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        String arr[] = {"apple","orange", "banana", "mango"};
        bubbleSort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
