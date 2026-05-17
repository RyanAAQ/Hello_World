import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
    //Static methods are called on the class and non static are called on a method
    //A class has two things wshich are attributes and behaviours and attributes are what it has and behaviour is what it can do

        int expectedBalance = 0;
        int actualBalance = myAccount.checkBalance();
        assertEquals(actualBalance, expectedBalance);
    
    }
}

