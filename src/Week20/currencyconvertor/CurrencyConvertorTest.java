package Week20.currencyconvertor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyConvertorTest {
    CurrencyConvertor cc;

    @BeforeEach
    void setUp() {
        cc = new CurrencyConvertor();
    }

    @Test
    void convertEuroToGBP() {
        //100 euro is 89 gbp
        double result = cc.convertEuroToGBP(100);
        assertEquals(result, 89);
        assertNotEquals(result, 56);
    }

    @Test
    void formatGBP() {
        //100.5 should be displayed as £100.50
        String result = cc.formatGBP(100.5);
        assertEquals(result, "£100.50");
        assertNotEquals(result, "£100.5");
    }
}