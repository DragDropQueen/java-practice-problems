package dna;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by savannah on 11/11/14.
 */
public class CalculatorTest {
    @Test
    public void CalculatesPercentageofGandCinADnaString() {
        Calculator calculator = new Calculator();

        assertEquals(1, calculator.calc("gc"), 0.00009);

        assertEquals(0.25, calculator.calc("acgaaatt"), 0.00009);

        assertEquals(0.00, calculator.calc("attaaatt"), 0.00009);

        assertEquals(0.5, calculator.calc("ctga"), 0.00009);
    }

}
