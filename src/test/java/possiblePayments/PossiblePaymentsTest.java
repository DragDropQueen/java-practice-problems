package possiblePayments;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 * Created by savannah on 11/11/14.
 */
public class PossiblePaymentsTest {
    @Test
    public void CalculatesPossibleTips() {
        PossiblePayments possiblePayments = new PossiblePayments();

        assert possiblePayments.calc(4, 100) == 0;
        assert possiblePayments.calc(23, 100) == 1;
        assert possiblePayments.calc(50, 50) == 0;
        assert possiblePayments.calc(100, 200) == 1;
        assert possiblePayments.calc(100, 0) == 0;
        assert possiblePayments.calc(200, 400) == 2;
        assertEquals(possiblePayments.calc(123456789, 234567890), 1443943);
        assert possiblePayments.calc(123456789, 133456789) == 700455;
        assert possiblePayments.calc(10, 5) == 0;

    }
}
