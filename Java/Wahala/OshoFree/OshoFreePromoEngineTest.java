import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OshoFreePromoEngineTest{

    @Test
    public void testThatTheDiscountIsCorrect(){
        int cartTotal = 12000;
        String promoCode = "STARTER10";
        double expected = 10800.00;
        double actual = OshoFreePromoEngine.getDiscount(cartTotal, promoCode);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testThatTheDiscountIsTwentyPercent(){
        int cartTotal = 18000;
        String promoCode = "BIGBOY20";
        double expected = 14400.00;
        double actual = OshoFreePromoEngine.getDiscount(cartTotal, promoCode);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testThatTheDiscountIsThirtyFivePercent(){
        int cartTotal = 35000;
        String promoCode = "OSHOFREE35";
        double expected = 22750.00;
        double actual = OshoFreePromoEngine.getDiscount(cartTotal, promoCode);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testThatThereIsNoDiscount(){
        int cartTotal = 12000;
        String promoCode = "";
        double expected = 12000.00;
        double actual = OshoFreePromoEngine.getDiscount(cartTotal, promoCode);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testThatThePromoCodeIsWrong(){
        int cartTotal = 12000;
        String promoCode = "NIGGER99";
        double expected = 12000.00;
        double actual = OshoFreePromoEngine.getDiscount(cartTotal, promoCode);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testExactlyFiveThousand(){
        int cartTotal = 5000;
        String promoCode = "STARTER10";
        double expected = 4500.00;
        double actual = OshoFreePromoEngine.getDiscount(cartTotal, promoCode);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testThatItIsExactlyFifteenThousand(){
        int cartTotal = 15000;
        String promoCode = "BIGBOY20";
        double expected = 12000.00;
        double actual = OshoFreePromoEngine.getDiscount(cartTotal, promoCode);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testThatItISExactlyThirtyThousand(){
        int cartTotal = 30000;
        String promoCode = "OSHOFREE35";
        double expected = 19500.00;
        double actual = OshoFreePromoEngine.getDiscount(cartTotal, promoCode);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testThatItIsAmountBelowTheMinimum(){
        int cartTotal = 3000;
        String promoCode = "STARTER10";
        double expected = 3000.00;
        double actual = OshoFreePromoEngine.getDiscount(cartTotal, promoCode);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testThatThePromoCodeIsWrongForCartTotal(){
        int cartTotal = 18000;
        String promoCode = "STARTER10";
        double expected = 18000.00;
        double actual = OshoFreePromoEngine.getDiscount(cartTotal, promoCode);
        assertEquals(expected, actual);
    }
}
