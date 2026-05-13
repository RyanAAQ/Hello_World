import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OshoFreePromoEngineTest{

    @Test
    public void testThatTheDiscountIsTenPercent(){
        int cartTotal = 12000;
        String promoCode = "STARTER10";
        double actual = 10800.00;
        double expected = OshoFreePromoEngine.getDiscount(cartTotal, promoCode);
        assertEquals(actual, expected);
    }
    
    @Test
    public void testThatTheDiscountIsTwentyPercent(){
        int cartTotal = 18000;
        String promoCode = "BIGBOY20";
        double actual = 14400.00;
        double expected = OshoFreePromoEngine.getDiscount(cartTotal, promoCode);
        assertEquals(actual, expected);
    }
    
    @Test
    public void testThatTheDiscountIsThirtyFivePercent(){
        int cartTotal = 35000;
        String promoCode = "OSHOFREE35";
        double actual = 22750.00;
        double expected = OshoFreePromoEngine.getDiscount(cartTotal, promoCode);
        assertEquals(actual, expected);
    }
    
    @Test
    public void testThatThereIsNoDiscount(){
        int cartTotal = 12000;
        String promoCode = "";
        double actual = 12000.00;
        double expected = OshoFreePromoEngine.getDiscount(cartTotal, promoCode);
        assertEquals(actual, expected);
    }
    
    @Test
    public void testThatThePromoCodeIsWrong(){
        int cartTotal = 12000;
        String promoCode = "actual99";
        double actual = 12000.00;
        double expected = OshoFreePromoEngine.getDiscount(cartTotal, promoCode);
        assertEquals(actual, expected);
    }
    
    @Test
    public void testExactlyFiveThousand(){
        int cartTotal = 5000;
        String promoCode = "STARTER10";
        double actual = 4500.00;
        double expected = OshoFreePromoEngine.getDiscount(cartTotal, promoCode);
        assertEquals(actual, expected);
    }
    
    @Test
    public void testThatItIsExactlyFifteenThousand(){
        int cartTotal = 15000;
        String promoCode = "BIGBOY20";
        double actual = 12000.00;
        double expected = OshoFreePromoEngine.getDiscount(cartTotal, promoCode);
        assertEquals(actual, expected);
    }
    
    @Test
    public void testThatItISExactlyThirtyThousand(){
        int cartTotal = 30000;
        String promoCode = "OSHOFREE35";
        double actual = 19500.00;
        double expected = OshoFreePromoEngine.getDiscount(cartTotal, promoCode);
        assertEquals(actual, expected);
    }
    
    @Test
    public void testThatItIsAmountBelowTheMinimum(){
        int cartTotal = 3000;
        String promoCode = "STARTER10";
        double actual = 3000.00;
        double expected = OshoFreePromoEngine.getDiscount(cartTotal, promoCode);
        assertEquals(actual, expected);
    }
    
    @Test
    public void testThatThePromoCodeIsWrongForCartTotal(){
        int cartTotal = 18000;
        String promoCode = "STARTER10";
        double actual = 18000.00;
        double expected = OshoFreePromoEngine.getDiscount(cartTotal, promoCode);
        assertEquals(actual, expected);
    }
}
