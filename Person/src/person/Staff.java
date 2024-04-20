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
    public abstract  class Staff extends Person implements isReliable{
    public int exprience;
    public double salary;
    public Staff(String personN,String personA,long personP,int exprience,double salary)
    {
         super(personA,personN,personP);
         this.exprience=exprience;
         this.salary=salary;
    }
     @Override
    public String toString()
    {
        return super.toString()+ "exprience"+exprience+"salary"+salary;
    }
    
}
