import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackToSenderTest{

    @Test
    public void belowfifty(){
    assertEquals(9000, BackToSender.calculateriderpay(25));
}

    @Test
    public void fiftytofiftynine(){
    assertEquals(16000, BackToSender.calculateriderpay(55));
}

    @Test
    public void sixtytosixtynine(){
    assertEquals(21250, BackToSender.calculateriderpay(65));
}

    @Test
    public void seventyplus(){
    assertEquals(45000, BackToSender.calculateriderpay(80));
    }

}

