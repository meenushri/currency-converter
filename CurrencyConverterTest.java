import org.junit.Test;
import static org.junit.Assert.*;

public class CurrencyConverterTest {

    CurrencyConverter cc = new CurrencyConverter();

    @Test
    public void testInrToUsd() {
        assertEquals(1.0, cc.inrToUsd(83.0), 0.01);
    }

    @Test
    public void testInrToEur() {
        assertEquals(1.0, cc.inrToEur(90.0), 0.01);
    }

    @Test
    public void testUsdToInr() {
        assertEquals(83.0, cc.usdToInr(1.0), 0.01);
    }

    @Test
    public void testEurToInr() {
        assertEquals(90.0, cc.eurToInr(1.0), 0.01);
    }

    @Test
    public void testUsdToEur() {
        assertEquals(0.92, cc.usdToEur(1.0), 0.01);
    }

    @Test
    public void testEurToUsd() {
        assertEquals(1.08, cc.eurToUsd(1.0), 0.01);
    }
}