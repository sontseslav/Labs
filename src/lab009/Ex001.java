package lab009;

import java.util.Vector;

/**
 * Created by user on 05.10.15.
 */
public class Ex001 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.addElement(10);
        vector.addElement(20);
        vector.addElement(30);
        vector.addElement(40);
        vector.addElement(60);
        System.out.println(vector);
        vector.add(2,new Integer(11));
        vector.add(2,new Integer(12));
        vector.remove(vector.size()-2);
        for(Integer i : vector){
            System.out.println(i.toString());
        }
    }
}
