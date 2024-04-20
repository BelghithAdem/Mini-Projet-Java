/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

public class Restaurant {
    public String name, address ;
public long phone ;
  public int nbMax;
    public int nbPers=0;
   Person[] tabPerso = new Person[nbMax];

public Restaurant(String name, String address, long phone, int nbMax){
    this.name=name;
    this.address=address;
    this.phone=phone;
    this.nbMax=nbMax;
 
}
public void addPerson(Person p) {
    
    if( nbPers<nbMax)
    { tabPerso[ nbPers]=p;
     nbPers++;
    }
}
public void displayAllPersons() {
    /*for (int i=0;i<nbpers;i++)
    system.out.println(tabperso[i]);
    */
     for(Person p:tabPerso){
      if(p!=null)
      p.toString();
        }}
public void countStaff() {
    int nbSt=0,nbCls=0,nbCos=0;
    for (int i=0;i<nbPers;i++)
    {
        if(tabPerso[i] instanceof Staff)
            nbSt++;
         if(tabPerso[i] instanceof CleaningStaff)
            nbCls++;
          if(tabPerso[i] instanceof CoockingStaff)
            nbCos++;
    }
    System.out.println("Number of staff ="+nbSt);
        System.out.println("Number of cleaning staff ="+nbCls);
            System.out.println("Number of cooking staff="+nbCos);
    
}
    
  public void getCoockingStaffBySpec (String spec) {
     for(int i=0;i<nbPers;i++){
     if(tabPerso[i] instanceof CoockingStaff 
             && isFound(((CoockingStaff)tabPerso[i]).specialties,spec))
     System.out.println(tabPerso[i]);
    
  
     
     }
  }
  public boolean isFound (String[] specs ,String S)
  { boolean trouve=false;
      for (int i=0;i<specs.length;i++){
          if(specs[i]!=null && specs[i].equalsIgnoreCase(S))
              trouve=true;
      }
      return trouve;
  }
    
}

    
    
    
    

