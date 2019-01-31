/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentinform;

/**
 *
 * @author admin
 */
public class StudentInform {
 
    private String IDNumber;
    private String Name;
    private String AcademicProgram;
   
        String college;
        String university;
        String term;
   
    
   StudentInform(String college, String term){
       this.university = "University of the Cordilleras the house of Igorots";
       this.college = college;
       this.term = term;
   }
   public void setID(String ID) { 
        IDNumber = ID; 
    }
    public String getID() { 
        return IDNumber;
    }
    public void setName(String FName) { 
        Name = FName; 
    }
    public String getFName() { 
        return Name; 
    }
    public void setAcademicProgram(String AcadProg) { 
        AcademicProgram = AcadProg;
    }
    public String getAcademicProgram() { 
        return AcademicProgram;
    }
    
   public void print(){
    System.out.println("_____________________________");
    System.out.println("_____________________________");
    System.out.println(university);
    System.out.println(college);
    System.out.println(term);
    System.out.println();
    System.out.println("       Student Info");
    System.out.println();
    System.out.println("ID Number: " + getID());
    System.out.println("Name: " + getFName());
    System.out.println("Academic Program: "+ getAcademicProgram());
    }
   }

