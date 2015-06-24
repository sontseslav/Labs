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
public class Graph {
    public static void main(String[] args) {
        System.out.println("Enter coordinates:");
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        if (x+y >= 1 && x*x+y*y <= 1){
            System.out.println("Matched");
        }else{
            System.out.println("Not Matched");
        }
    }
}
