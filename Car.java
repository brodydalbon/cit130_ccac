/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tank;

/**
 *
 * @author brody.dalbon
 */
public class Car extends Vehicle implements Securable{
    public int numofDoors;
    public int currentGear;
    public double totalMiles;


Car(int numDoors, int ms, int year, String ftype){
    super(ms, year, ftype);
    
    numofDoors = numDoors;
    
    
    
    
}
    public void armSystem(){
    
    }
    public void disarmSystem(int passcode){
    
    }   
    public void triggerAlarm(){
    
    }
    public void cancelAlarm(int passcode){
    
    
    }
}
