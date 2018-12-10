/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AutoRepair;

import static AutoRepair.Shop.printWorkBayData;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author brody.dalbon
 */
public class Shop {
    public static void main (String[] args){
    
        WorkBay bay1 = new WorkBay();
       
        bay1.c = new Car("Volkswagen", "White", "Hatchback");
        
        bay1.c = new Truck("Toyota", "Baja", "Truck");
        
        
        
        
      
       

        
        bay1.emps = new LinkedList<>();
        
        Employee a1 = new Employee("Brian", "O'connor", false);
        Employee b1 = new Employee("Roman", "Pearce", false);
        Employee c1 = new Employee("Dominic", "Torreto", true);
        Employee d1 = new Employee("Johnny", "Tran", true);
        
        bay1.emps.add(a1);
        bay1.emps.add(b1);
        bay1.emps.add(c1);
        bay1.emps.add(d1);
        
        
        bay1.toolList = new LinkedList<>();
      
                   
        Tool a = new Tool("Hand" , "Small", "ScrewDriver", "Husky");
        Tool b = new Tool("Hand", "Small", "CresentWrench", "Husky");
        Tool c = new Tool("Air", "Medium", "ImpactGun", "Snap-On");
        Tool d = new Tool("Hand", "Medium", "BreakerBar", "Snap-On");
        
            
        bay1.toolList.add(a);
        bay1.toolList.add(b);
        bay1.toolList.add(c);
        bay1.toolList.add(d);

        //while to print out the list of tools
        
        
        //begin loading 
       
        printWorkBayData(bay1);
        
        
    }//close main   
    
    public static void printWorkBayData(WorkBay wb){
        System.out.println("____WORKBAY STATUS_____");
        System.out.println("- Manufacture/Color/Type: ");
        System.out.println(wb.c.carManufacture + ", " +  wb.c.color + " " +  wb.c.type);
        System.out.println(" ");
        System.out.println("___List Of Current Tools___");
        System.out.println(" - Name/Manufacture: ");   
        System.out.println(" ");
        
        
        
        Iterator<Tool> itr = wb.toolList.iterator();
        
        while(itr.hasNext()){
            Tool tool = itr.next();
            System.out.println(tool.toolName + ", " + tool.manufacture);

      
        }//close while toolList
        System.out.println(" ");  
        System.out.println("___List Of Current Employees___");  
        System.out.println("- First/Last/MasterTech: ");
        System.out.println(" ");
        
        Iterator<Employee> itr1 = wb.emps.iterator();
        
        while(itr1.hasNext()){
             Employee emps = itr1.next();
            System.out.println(emps.fName + " " + emps.lName + ", " + emps.masterTech);

       
        }//close while workbay
        
    }//close printWorkBayData
       
            
                    
}//close class shop
