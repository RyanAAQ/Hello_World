public class AccountTest{


    @Test
    public void testThatIhaveAccountICheckBalanceIsZero(){
    
    //Given
    Account myAccount = new Account();
    
    //Creating a new object of class Account
    //The class Account has not been created
    //This test Should fail
    
    //Class is a bluePrint(Architectural Drawing)
    // object can be the houses that come out of that drawing
    
        int expectedBalance = 0;
        int actualBalance = myAccount.checkBalance();
    
    }
