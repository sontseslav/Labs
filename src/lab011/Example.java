/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab011;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/**
 *
 * @author user
 */
public class Example extends Frame{
    public Example(){
        super("Graphic");
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        setSize(400,400);
        setVisible(true);
    }
    
    @Override
    public void paint(Graphics g){
        for(int i = 0; i < 300; i += 10){
            g.drawLine(i,i,i+10,i);
        }
        int left = 10;
        int top = 30;
        int width = 40;
        int height = 30;
        int horizontalRadius = 15;
        int verticalRadius = 20;
        boolean polarity = false;
        
        g.setColor(Color.yellow);
        g.drawRoundRect(left, top, width, height, horizontalRadius, verticalRadius);
        g.draw3DRect(left+70, top+70, width+70, height+70, polarity);
        
        g.setXORMode(Color.green);
        int w = 200;
        int h = 150;
        g.drawRect(40,40,w,h);
        Font f=new Font("Courier", Font.PLAIN, 18);
        g.setFont(f);
        FontMetrics fm = g.getFontMetrics();
        g.drawString("Courier", 41, 40+fm.getHeight());
        f=new Font("TimesRoman", Font.ITALIC,12);
        g.setFont(f);
        fm=g.getFontMetrics();
        g.drawString("TimesRoman", w-fm.stringWidth("TimesRoman"),40+fm.getHeight());
        f=new Font("Arial", Font.PLAIN,18);
        g.setFont(f);
        fm=g.getFontMetrics();
        g.drawString("Arial",40,h);
        f=new Font("Dialog", Font.PLAIN,18);
        g.setFont(f);
        fm=g.getFontMetrics();
        g.drawString("Dialog",w-fm.stringWidth("Dialog"),h);

    }
    
    public static void main(String[] args){
        new Example();
    }
}
