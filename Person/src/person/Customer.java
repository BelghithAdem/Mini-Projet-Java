/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class Customer extends Person{
    public Date reservation;
    public String preferences;
    public String allergies;
    public Customer(String personN,String personA,long personP,Date reservation,String preferences,String allergies)
    {
        super(personA,personN,personP);
        this.reservation=reservation;
        this.preferences=preferences;
        this.allergies=allergies;
                
    }
    @Override
    public String toString()
    {
        return super.toString()+ "resarvation"+reservation+"preferences"+preferences+"allergies"+allergies;
    }
}
