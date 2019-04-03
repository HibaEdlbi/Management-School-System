
package schoolmanagementsystem;

import java.io.File;
import java.io.IOException;


public abstract class person {
    public int ID;
    public String FirstName;
    public String LastName;
    public String DadName;
    public String Gender;
    public int ConectNumber;

    public abstract int getID() ;
        
    

    public abstract void setID(int ID);
     

    public abstract String getFirstName();
    

    public abstract void setFirstName(String FirstName) ;
     

    public abstract String getLastName();

    public abstract void setLastName(String LastName); 
     

    public abstract String getDadName(); 
     

    public abstract void setDadName(String DadName); 
     

    public abstract String getGender(); 
     

    public abstract void setGender(String Gender); 
     

    public abstract int getConectNumber(); 
     

    public abstract void setConectNumber(int ConectNumber);
     

    public person(int ID, String FirstName, String LastName, String DadName, String Gender, int ConectNumber) {
        this.ID = ID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.DadName = DadName;
        this.Gender = Gender;
        this.ConectNumber = ConectNumber;
    }

    public person() {
    }
    
    public abstract void Add();
    
   public abstract void findFile(String name,File file);
    
    public abstract void deleteFile();
    
     public abstract void ShowAll();
    
    
}
