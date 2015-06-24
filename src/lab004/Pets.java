/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab004;

/**
 *
 * @author user
 */
abstract class Pets {
    protected String name;
    protected int age;
    protected boolean hungry;
    
    protected abstract void voice();
}

class Cat extends Pets{
    
    @Override
    protected void voice(){
        System.out.println("Mew");
    }
}

class Dog extends Pets{
    
    @Override
    protected void voice(){
        System.out.println("Wof");
    }
}

class Fish extends Pets{

    @Override
    protected void voice(){
        System.out.println("");
    }
}