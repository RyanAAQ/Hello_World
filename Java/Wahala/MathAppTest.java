import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathAppTest{

    MathApp mathApp = new MathApp();

    @Test
        public void testThatTheNumberIsAdded(){
        double numberOne = 5;
        double numberTwo = 5;
        
        double actual = mathApp.add(numberOne, numberTwo);
        double expected = 10;
        assertEquals(actual, expected);
        }
        
    @Test
        public void testThatTheNumberIsSubtracted(){
        double numberOne = 10;
        double numberTwo = 5;
        
        double actual = MathApp.subtract(numberOne, numberTwo);
        double expected = 5;
        assertEquals(actual, expected);
        }
        
    @Test
        public void testThatTheNumberIsMultiplied(){
        double numberOne = 10;
        double numberTwo = 5;
        
        double actual = MathApp.multiply(numberOne, numberTwo);
        double expected = 50;
        assertEquals(actual, expected);
        }
        
    @Test
        public void testThatTheNumberIsDivided(){
        double numberOne = 10;
        double numberTwo = 5;
        
        double actual = MathApp.divide(numberOne, numberTwo);
        double expected = 2;
        assertEquals(actual, expected);
        }   
        
    @Test
        public void testThatErrorIsThrownWhenSecondNumberIsZero(){
        double numberOne = 10;
        double numberTwo = 0;
        assertThrows(IllegalArgumentException.class, ()-> MathApp.divide(numberOne, numberTwo));
        }   
        
        
    @Test
        public void testThatTheOperatorIsWorking(){
        double numberOne = 10;
        double numberTwo = 5;
        char operator = '+';
        
        double actual = mathApp.getOperator(operator);
        double expected = 15;
        assertEquals(actual, expected);
        
        numberOne = 10;
        numberTwo = 5;
        operator = '-';
        
        actual = mathApp.getOperator(operator);
        expected = 5;
        assertEquals(actual, expected);
        
        numberOne = 10;
        numberTwo = 5;
        operator = '*';
        
        actual = mathApp.getOperator(operator);
        expected = 50;
        assertEquals(actual, expected);
  
        numberOne = 10;
        numberTwo = 5;
        operator = '/';
        
        actual = mathApp.getOperator(operator);
        expected = 2;
        assertEquals(actual, expected);
        
        numberOne = 10;
        numberTwo = 5;
        
        actual = mathApp.getOperator(operator);
        assertThrows(IllegalArgumentException.class, ()-> mathApp.getOperator('#'));
        }           
        
}
