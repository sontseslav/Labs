package lab009;

import java.util.Hashtable;

/**
 * Created by user on 05.10.15.
 */
public class Ex003 {
    public static void main(String[] args) {
        Hashtable<String,String> phoneBook = new Hashtable<>();
        phoneBook.put("Ivanov","555-55-55");
        phoneBook.put("Petrov","444-44-44");
        System.out.println(phoneBook.get("Ivanov"));
    }
}
