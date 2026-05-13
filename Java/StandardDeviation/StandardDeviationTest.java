import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StandardDeviationTest{
   
   @Test
   public void testThatTheElementsOfTheArrayIsAdded(){
   int [] numbers = {1, 2, 3, 4, 5};
   int actual = StandardDeviation.add(numbers);
   int expected = 15;
   assertEquals(actual, expected);
   
   }
   
   @Test
   public void testThatTheElementsOfTheArrayIsAddedAndIsWrong(){
   int [] numbers = {1, 2, 3, 4, 5};
   int actual = StandardDeviation.add(numbers);
   int expected = 17;
   assertNotEquals(actual, expected);
   
   }
   
   @Test
   public void testThatTheMeanISCalculated(){
   int [] numbers = {1, 2, 3, 4, 5};
   double actual = StandardDeviation.mean(numbers);
   double expected = 3;
   assertEquals(actual, expected);
   
   }
   
   @Test
   public void testThatMeanCalculatedIsWrong(){
   int [] numbers = {1, 2, 3, 4, 5};
   double actual = StandardDeviation.mean(numbers);
   double expected = 5;
   assertNotEquals(actual, expected);
   
   }
   
   @Test
   public void testThatCalculatedVarianceIsCorrect(){
   int [] numbers = {1, 2, 3, 4, 5};
   double actual = StandardDeviation.variance(numbers);
   double expected = 10;
   assertEquals(actual, expected);
   
   }
    
   @Test
   public void testThatCalculatedVarianceIsWrong(){
   int [] numbers = {1, 2, 3, 4, 5};
   double actual = StandardDeviation.variance(numbers);
   double expected = 12;
   assertNotEquals(actual, expected);
   
   }
   
   @Test
   public void testThatCalculatedStandardDeviationIsCorrect(){
   int [] numbers = {1, 2, 3, 4, 5};
   double actual = StandardDeviation.squaredVariance(numbers);
   double expected = 12;
   assertNotEquals(actual, expected);
   
   }

   @Test
   public void testThatCalculatedStandardDeviationIsWrong(){
   int [] numbers = {1, 2, 3, 4, 5};
   double actual = StandardDeviation.squaredVariance(numbers);
   double expected = 13;
   assertNotEquals(actual, expected);
   
   }


}
