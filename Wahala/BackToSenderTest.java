import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackToSenderTest{

    @Test
    public void belowFifty(){
    assertEquals(9000, BackToSender.calculateriderwage(25));
}
    @Test
    public void exactlyFifty(){
    assertEquals(15000, BackToSender.calculateriderwage(50));
}

    @Test
    public void fiftyToFiftyNine(){
    assertEquals(16000, BackToSender.calculateriderwage(55));
}

    @Test
    public void sixtyToSixtyNine(){
    assertEquals(21250, BackToSender.calculateriderwage(65));
}

    @Test
    public void seventyPlus(){
    assertEquals(45000, BackToSender.calculateriderwage(80));
    }

}

