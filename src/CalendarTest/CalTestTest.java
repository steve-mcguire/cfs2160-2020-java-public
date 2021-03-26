package CalendarTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

class CalTestTest {
    CalTest ct;

    @BeforeEach
    void setUp() {
        ct = new CalTest();
    }

    @Test
    void dateExpiryChecker() throws Exception {
        assertTrue(ct.DateExpiryChecker("0421"));
    }
}