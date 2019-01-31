/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentinform;

/**
 *
 * @author admin
 */
public class StudentAcc {
    public static void main(String[] args) { 
         StudentInform s1 = new StudentInform("CITCS", "2nd Term 2018-2019"); 
         s1.setID("18-1063-297");  
         s1.setName("Wacangan, Kleiser H.");  
         s1.setAcademicProgram("BSIT-WEB TRACK");  
         s1.print(); 
         StudentInform s2 = new StudentInform("CITCS", "2nd Term 2018-2019"); 
         s2.setID("18-0466-448"); 
         s2.setName("Martin, Carlo S.");  
         s2.setAcademicProgram("BSIT-Net Sec");
         //you can user public fields outside the class
         s2.college = "COA";
         s2.print();
         //print out the id number of s2 object
         //we use our accessors/getters to retrieve values 
         System.out.print(s2.getID());
     } 

}
