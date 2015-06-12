/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l005;

/**
 *
 * @author user
 */
public class Main {
    protected int x;
    protected int[] array;
    protected MyClass myInstance;

    protected Main() {
        this.x = 40;
        this.array = new int[]{11,12};
        this.myInstance = new MyClass();
    }
    
    protected void firstMethod(int x){
        //this.x = x;
        x *= 2;
    }
    
    protected void secondMethod(MyClass myInstance){
        myInstance.y *= 3;
    }
    
    protected void thirdMethod(int[] array){
        array[1] *= 4;
    }
    
    public static void main(String[] args) {
        Main instance = new Main();
        System.out.println("x = "+instance.x+"; y = "+instance.myInstance.y+"; "
                + "arrayElement = "+instance.array[1]);
        instance.firstMethod(instance.x);
        instance.secondMethod(instance.myInstance);
        instance.thirdMethod(instance.array);
        System.out.println("x = "+instance.x+"; y = "+instance.myInstance.y+"; "
                + "arrayElement = "+instance.array[1]);
    }
}
