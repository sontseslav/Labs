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
public class Ex0001 extends Frame{
    private final int WIDTH = 400;
    private final int LENGTH = 450;
    
    public Ex0001(){
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
        
        g.drawLine(20, 30, 360, 30);
        Color oldColor = g.getColor();
        Color newColor = new Color(0, 0, 255);
        g.setColor(newColor);
        g.drawLine(20, 40, 360, 40);
        
        g.setColor(oldColor);
        g.drawRect(20, 50, 340, 20);
        newColor = new Color(0, 215, 255);
        g.setColor(newColor);
        g.fillRect(20, 80, 339, 19);
        
        g.setColor(oldColor);
        g.drawRoundRect(20, 110, 340, 30, 20, 15);
        g.drawOval(20, 150, 150, 60);
        g.drawOval(200, 150, 60, 60);
        g.drawArc(280, 150, 80, 60, 0, 180);
        
        int[] arrayX = {20, 110, 110, 250, 250, 20, 20, 50};
        int[] arrayY = {220, 220, 240, 240, 260, 240, 240, 230};
        Polygon poly = new Polygon(arrayX, arrayY, 8);
        g.drawPolygon(poly);
        g.drawString("Yes", 60, 235);
        
        newColor = new Color(0, 0, 255);
        g.setColor(newColor);
        Font font = new Font("SansSerif", Font.BOLD|Font.ITALIC, 40);
        Font oldFont = g.getFont();
        g.setFont(font);
        g.drawString("SBP", 270, 255);
        g.setFont(oldFont);
        g.setColor(oldColor);
        
        g.drawLine(20, 250, 20, 380);
        g.drawLine(20, 380, 360, 380);
        g.drawString("Y", 25, 255);
        g.drawString("X", 350, 376);		
        
        int[] xArray = {20, 40, 60, 80, 100, 120, 130, 140, 280, 332};
        int[] yArray = {380, 375, 370, 330, 320, 310, 305, 303, 302, 299};
        int nPoint = 10;
        g.setColor(newColor);
        g.drawPolyline(xArray, yArray, nPoint);
        g.setColor(oldColor);
        g.drawString("y = f(x)", 180, 300);
    }
    
    public static void main(String[] args){
        new Ex0001();
    }
}
