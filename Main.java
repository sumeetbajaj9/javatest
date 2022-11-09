
class HelloWorld {
    public static void main(String[] args) {
        // if (/* Get the value of Bank fees from xpath and check if not equal to 0*/)
        String[] bankFees=new String[] {"Lender Fees", "2nd Bank Fees", "3rd bank fees"};
        
        for(int i = 0; i< bankFees.Length;i++)
        {
            // call the negotiate fees method yahape
            // if check condition the value from the xpath which we wrote is not 0 for any of the fees then we will click on negotiate and then the below method will be called
            // negotiateFee(bankFees[i]) -- bankFees[i] will be the fee name 
        }
        
        // Same logic will go for Government fees as well 
        // String[] bankFees=new String[] {"gov Fees", "2nd gov Fees", "3rd gov fees", ........ , "18th gov fees"};
        
    
        
        System.out.println("Hello, World!");
    }
}
