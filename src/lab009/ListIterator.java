package lab009;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by user on 05.10.15.
 */
public class ListIterator {

    public static void testLoop() throws IOException{
        List list = new ArrayList();
        list.add("element 1");
        list.add("element 2");
        list.add("element 3");
        list.add(0, "element 0");
        for (Iterator i = list.iterator(); i.hasNext();){
            Object element = i.next();
            System.out.println(element.toString());
        }
        for (Object element : list){
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        try{
            testLoop();
        }catch(IOException ex){
            System.out.println("IOException");
        }
    }
}
