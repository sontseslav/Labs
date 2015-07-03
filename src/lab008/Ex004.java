/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab008;

import java.util.StringTokenizer;

/**
 *
 * @author user
 */
public class Ex004 {
    public static void main(String[] args) {
        String str = "title=The Java Handbook:" + "author=Patrick Naughton:" 
                + "isbn=0-07-882199-1:" + "ean=9 780078821998:" 
                + "email=naughton@starwave.com";
        StringTokenizer token = new StringTokenizer(str, ":");
        while(token.hasMoreTokens()){
            System.out.println(token.nextToken().replace("=", "\t"));
        }

    }
}
