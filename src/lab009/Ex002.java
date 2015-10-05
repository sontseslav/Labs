package lab009;

import java.util.Stack;

/**
 * Created by user on 05.10.15.
 */
public class Ex002 {
    public static void main(String[] args){
        Stack<String> stringStack = new Stack<>();
        stringStack.push("jeden");
        stringStack.push("dwa");
        stringStack.push("tszy");
        stringStack.push("cztery");
        stringStack.push("pieć");
        System.out.println(stringStack);
        stringStack.pop();
        stringStack.pop();
        System.out.println(stringStack);
    }
}
