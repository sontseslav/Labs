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
public class PickUp implements CargoAuto, PassangerAuto{
    @Override
    public void onBoardCargo(){
        System.out.println("Transporting cargo");
    }
    
    @Override
    public void onBoardPassangers(){
        System.out.println("Transporting peoples");
    }
}

class PickUpRunner{
    public static void main(String[] args) {
        PickUp pickup = new PickUp();
        pickup.onBoardCargo();
        pickup.onBoardPassangers();
    }
}
