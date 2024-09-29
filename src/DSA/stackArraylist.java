package DSA;

import java.util.ArrayList;
import java.util.List;

public class stackArraylist {
    public class stack {


        static List<Integer> list = new ArrayList<>();

        private static boolean isEmpty() {
            return list.size() == 0;
        }

        public static void push(int data) {
            list.add(data);
        }

        public static int pop() {
            int pop = list.get(list.size() - 1);
            list.remove(pop);
            return pop;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        StackJava.Stack.push(1);
        StackJava.Stack.push(2);
        StackJava.Stack.push(3);
        StackJava.Stack.push(4);

        while(!StackJava.Stack.isEmpty()){
            System.out.println(StackJava.Stack.peek());
            StackJava.Stack.pop(); 
        }
    }



}
