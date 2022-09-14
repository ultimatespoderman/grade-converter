/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grade.converter;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Wonarche
 */

 class Grade {
       
       private int number;
       private String letter;
       
       public Grade() {
           number = 0;
           letter = "";
       }
       
       public Grade( int number, String letter){
           
       }
       public void setNumber(int number){
           this.number = number;
       }

public int getNumber(){
    return number;
}
public String getLetter(String letter){
    return letter;
}

   }

public class GradeConverter {

    private static Scanner sc = new Scanner(System.in);
    
     public static int getInt(Scanner sc, String prompt) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                i = sc.nextInt();   
                isValid = true;
            } else {
                System.out.println("Error! Invalid number. Try again.");
            }
            sc.nextLine(); 
        }
        return i;
    }
     
     public static String getString( String prompt, String s1, String s2) {
         System.out.print(prompt);
        String s = sc.next();
        sc.nextLine();
        return s;
     }
      private static String getRequiredString(Scanner sc, String prompt) {
        String s = "";
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            s = sc.nextLine();
            if (s.equals("")) {
//              if (!s.equalsIgnoreCase(s1) && !s.equalsIgnoreCase(s2)) {
                System.out.println("Error! This entry is required. Try again.");
            } else {
                isValid = true;
            }
        }
        return s;
    }
      
      private static String getChoiceString(Scanner sc, String prompt,
            String s1, String s2) {
        String s = "";
        boolean isValid = false;
        while (!isValid) {
            s = getRequiredString(sc, prompt);
            if (!s.equalsIgnoreCase(s1) && !s.equalsIgnoreCase(s2)) {
                System.out.println("Error! Entry must be '" + s1 + "' or '" + s2 + "'. Try again.");
            } else {
                isValid = true;
            }
        }
        return s;
    }
      
    public static void main(String[] args) {
        
        
        //Welcomes the user to the program
         System.out.println("Welcome to the Letter Grade Converter");
          System.out.println();
          
          String gradeLetter = "";
         
//initialize variables and create scanner object named sc
         int gradeTotal = 0;
         Scanner sc = new Scanner(System.in); 
        
         //perform grades until choice isn't equal to "y" or "Y"
           String choice = "y";
          while (choice.equalsIgnoreCase("y")) {
              
           // gets input from user       
            try {
        System.out.print("Enter numerical grade: ");
        gradeTotal = sc.nextInt();
        } catch  (InputMismatchException e) {
            System.out.println("Error! Invalid integer value. Try again.\n");
            sc.nextLine();
            continue;
        }
            
        
          //calculate users input to Grade Letter
           System.out.print("Letter grade: " + gradeLetter);
           if (gradeTotal >= 88 && gradeTotal <= 100) {
               gradeLetter = "A";
           }
           else if (gradeTotal >= 80 && gradeTotal <= 87) {
               gradeLetter = "B";
           }
           else if (gradeTotal >= 67 && gradeTotal <= 79) {
               gradeLetter = "C";
           }
           else if (gradeTotal >= 60 && gradeTotal <= 66) {
               gradeLetter = "D";
           } 
           else  {
               gradeLetter = "F";
           } 
       
           //display Letter Grade
           System.out.println(gradeLetter);
            
           System.out.println();
           //grade letter is reset to blank.
          gradeLetter = "";
          
           //ask user if they want to cotinue inputting grades
          
                 choice = getChoiceString(sc, "Try again? (y/n): ", "y", "n");
            System.out.println();
        
           }
          
           
          
    }
          
    }
    
  
    

