package lab009;

import java.util.Stack;
import java.util.EmptyStackException;

/**
 * Created by user on 05.10.15.
 */
public class TestStack {

    public static void showPush(Stack st, int a){
        st.push(new Integer(a));
        System.out.println("push("+a+")");
        System.out.println("stack: "+st);
    }

    public static void showPop(Stack st)throws EmptyStackException{
        System.out.print("pop -> ");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("stack: "+st);
    }

    public static void main(String[] args){
        Stack st = new Stack();
        System.out.println("stack: "+st);
        showPush(st,42);
        showPush(st,66);
        showPush(st,99);
        showPop(st);
        showPop(st);
        showPop(st);
        try{
            showPop(st);
        }catch(EmptyStackException ex){
            System.out.println("Empty stack");
        }
    }
}
