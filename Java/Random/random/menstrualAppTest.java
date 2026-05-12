import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class menstrualApptest{
       
    @Test
    public void testTheNextPeriodDate(){
    int lastperioddate = 10;
    int periodcycle = 28;
    int nextperiod = lastperioddate + periodcycle;
    assertEquals(38, nextperiod);
    
    }
}
