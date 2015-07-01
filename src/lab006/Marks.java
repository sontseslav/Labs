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
public class Marks {
    public static void main(String[] args){
        System.out.println("Enter your mark:");
        Scanner scan = new Scanner(System.in);
        int mark = scan.nextInt();
        if (mark > 5 || mark < 1){
            System.out.println("Mark must be number from 1 to 5 inclusively");
        }else{
            switch (mark){
                case 1:{
                    System.out.println("one");
                    break;
                }
                case 2:{
                    System.out.println("two");
                    break;
                }
                case 3:{
                    System.out.println("three");
                    break;
                }
                case 4:{
                    System.out.println("four");
                    break;
                }case 5:{
                    System.out.println("five");
                    break;
                }
            }
        }
    }
}
