import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OshoFreePromoEngineTest{

    @Test
    public void testThatTheDiscountIsCorrect(){
    int cartTotal = 12000;
    String promoCode = "STARTER10";
    double actual = 0.10;
    double expected = OshoFreePromoEngine.getDiscount(cartTotal, promoCode);
    assertEquals(actual, expected);    
    }
    
    @Test
    public void testThatThereIsNoDiscount(){
    int cartTotal = 12000;
    String promoCode = "";
    double actual = 0.00;
    double expected = OshoFreePromoEngine.getDiscount(cartTotal, promoCode);
    assertEquals(actual, expected);
    }

}
