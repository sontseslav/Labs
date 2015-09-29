/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab011;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

/**
 *
 * @author user
 */
public class Ex0002 extends Frame{
    private final int WIDTH = 420;
    private final int LENGTH = 450;
    
    public Ex0002(){
        super("Graphic");
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        setSize(WIDTH,LENGTH);
        setVisible(true);
    }
    
    @Override
    public void paint(Graphics g){
        Random rand = new Random();
        g.setColor(new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255)));
        for (int i = 0; i < 7; i++){
            g.drawRect(8+30*(i*2),30,30,60);
        }
        g.setColor(new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255)));
        for (int i = 0; i < 7; i++){
            g.fillRect(8+30*(i*2),100,30,60);
        }
        g.setColor(new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255)));
        for (int i = 0; i < 7; i++){
            g.drawRoundRect(8+30*(i*2),170,30,60,20,20);
        }
        g.setColor(new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255)));
        for (int i = 0; i < 5; i++){
            g.draw3DRect(8+30*(i*2),240,30,60,true);
        }
    }
    
    public static void main(String[] args){
        new Ex0002();
    }
}
