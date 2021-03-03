package Week20.currencyconvertor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyConvertorTest {
    private CurrencyConvertor cc;

    @BeforeEach
    void setUp() {
        cc = new CurrencyConvertor();
    }

    @Test
    void convertEuroToGBP() {
        //take a euro value and convert it to gbp value as double
        //100 euros == £89
        double result = cc.convertEuroToGBP(100);
        assertEquals(89, result);
        assertNotEquals(56, result);
    }

    @Test
    void formatGBP() {
        //100.5 should be £100.50
        String result = cc.formatGBP(100.5);
        assertEquals("£100.50", result);
        assertNotEquals("$100.50", result);
    }
}