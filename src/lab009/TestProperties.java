package lab009;

import java.util.Properties;

/**
 * Created by user on 05.10.15.
 */
public class TestProperties {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.put("Title", "put title here");
        prop.put("Author","put author here");
        prop.put("ISBN", "ISBN not set");
        Properties book = new Properties(prop);
        book.put("Title","Java Handbook");
        book.put("Author", "Patric Newton");
        System.out.println(book.getProperty("Title"));
        System.out.println(book.getProperty("Author"));
        System.out.println(book.getProperty("ISBN"));
        System.out.println(book.getProperty("ean","???"));
    }
}
