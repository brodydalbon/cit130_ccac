/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AutoRepair;

/**
 *
 * @author brody.dalbon
 */
public class Tool extends WorkBay {
    
    String toolType;
    String toolSize;
    String toolName;
    String manufacture;
    Tool(String t, String s, String n, String m){
        toolType = t;
        toolSize = s;
        toolName = n;
        manufacture = m;
    }
    
}
