import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingTest{

    @Test
    public void testRyan(){
    assertEquals("Hello, Ryan!", Greeting.greet("Ryan"));
}
    @Test
    public void testNigger(){
    assertEquals("Hello, Nigger!", Greeting.greet("Nigger"));
}
    @Test
    public void testNothing(){
    assertEquals("Hello, !", Greeting.greet(""));
    }
}

