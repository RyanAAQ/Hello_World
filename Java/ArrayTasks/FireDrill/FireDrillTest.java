import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FireDrillTest{

    @Test
    public void testThatItReturnsTheReverse(){
    int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    int [] actual = FireDrill.TaskTwo(numbers);
    int [] expected = {0, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    assertArrayEquals(actual, expected);
    
}
    @Test
    public void testThatEvenNumbersAreRemoved() {
    int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    int [] actual = FireDrill.TaskThree(numbers);
    int [] expected = {1, 3, 5, 7, 9}; 
    assertArrayEquals(expected, actual);
}
    
    @Test
    public void testThatOddNumbersAreRemoved() {
    int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    int [] actual = FireDrill.TaskFour(numbers);
    int [] expected = {2, 4, 6, 8, 0}; 
    assertArrayEquals(expected, actual);
}
    
    @Test
    public void testThatItChecksForDuplicates(){
    int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    int [] actual = FireDrill.TaskFive(numbers);
    int [] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    assertArrayEquals(expected, actual);
  
}
    @Test
    public void testThatItChecksTheAscendingOrder(){
    int [] numbers = {1, 5, 4, 6, 7, 8, 2, 3, 0, 9};
    int [] actual = FireDrill.TaskSix(numbers);
    int [] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    assertArrayEquals(expected, actual);
  
}
    
}
