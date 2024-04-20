/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;
public class CoockingStaff extends Staff {
    public String[] specialties = new String[10] ;
int nbSpec = 0 ;
public CoockingStaff(int nbSpec,String personN,String personA,long personP,int exprience,double salary)
{
    super(personA,personN,personP,exprience,salary);
}
@Override
public String toString() {
String s = "" ;
 for (int i= 0; i <nbSpec; i++)
        {
            s+=specialties[i];
        }
 return super.toString()+" Coocking Staff{" + " Specialties =" + s;

}
public void addSpeciality(String spec) {
    
        if (nbSpec<10) {
            specialties[nbSpec] = spec;
        nbSpec++;
   }
        System.out.println("on ne peut pas ajouter ");
    }
public boolean haveExperience() {
    if( nbSpec>=nbSpecialties &&exprience>=7)
            return true;
        else
            return false;
}
}

