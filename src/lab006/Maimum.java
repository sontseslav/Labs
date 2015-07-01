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
public class Maimum {
    public static void main(String[] args) {
        System.out.println("Enter three numbers:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        String answ = (a >= b && a >= c)?(a+" is max"):((b>=c && b>=a)
                ?(b+" is max"):(c+" is max"));
        System.out.println(answ);
    }
}
