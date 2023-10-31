/** This program display a method with a parameterapolicy for an insurance company  */

public class Policy {  
//fields
   private String policyNumber;
   private String providerName;
   

   //constructors
   /** constructor policy*/
   public Policy()
   {
      policyNumber = "";
      providerName = "";
        }
     /**
     * Constructs a Policy name values.
     * @param pNumber the policy number
  */
   
   public Policy(String pNumber, String pName)
   {
      policyNumber = pNumber;
      providerName = pName;
          
   }
   
   //setters//
    /**
   *@param .pnumber the policy number
      */

   public void setPolicyNumber(String pNumber)
   {
      policyNumber = pNumber;
   }
   
    /**
   *@param .pname the providerName
      */
   public void setProviderName(String pName)
   {
      providerName = pName;
   }
   
        
   //getters//
   /**
     * Gets the policy number.
     * @return the policy number
     */
   public String getPolicyNumber()
   {
      return policyNumber;
   }
   /**
     * @return the provider Name
     */
   public String getProviderName()
   {
      return providerName;
   }
   
         
   //Calculates the Policyholder's BMI
   
      /**
     * Calculates the policyholder's BMI.
     * @return the BMI
     */
   public double getBMI()
   {
      final double CONVFACTOR = 703;
      
      return (weight * CONVFACTOR) / (height * height);
   }
   
   
   //Calculates the Policy's price
   
   /**
      @param BASE_PRICE the  base price of the the provider
      @param ADDITIONAL_FEE_AGE the additional fee of the age over 50 yeaars 
      @param ADDITIONAL_FEE_SMOKING the aditional fee of the smoer
      @param ADDITIONAL_FEE_PER_BMI the additional feee of the Bmi over 35
       
    */
   public double getPrice()
   {
      final double BASE_PRICE = 600;
      final double ADDITIONAL_FEE_AGE = 75;
      final double ADDITIONAL_FEE_SMOKING = 100;
      final double ADDITIONAL_FEE_PER_BMI = 20;
      
      final int AGE_THRESHOLD = 50;
      final int BMI_THRESHOLD = 35;
      
      double price = BASE_PRICE;
      
      if(age > AGE_THRESHOLD) //over 50 years
         price += ADDITIONAL_FEE_AGE; //75
         
      if(smokingStatus.equalsIgnoreCase("smoker")) 
         price += ADDITIONAL_FEE_SMOKING; //100
            
      //call the getBMI method
      if(getBMI() > BMI_THRESHOLD) //BMI over 35
         price += ((getBMI() - BMI_THRESHOLD) * ADDITIONAL_FEE_PER_BMI); //additional BMI fee - 20
         
      return price;
   }
    //The to Stirng method outputs all info
   public String toString()
   {
             return String.format("\nPolicyholder's First Name: " + firstName +
             "\nPolicyholder's Last Name: " + lastName +
             "\nPolicyholder's Age: " + age +
             "\nPolicyholder's Smoking Status (Y/N): " + smokingStatus +
             "\nPolicyholder's Height: %,.1f inches\n" +  
             "Policyholder's Weight: %,.1f pounds\n" + 
             "Policyholder's BMI: %,.2f\n" +
             "Policy Price: $%,.2f\n\n", height, weight, getBMI(), getPrice());
             
        
          
                         
   }

}