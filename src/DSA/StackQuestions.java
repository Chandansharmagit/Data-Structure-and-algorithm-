package DSA;

import java.util.Stack;

public class StackQuestions {
    //push no 4 at the bottom of the stack height
    public static void pushatBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushatBottom(data,s);
        s.push(top);

    }
}
