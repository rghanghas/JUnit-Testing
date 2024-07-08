package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleCalculatorTest {

    SimpleCalculator calculator = new SimpleCalculator();

    @Test
    public void twoPlusTwoEqualsFour() 
    {
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void threePlusSevenEqualsTen() 
    {
        assertNotEquals(11, calculator.add(3, 7));
    }

    @Test
    public void fourPlusEightEqualsTwelve() 
    {
        assertTrue(calculator.add(4, 8) == 12);
    }

}
