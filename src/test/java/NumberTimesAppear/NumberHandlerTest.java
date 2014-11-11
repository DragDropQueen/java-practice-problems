package NumberTimesAppear;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by savannah on 11/11/14.
 */
public class NumberHandlerTest {
    @Test
    public void countsTheNumberOfTimesANumberAppearsInAnotherNumber() {
        NumberHandler numberHandler = new NumberHandler();

        assertEquals(numberHandler.count(3, 33453), 3);
        assertEquals(numberHandler.count(5, 24453), 1);
        assertEquals(numberHandler.count(7, 24453), 0);
    }
}
