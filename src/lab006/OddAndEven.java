/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab006;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class OddAndEven {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        number &= 0b00000001;
        String answ = (number == 1) ? "odd" : "even";
        System.out.println("Number is "+answ);
    }
}
