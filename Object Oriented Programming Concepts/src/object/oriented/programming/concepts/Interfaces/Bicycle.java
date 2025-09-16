/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object.oriented.programming.concepts.Interfaces;

/**
 *
 * @author Sheeraz
 */
public interface Bicycle {
    
    // Wheel revolutions per minutes
    void changeCadence(int newValue);
    
    void changeGear(int newValue);
    
    void speedUp(int increment);
    
    void applyBrakes(int decrement);
    
}
