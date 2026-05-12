import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TemperatureConverterTest {

    @Test
    public void testTheFreezingPoint(){
        assertEquals(32.0, TemperatureConverter.celsiusToFahrenheit(0));
    }

    @Test
    public void testTheBoilingPoint(){
        assertEquals(212.0, TemperatureConverter.celsiusToFahrenheit(100));
    }

    @Test
    public void testMinusForty(){
        assertEquals(-40.0, TemperatureConverter.celsiusToFahrenheit(-40));
    }
}

