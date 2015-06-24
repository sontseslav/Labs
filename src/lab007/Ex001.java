/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab007;


/**
 *
 * @author user
 */
public class Ex001 {
    public static int toSquare(int x)throws MyExeption{
        if (x <= 0) throw new MyExeption("Это мое исключение!");
        return (int)Math.pow(x, 2);
    }
    
    public static void main(String[] args) {
        try {
            System.out.println(toSquare(5));
            System.out.println(toSquare(-5));
            System.out.println(toSquare(3));
        } catch (MyExeption ex) {
            System.out.println("Exception: "+ex);
        }finally{
            System.out.println("Исключения отработаны!");
        }
    }
}
