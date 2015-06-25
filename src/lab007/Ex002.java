/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab007;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class Ex002 implements Runnable{
    private final Thread t;
    private int timer;
    
    public Ex002(){
        this.t = new Thread(this);
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }
    
    @Override
    public void run(){
        for (int i = 0; i < 10; i++){
            System.out.println(i);
            try {
                Thread.sleep(this.timer);
            } catch (InterruptedException ex) {
                ex.getMessage();
                System.out.println(Arrays.toString(ex.getStackTrace()));
            }
        }
        System.out.println("Exiting thread"+Thread.currentThread());
    }
    
    public void start(){
        this.t.start();
    }
    
    public static void main(String[] args) {
        int t = 1000;
        Ex002 thread01 = new Ex002();
        Ex002 thread02 = new Ex002();
        thread01.setTimer(t);
        thread02.setTimer(t);
        thread01.start();
        thread02.start();
        try {
            Thread.sleep(11000);
        } catch (InterruptedException ex) {
            ex.getMessage();
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
        thread01 = null;
        thread02 = null;
        thread01 = new Ex002();
        thread02 = new Ex002();
        thread01.setTimer(t+250);
        thread02.setTimer(t-250);
        thread01.start();
        thread02.start();
    }
}
