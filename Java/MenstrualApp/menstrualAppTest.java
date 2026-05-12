import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class menstrualAppTest {

    @Test
    public void testNextPeriodDay() {
    int lastperiod = 10;
    int periodcycle = 28;
    int nextperiod = lastperiod + periodcycle;
    assertEquals(38, nextperiod);
}

    @Test
    public void testOvulationDay() {
    int lastperiod = 10;
    int periodcycle = 28;
    int ovulation = lastperiod + (periodcycle / 2);
    assertEquals(24, ovulation);
    }

    @Test
    public void testFertileWindow() {
    int ovulation = 24;
    int fertilityday = ovulation - 2;
    int fertilitystop = ovulation + 2;
    assertEquals(22, fertilityday);
    assertEquals(26, fertilitystop);
    }
}

