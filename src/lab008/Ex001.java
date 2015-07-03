/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab008;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Ex001 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some string:");
        String s = scan.next();
        System.out.println("Your string length is "+s.length());
    }
}
