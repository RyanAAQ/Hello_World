import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class EvenNumbersTest{
    @Test
    public void testEven(){
        assertTrue(EvenNumbers.isEven(4));
        assertTrue(EvenNumbers.isEven(0));
        assertTrue(EvenNumbers.isEven(-2));
    }
    @Test
    public void testOdd(){
        assertFalse(EvenNumbers.isEven(7));
    }
}

