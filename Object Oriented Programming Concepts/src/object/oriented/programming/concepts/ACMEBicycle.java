/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object.oriented.programming.concepts;

/**
 *
 * @author Sheeraz
 */
public class ACMEBicycle implements object.oriented.programming.concepts.Interfaces.Bicycle{

    int cadence = 0;
    int speed = 0;
    int gear = 1;
    
    // The compiler will now required that methods
    // changecadence, changeGear, speedUp, and applyBrakes
    // all be implemented. compilation will fail if those
    // methods are missing from this class. 
    
    
    @Override
    public void changeCadence(int newValue) {
        
        cadence = newValue;
    }

    @Override
    public void changeGear(int newValue) {

        gear = newValue;
    }

    @Override
    public void speedUp(int increment) {

        speed = speed - increment;
    }

    @Override
    public void applyBrakes(int decrement) {

        speed = speed - decrement;
    }
    
    void printStates() {
    
        System.out.println("cadence:" + cadence +
                " Speed: " + speed + " gear:" + gear);
    }
    
}
