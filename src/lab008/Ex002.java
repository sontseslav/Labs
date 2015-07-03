/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab008;

/**
 *
 * @author user
 */
public class Ex002 {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Hello");
        sb.insert(1, 'i');
        sb.setLength(2);
        System.out.println("Hello --> "+sb.toString());
    }
}
