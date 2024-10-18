package B_Selections_Sorting;

public class lexicographicalOrder {
    static void SortingByCharacters(String str[]){
        int start = 0;
        int end = str.length-1;

        for(int i = start; i < end; i++){
            for(int j = 0; j < end - i ; j++){
                if(str[j].compareTo(str[j+1]) > 0){
                    String temp = str[j];
                    str[j] = str[j+1];
                    str[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        String []str = {"apple", "orange", "banana", "grape", "pear"};
        SortingByCharacters(str);
        for(String s : str){
            System.out.println(s + " ");
        }

    }
}
