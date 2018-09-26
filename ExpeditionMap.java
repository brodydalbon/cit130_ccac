/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expedition;
import java.util.*;
/**
 *
 * @author brody.dalbon
 */
public class ExpeditionMap {
    public static void main(String[] args){
        Map<String, String> expeditionMap = new HashMap<>();
        
        expeditionMap.put("Danger Risk", "Low");
        expeditionMap.put("Duration", "2 Days");
        expeditionMap.put("Objective", "Measure distance between stones");
        expeditionMap.put("Location Name", "Stonehenge");
        
        Set<String> firstSet = expeditionMap.keySet();
        
        Iterator<String> it = firstSet.iterator();
        
            while(it.hasNext()){
                String S = it.next();
        System.out.print(expeditionMap.get(S)+ " ");
        System.out.println(S);
         
    }
        
        
        
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
        
        
        
        
        
    
    }//close main
}//close class
