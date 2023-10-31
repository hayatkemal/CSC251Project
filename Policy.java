/** This program display a method with a parameterapolicy for an insurance company  */

public class Policy {  
//fields
   private static int policyCount = 0;
   private String policyNumber;
   private String providerName;
   private PolicyHolder holder;
   

   //constructors
   /** constructor policy*/
   public Policy()
   {
      policyNumber = "";
      providerName = "";
      PolicyHolder holder;
        }
     /**
     * Constructs a Policy name values.
     * @param pNumber the policy number
  */
   
   public Policy(String pNumber, String pName)
   {
      policyNumber = pNumber;
      providerName = pName;
      holder = new PolicyHolder(holder) ;
      policyCount++;
          
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
   
     public static int getPolicyCount() {
        return policyCount;
    } 
     //gets a deep copy of a PolicyHolder 
     
        public PolicyHolder getPolicyHolder()
   {
      return new PolicyHolder(holder);
   }
  
      //The to Stirng method outputs all info
   public String toString()
   {
             return String.format("\npolicyNumber's : " + policyNumber +
             "\nproviderName's : " + providerName + holder);
                        }  

}