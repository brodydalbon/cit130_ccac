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
public class Tank extends Vehicle implements Securable {
    String weapon;
    String engineType;
    
    Tank(String wea, int ms, int year, String ftype){
            super(ms, year, ftype);
            weapon = wea;
            
            
    }
    
    public void armSystem(){
        System.out.println("Tank system is armed");
    }
    public void disarmSystem(int passcode){
        System.out.println(passcode==1234);
                
                
    }   
    public void triggerAlarm(){
        System.out.println("HAHAHAH");
            
    
    }
    public void cancelAlarm(int passcode){
        System.out.println(passcode == 5678);
    
    }
    
}
    

