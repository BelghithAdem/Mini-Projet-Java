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
public class CleaningStaff extends Staff {
    
    public int age;
    public CleaningStaff(int age,String personN,String personA,long personP,int exprience,double salary)
    {
        super(personA,personN,personP,exprience,salary);
        this.age=age;
               
                
    }
    @Override
    public String toString()
    {
        return super.toString()+ "Cleaning Staff{" + " age =" +age;
    }
    public boolean haveExperience()
    {
        if(age<=maxage && exprience>=5)
            return true;
            return false;
    }
}
