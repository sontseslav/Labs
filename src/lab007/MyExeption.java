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
public class MyExeption extends Exception{
    private final String str;

    public MyExeption(String str) {
        this.str = str;
    }
    
    @Override
    public String toString(){
        return "MyException("+str+")";
    }
}
