import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;


public class Project_hayat_kemal{   
   public static void main(String[] args)
   {      
      
      try 
      {
         /*Create an instance of the File class. Pass the string "tuition.txt" to the constructor. 
         This process creates a File object that represents the file tuition.txt.*/
         File policyfile = new File("PolicyInformation.txt");
         
          /* create scanner object*/
          
      Scanner inputFile = new Scanner(policyfile);
         //declare the variables
        
      
         //Create an array list to store objects. The ArrayList will hold Course objects.
         ArrayList<Policy> policy = new ArrayList<>();
      
         /* Use a while loop to read the file. Use the hasNext() method to determine whether 
            the file has more data to be read. Use an "if statement" to determine the end of the file and 
            to consume newline characters */
      
         while(inputFile.hasNext())       
         { //open loop
         
         
            String  policyNumber = inputFile.nextLine();//read the next line of the file as a String and assign the input to the variable
            String providerName = inputFile.nextLine();//read the next line of the file as a String and assign the input to the variable
            String firstName = inputFile.nextLine();//read the next line of the file as a String and assign the input to the rvariable
            String lastName = inputFile.nextLine();//read the next line of the file as a String and assign the input to the variable
            int age = Integer.parseInt(inputFile.nextLine());//convert the input into a double and assign to the  variable
            String smokingStatus = inputFile.nextLine();//read the next line of the file as a String and assign the input to the variable                        
            double height = Double.parseDouble(inputFile.nextLine());//convert the input into a double and assign to the variable
            double weight = Double.parseDouble(inputFile.nextLine());
            
            
             Policy p = new Policy(policyNumber, providerName,firstName, lastName, age, smokingStatus,height, weight);
             policy.add(p);
         
            if(inputFile.hasNext())
            { 
               inputFile.nextLine();//skip the blank line if we have not reached the end of the file
            }
          
          
          
          
         } //close loop
      
         inputFile.close();//close the file 
               
         //use a for loop to display the output
         for(int i =0; i < policy.size(); i++) {
         
          
      //display information about the Policy
      System.out.println("Policy Number: " + policy.get(i).getPolicyNumber());
      System.out.println("Provider Name: " + policy.get(i).getProviderName());
      System.out.println("Policyholder's First Name: " + policy.get(i).getFirstName());
      System.out.println("Policyholder's Last Name: " + policy.get(i).getLastName());
      System.out.println("Policyholder's Age: " + policy.get(i).getAge());
      System.out.println("Policyholder's Smoking Status: " + policy.get(i).getSmokingStatus());
      System.out.println("Policyholder's Height: " + policy.get(i).getHeight() + " inches");
      System.out.println("Policyholder's Weight: " + policy.get(i).getWeight() + " pounds");
      System.out.printf("Policyholder's BMI: %.2f\n", policy.get(i).getBMI());
      System.out.printf("Policy Price: $%.2f\n", policy.get(i).getPrice());
         
         }
      
      
   
           //put a blank line before the output
      System.out.println();
     
      }
      catch(IOException ex)//If something goes wrong, an IOException is "thrown" to us, and we "catch" it and deal with it
      {
         //use the getMessage method of the exception we "caught" to print out it's message about what went wrong
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }  
      
      
      
   }
}