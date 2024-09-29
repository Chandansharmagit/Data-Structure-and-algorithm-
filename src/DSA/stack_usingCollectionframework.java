package DSA;

import java.util.Stack;

public class stack_usingCollectionframework {
    public static void main(String[] args) {
        try{
            Stack<Integer> stack = new Stack<>();
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);

            while (!stack.isEmpty()){
                System.out.println(stack.pop());
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
