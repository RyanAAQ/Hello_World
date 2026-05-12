import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class PrimeNumbersTest {
    @Test
    public void testNumberTwo(){
    assertTrue(PrimeNumbers.isPrime(2));
}
    @Test
    public void testNumberSeventeen(){
    assertTrue(PrimeNumbers.isPrime(17));
}
    @Test
    public void testNumberFour(){
    assertFalse(PrimeNumbers.isPrime(4));
}
    @Test
    public void testZero(){
    assertFalse(PrimeNumbers.isPrime(0));
}
    @Test
    public void testNumberOne(){
    assertFalse(PrimeNumbers.isPrime(1));
    }
}

