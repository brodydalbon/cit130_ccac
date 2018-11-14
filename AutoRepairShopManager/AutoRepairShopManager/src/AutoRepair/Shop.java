/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AutoRepair;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author brody.dalbon
 */
public class Shop {
    public static void main (String[] args){
    
        WorkBay bay1 = new WorkBay();
        
        bay1.c = new Car();
        
        bay1.toolList = new LinkedList<>();
        
        Tool a = new Tool("Hand" , "Small", "ScrewDriver", "Husky");
        Tool b = new Tool("Hand", "Small", "CresentWrench", "Husky");
        Tool c = new Tool("Air", "Medium", "ImpactGun", "Snap-On");
        Tool d = new Tool("Hand", "Medium", "BreakerBar", "Snap-On");
        
        bay1.toolList.add(a);
        bay1.toolList.add(b);
        bay1.toolList.add(c);
        bay1.toolList.add(d);

        Iterator<Tool> itr = bay1.toolList.iterator();
        while(itr.hasNext()){
            Tool tool = itr.next();
            System.out.println(tool.toolName);
        }//close while 
        
        
        //begin loading 
       
        
        
        
        
    }//close main   
}//close class
