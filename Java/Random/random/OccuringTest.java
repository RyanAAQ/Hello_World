import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OccuringTest{
    public void test_if_it_returns_the_count(){
    int [] numbers = {1, 2, 2, 2, 3};
    int actual = numberOfTimes(numbers);
    int expected = 3;
    assertEquals(actual, expected);
    
    }




}
