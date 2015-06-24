/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab006;

/**
 *
 * @author user
 */
public class SumMul {
    public static void main(String[] args) {
        double x = 1, y = 0;
        for (int i=1; i<=4;i++){
            x *= (2*i+x*Math.pow(i, 2));
        }
        for (int n = 3; n <= 10; n++){
            y += Math.pow(n, 3)/(Math.pow(n, 2)+1);
        }
        System.out.printf("FOR cycle result: X=%.0f, Y=%.3f; %n",x,y);
        x=1; y=0;
        int i=1, n=3;
        while (i<=4){
            x *= (int)(2*i+x*Math.pow(i, 2));
            i++;
        }
        while(n<=10){
            y += Math.pow(n, 3)/(Math.pow(n, 2)+1);
            n++;
        }
        System.out.printf("WHILE cycle result: X=%.0f, Y=%.3f; %n",x,y);
        x=1; y=0;
        i=1; n=3;
        do{
            x *= (int)(2*i+x*Math.pow(i, 2));
            i++;
        }while(i<=4);
        do{
            y += Math.pow(n, 3)/(Math.pow(n, 2)+1);
            n++;
        }while(n<=10);
        System.out.printf("DO WHILE cycle result: X=%.0f, Y=%.3f; %n",x,y);
    }
}
