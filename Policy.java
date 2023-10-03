/** This program display a method with a parameterapolicy for an insurance company  */

public class Policy {  
//fields
   private String policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;

   //constructors
   /** constructor policy*/
   public Policy()
   {
      policyNumber = "";
      providerName = "";
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatus = "";
      height = 0;
      weight = 0;
   }
     /**
     * Constructs a Policy name values.
     * @param pNumber the policy number
     * @param pName the provider name
     * @param fName the first name
     * @param lName the last name
     * @param a the age
     * @param sStatus the smoking status
     * @param h the height
     * @param w the weight
     */
   
   public Policy(String pNumber, String pName, String fName, String lName,int a, String sStatus, double h, double w)
   {
      policyNumber = pNumber;
      providerName = pName;
      firstName = fName;
      lastName = lName;
      age = a;
      smokingStatus = sStatus;
      height = h;
      weight = w;
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
   
     /**
   *@param .fname the firstName
      */
   public void setFirstName(String fName)
   {
      firstName = fName;
   }
     /**
   *@param .lname the lastrName
      */
   public void setLastName(String lName)
   {
      lastName = lName;
   }
     /**
   *@param a the age      */
   public void setAge(int a)
   {
      age = a;
   }
     /**
   *@param .sStatus the smokingStatus      */
   public void setSmokingStatus(String sStatus)
   {
      smokingStatus = sStatus;
   }
      /**
   *@param h the height      */
   public void setHeight(double h)
   {
      height = h;
   }
    /**
   *@param w the weight      */
   public void setWeight(double w)
   {
      weight = w;
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
   /**
     * @return the provider first Name
     */
   public String getFirstName()
   {
      return firstName;
   }
   /**
     * @return the provider last Name
     */
   public String getLastName()
   {
      return lastName;
   }
   /**
     * @return the provider age
     */
   public int getAge()
   {
      return age;
   }
   /**
     * @return the provider smokung status
     */
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   /**
     * @return the provider height     */
   public double getHeight()
   {
      return height;
   }
   /**
     * @return the provider weight
     */
   public double getWeight()
   {
      return weight;
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
   

}