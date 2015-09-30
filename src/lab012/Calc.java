package lab012;

/**
 * Created by coder on 29.09.15.
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Calc extends JFrame implements ActionListener, FocusListener{
    public float num;
    public float buf;
    public int code;
    public JTextField name1;
    public JLabel label2;
    public JButton but[];
    public boolean point;
    public String str = "0";

    public Calc(){
        super("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panelNorth = new JPanel(new BorderLayout());
        add(panelNorth, BorderLayout.NORTH);
        this.name1 = new JTextField(10);
        panelNorth.add(name1, BorderLayout.CENTER);
        name1.setBackground(Color.LIGHT_GRAY);
        name1.addFocusListener(this);
        JPanel pn = new JPanel(new GridLayout(3,2,5,0));
        add(pn, BorderLayout.CENTER);
        pn.setBackground(Color.BLUE);

        this.but = new JButton[17];
        for(int i = 0;i <= 9; i++){
            but[i] = new JButton(""+i);
            but[i].addActionListener(this);
            pn.add(but[i]);
        }
        but[10] = new JButton("-");
        but[11] = new JButton("+");
        but[12] = new JButton("*");
        but[13] = new JButton("=");
        but[14] = new JButton("/");
        but[15] = new JButton(".");
        but[16] = new JButton("C");
        for(int i = 10;i < 17; i++){
            but[i].addActionListener(this);
            pn.add(but[i]);
        }

        setSize(300,300);
        setVisible(true);
    }

    @Override
    public void focusGained(FocusEvent e) {
        if(e.getSource() == name1) {
            name1.setBackground(Color.GREEN);
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if(e.getSource() == name1) {
            name1.setBackground(Color.LIGHT_GRAY);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        num = new Float(str).floatValue();
        if(e.getSource() == but[0]) zero();
        if(e.getSource() == but[1]) chislo("1");
        if(e.getSource() == but[2]) chislo("2");
        if(e.getSource() == but[3]) chislo("3");
        if(e.getSource() == but[4]) chislo("4");
        if(e.getSource() == but[5]) chislo("5");
        if(e.getSource() == but[6]) chislo("6");
        if(e.getSource() == but[7]) chislo("7");
        if(e.getSource() == but[8]) chislo("8");
        if(e.getSource() == but[9]) chislo("9");

        if(e.getSource() == but[10]){// -
            code = 1;buf = num;str = "0";
        }
        if(e.getSource() == but[11]){// +
            code = 2;buf = num;str = "0";
        }
        if(e.getSource() == but[12]){// *
            code = 3;buf = num;str = "0";
        }
        if(e.getSource() == but[13]) result();
        if(e.getSource() == but[14]){// /
            code = 4;buf = num;str = "0";
        }
        if(e.getSource() == but[15] && !point) {
            point = true;
            str += ".";
            name1.setText(str);
        }
        if(e.getSource() == but[16]) sbros();
    }
    private void zero(){
        if(!str.equals("0")) str += "0";
        name1.setText(str);
    }
    private void chislo(String s){
        if(str.equals("0")) str = s;
        else str += s;
        name1.setText(str);
    }
    private void result(){
        switch (code){
            case 1:
                num = buf - num;
                break;
            case 2:
                num += buf;
                break;
            case 3:
                num *= buf;
                break;
            case 4:
                if(num != 0) num = buf/num;
                else {
                    name1.setText("Zero division!");
                    return;
                }
        }
        str = String.valueOf(num);
        name1.setText(str);
    }
    private void sbros(){
        num = 0;
        buf = 0;
        code = 0;
        str = "0";
        point = false;
        name1.setText(str);
    }
    public static void main(String[] args){
        new Calc();
    }
}
