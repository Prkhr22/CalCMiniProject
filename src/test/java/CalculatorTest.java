import calculator.Calculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void factorialTruePositive(){
        assertEquals("factor of a number for True Positive", 720, calculator.factorial(6), DELTA);
        assertEquals("factorial of a number for True Positive", 6, calculator.factorial(3), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("factorial of a number for False Positive", 120, calculator.factorial(6), DELTA);
        assertNotEquals("factorial of a number for False Positive", 24, calculator.factorial(3), DELTA);
    }

    @Test
    public void powerTruePositive(){
        assertEquals("power for True Positive", 1024, calculator.power(2, 10), DELTA);
        assertEquals("power for True Positive", 64, calculator.power(4, 3), DELTA);
        
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("power for False Positive", 6, calculator.power(2, 10), DELTA);
        assertNotEquals("power for False Positive", -7.3, calculator.power(2, 3), DELTA);
    }

    @Test
    public void logTruePositive(){
        assertEquals("Finding natural log for True Positive", 0, calculator.naturalLog(1), DELTA);
        assertEquals("Finding natural log for True Positive", 0, calculator.naturalLog(1), DELTA);
    }

    @Test
    public void logFalsePositive(){
        assertNotEquals("natural log for False Positive", 6, calculator.naturalLog(2.4), DELTA);
        assertNotEquals("natural log for False Positive", 7.3, calculator.naturalLog(2.1), DELTA);
    }

    @Test
    public void sqrootTruePositive(){
        assertEquals("square root for True Positive", 2, calculator.sqroot(4), DELTA);
        assertEquals("square root for True Positive", 12, calculator.sqroot(144), DELTA);
    }

    @Test
    public void sqrootFalsePositive(){
        assertNotEquals("square root for False Positive", 1, calculator.sqroot(3), DELTA);
        assertNotEquals("square root for False Positive", 0, calculator.sqroot(4), DELTA);
        assertNotEquals("square root for False Positive", 2, calculator.sqroot(9), DELTA);

    }


}
