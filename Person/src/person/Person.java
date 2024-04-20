/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author ASUS
 */
public class Person {
    protected String personN;
     protected String personA;
      protected long personP;
      public Person(String personN,String personA,long personP)
      {
          this.personA=personA;
          this.personN=personN;
          this.personP=personP;
      }
      public String toString()
      {
          return "person name"+personN+"person adress"+personA+"person phone"+personP;
      }
    

  
    
}
