import org.junit.Test;
import org.junit.Assert.assertEquals;

public class TaskFourTest{
    public static void main(String... args){
}
    @Test
    public static void testThatItReturnsEvenNumbers(){
    int [] actual = TaskFour.getEvenNumbers();
    int [] expected = {2, 4, 6, 8, 10};
    assertEquals(actual, expected);
    
    }
}
