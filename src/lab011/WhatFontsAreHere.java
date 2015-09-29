/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab011;
import java.applet.*;

public class WhatFontsAreHere extends Applet {

    @Override
    public void init() {
    String FontList[];
    FontList = getToolkit().getFontList();
        for (int i=0; i < FontList.length; i++) {
            System.out.println(i + ": " + FontList[i]);
        }
    } 
}
