package BubbleSorting;

public class LettersSorting {
    static void SortingCharatersAlphabeticals(String []arr){
        int start = 0;
        int end = arr.length-1;
        for(int i = start ; i< end ; i++){
            for(int j = 0; j < (end - i); j++){
                if(arr[j].compareTo(arr[j+1])>0){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        String[] arr = {"abc", "def", "ghi", "bcd", "efg"};
        SortingCharatersAlphabeticals(arr);
        for (String str : arr) {
            System.out.print(str + " ");
        }
    }
}