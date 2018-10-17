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
public class Vehicle {
    public int speed;
    public int max_speed;
    public int yearOfOrigin;
    public String fuelType;
    
    Vehicle(int ms, int year, String ftype){
        max_speed = ms;
        yearOfOrigin = year;
        fuelType = ftype;
    }
            
    
}
