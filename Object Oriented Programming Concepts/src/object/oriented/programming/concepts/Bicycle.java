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
public class Bicycle {
    
    int cadence = 0;
    int speed = 0;
    int gear = 1;
    
    void changeCandence(int newValue) {
    
        cadence = newValue;   
        
    }
    
    void changeGear(int newValue) {
    
        gear = newValue;
    }
    
    void speedUp(int increment) {
    
        speed = speed + increment;
    }
    
    void applyBrakes(int decrement) {
    
        speed = speed - decrement;
        
    }
    
    void printStates() {
    
        System.out.println("cadence:" + cadence +
                " speed: " + gear + " gear: " + gear);
    }
    
    public static void main(String[] args) {

        // Create two different
        // Bicycle objects
        
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();
        
        
        // Invoke methods on
        // Those objects
        
        bike1.changeCandence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();
        
        
        bike2.changeCandence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCandence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);  
        bike2.printStates();
        
        
    }
    
}
