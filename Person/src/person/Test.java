/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;
import java.util.Date;
public class Test {
    public static void main(String[] args) {
      Restaurant r = new Restaurant("hamza", "bizerte", 233372526, 10);
      Customer c = new Customer("ahmed", "tunis", 22545485,new Date(), "prefenrecs", "allergies");
      CoockingStaff ck= new CoockingStaff(5, "ala", "mahdia", 23372526, 5,200.5 );
      CleaningStaff cl= new CleaningStaff(5, "ayoub", "beja",22545464, 10, 100.5);
      r.addPerson(c);
      r.addPerson(ck);
      r.addPerson(cl);
      r.displayAllPersons();
      System.out.println("Rechcerche CoockingStaffBySpec:");
      System.out.println("=============================");
      r.getCoockingStaffBySpec("pizza");
         
      
      
    
}
    }