package Dog;

import java.util.Scanner;


public class DogDog {
    static Scanner sc = new Scanner (System.in);
   public static void main(String[] args){
       dog cardo = new dog ();
       System.out.println("DOG Lucky");
           System.out.println("\t");
       System.out.println("Name: ");
      String dogName = sc.nextLine(); 
      cardo.setName(dogName);
      String dog1 = cardo.getName();     
 
       System.out.println("Age: ");
       int dogAge = sc.nextInt();
       cardo.setAge(dogAge);
        int age = cardo.getAge();
        
       System.out.println("breed: ");  
       String breed = sc.next();
       cardo.setBreed(breed);
       String dog3 = cardo.getBreed();
       
       System.out.println("gender:");
         String c = sc.next();
         cardo.setGender(c);
         String dog4 = cardo.getGender();
       
       System.out.println("DOG Lucky");
        
       System.out.println("Name:" + dog1);
        System.out.println("Age:" + age);
         System.out.println("Breed:" + dog3);
          System.out.println("Gender:" + dog4);
          System.out.println("\t\t");
          
          
          
          System.out.println("DOG BANTAY");
          System.out.println("\t");
          dog bantay = new dog();
          System.out.println("name: ");
          String dogName1 = sc.next();
          bantay.setName(dogName1);
          String dog2 = bantay.getName();
          
          System.out.println("Age: ");
          int dogAge1 = sc.nextInt();
          bantay.setAge(dogAge1);
          int age1 = bantay.getAge();
          
            System.out.println("breed: ");  
       String breed1 = sc.next();
       bantay.setBreed(breed1);
       String dog5 = bantay.getBreed();
       
       System.out.println("gender:");
         String y = sc.next();
         cardo.setGender(y);
         String dog9 = cardo.getGender();
           System.out.println("DOG Bantay");
        
       System.out.println("Name:" + dog2);
        System.out.println("Age:" + age1);
         System.out.println("Breed:" + dog5);
          System.out.println("Gender:" + dog9);
          
          
       
}
   
}
