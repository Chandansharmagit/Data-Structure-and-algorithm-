package Linear_search;

public class LinearSearch {
    //sorting the array
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        } else {
            for (int i = 0; i < arr.length; i++) {
                int element = arr[i];
                if (element == target) {
                    return i;
                }
            }
        }
        return -1;
    }


    //returning the direct the elements

    static int linearSearch2(int[] arr2, int target) {
        if (arr2.length == 0) {
            return -1;
        } else {
            for (int element : arr2) {
                if (element == target) {
                    return element;
                }
            }
        }
        return -1;
    }


    //returning the true or false if the element found at the given indexing in the parameter of the single row


    static boolean linearSearch3(int[] arr3, int target) {
        if (arr3.length == 0) {
            return false;

        } else {
            for (int element : arr3) {
                if (element == target) {
                    return true;
                }
            }
        }

        return false;
    }


    //searching the letter in characters

    static boolean linearCharacterSearch(String str, String target) {
        if (str.length() == 0) {
            return false;
        } else {
            char targetChar = target.charAt(0);
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == targetChar) {
                    return true;
                }
            }
        }
        return false;
    }


    //searching the element in the string and also finding its positions

    static int linearSearch4(int[] arr4, int target){
        if(arr4.length == 0){
            return -1;
        }else{
            for(int i = 0; i< arr4.length ; i++){
                if(arr4[i] == target) {
                    return i;
                }
            }
        }
        return -1;

    }



    //finding the min and max element from the array

    static int linearSearch5(int[] arr5){
        if(arr5.length == 0){
            return -1;
        }

        int min = arr5[0];
        for(int i = 0; i<arr5.length ; i++){
            //finding the minimum value from the array
            if(arr5[i] > min){
                min = arr5[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
//        int[] arrs = {23,56,34,67,12,-9,19,20,89,5};
//        int target = 34;
//        int ans = linearSearch(arrs,target);
//        System.out.println(ans);

//        int[] arr2 = {23,56,34,67,12,-9,19,20,89,5};
//        int target = 56;
//        int element = linearSearch2(arr2, target);
//        System.out.println(eleme+nt);

//
//        String str = "Deepika chandan";
//        String target = "z";
//        boolean found = linearCharacterSearch(str, target);
//        if (found) {
//            System.out.println("Target character '" + target + "' found in the string.");
//        } else {
//            System.out.println("Target character '" + target + "' not found in the string.");
//        }
//        int[] arrs = {23,56,34,67,12,-9,19,20,89,5};
//        int target = 34;
//        int ans = linearSearch4(arrs,target);
//        System.out.println("the position is " + ans + " and th
//        e value is " +  target);


        int[] arrs = {23,56,34,67,12,1,19,20,89,5};
        int target = linearSearch5(arrs);
        System.out.println(target);
    }

}
