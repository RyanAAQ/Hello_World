import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaWahalaTest {
    @Test
    public void checkfornumberofboxes() {
        int guests = 10;
        assertEquals(3, PizzaWahala2.checkfornumberofboxes(4, guests));
    }

    @Test
    public void checkforleftover() {
        int guests = 10;
        int sliceperbox = 4;
        assertEquals(2, PizzaWahala2.checkforleftover(sliceperbox, guests));
    }

    @Test
    public void checkforprice() {
        int guests = 10;
        int sliceperbox = 4;
        int expectedPrice = 7500; // 3 boxes * 2500
        assertEquals(expectedPrice, PizzaWahala2.checkforprice(sliceperbox, guests));
    }
}
