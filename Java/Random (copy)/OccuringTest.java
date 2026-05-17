import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class OccurringTest {
    @Test
    public void testThatGetReoccurringNumbersMethodsOnArrayGivesValidResult() {
        int[] numbers = {1, 2, 2, 2, 3};
        int[] expected = {3};
        int[] actual = Occuring.numberOfTimes(numbers);
        assertArrayEquals(actual, expected);

        int[] numberss = {2, 1, 2, 5, 2, 4};
        int[] expectedTwo = {2};
        int[] actualTwo = Occuring.numberOfTimes(numberss);
        assertArrayEquals(actualTwo, expectedTwo);
    }
}
