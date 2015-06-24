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
public class PetsRunner {
    public static void main(String[] args) {
        Pets cat = new Cat();
        Pets dog = new Dog();
        Pets fish = new Fish();
        cat.voice();
        dog.voice();
        fish.voice();
        System.out.println("Interfaces");
        Pet myCat = new MyCat(); //interface type
        Pet myDog = new MyDog();
        System.out.printf("Cat owned by %s said ",myCat.owner);
        myCat.voice();
        System.out.printf("Dog owned by %s said ",myDog.owner);
        myDog.voice();
    }
}
