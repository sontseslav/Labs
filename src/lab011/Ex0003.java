/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab011;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class Ex0003 extends JFrame {

    public Ex0003() {
        super("Simple component test");
        JPanel cp = new JPanel(new BorderLayout());
        cp.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5),
                BorderFactory.createLineBorder(Color.black)));
        setContentPane(cp);
        cp.add(new SimpleComponent(), BorderLayout.CENTER);
        JButton btn = new JButton("Close");
        btn.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
        cp.add(btn, BorderLayout.SOUTH);
        cp.setBackground(Color.green);
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    
    public static void main(String[] args){
        new Ex0003().setVisible(true);
    }
}


class SimpleComponent extends JPanel {

    public SimpleComponent() {
        setOpaque(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.blue);
        g2d.fillOval(10, 10, getWidth() - 20, getHeight() * 2 - 20);
        g2d.setColor(Color.red);
        g2d.fillOval(20, 20, getWidth() - 40, getHeight() - 40);
        g2d.setColor(Color.yellow);
        g2d.fillOval(30, 30, getWidth() - 60, getHeight() - 60);
        g2d.setColor(Color.black);
        g2d.fillOval(getWidth()/4 - getWidth()/16, getHeight()/2-getHeight()/8, getWidth()/8, getHeight()/8);
        g2d.fillOval(getWidth()*3/4 - getWidth()/16, getHeight()/2-getHeight()/8, getWidth()/8, getHeight()/8);
        g2d.setStroke(new BasicStroke(10, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g2d.drawArc(getWidth()/4, getHeight()/4, getWidth()/2, getHeight()/2, 225, 90);
    }
}