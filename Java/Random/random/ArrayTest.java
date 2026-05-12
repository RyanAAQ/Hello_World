import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayTest{

    @Test
    public void testifnumberisthelargest(){    
    int [] numbers = {2, 5, 7, 9, 20};
    int expected = Array.getlargest(numbers);
    assertEquals(expected, numbers);
    }
    
}
