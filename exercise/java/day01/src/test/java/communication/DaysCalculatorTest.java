package communication;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DaysCalculatorTest {
    @Test
    void partOne() {
        DaysCalculator dc = new DaysCalculator(2,3,1);
        assertEquals(0, dc.daysBeforeReturn());
    }
}
