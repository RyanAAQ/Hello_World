import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumNumberTest{
    
    @Test
    public void testThatItReturnsTheHighestNumber(){
    int expected = MaximumNumber.max(1, 2, 3);
    int actual = 3;
    assertEquals(actual, expected);
    
    expected = MaximumNumber.max(3, 2, 1);
    actual = 3;
    assertEquals(actual, expected);
    
    expected = MaximumNumber.max(2, 2, 2);
    actual = 2;
    assertEquals(actual, expected);
    
    expected = MaximumNumber.max(-1, -2, -3);
    actual = -1;
    assertEquals(actual, expected);
    
    }
}
