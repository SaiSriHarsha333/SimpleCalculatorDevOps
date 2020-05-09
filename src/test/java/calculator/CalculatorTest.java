
package calculator;

// import static org.junit.Assert.assertTrue;

import org.junit.*;

/**
 * Unit test for simple App.
 */
public class CalculatorTest
{
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        double a = 15;
        double b = 20;
        double expectedResult = 35;
        double result = calculator.add(a, b);
        Assert.assertEquals(expectedResult, result, 0.0);;
    }

    @Test
    public void testSubtract() {
        double a = 25;
        double b = 20;
        double expectedResult = 5;
        double result = calculator.subtract(a, b);
        Assert.assertEquals(expectedResult, result, 0.0);;
    }

    @Test
    public void testMultiply() {
        double a = 10;
        double b = 25;
        double expectedResult = 250;
        double result = calculator.multiply(a, b);
        Assert.assertEquals(expectedResult, result, 0.0);;
    }

    // @Test
    // public void testDivide() {
    //     int a = 56;
    //     int b = 10;
    //     double expectedResult = 5.6;
    //     double result = calculator.divide(a, b);
    //     Assert.assertEquals(expectedResult, result,0.00005);
    // }

    // @Test(expected = IllegalArgumentException.class)
    // public void testDivideByZero() {
    //     int a = 15;
    //     int b = 0;
    //     calculator.divide(a, b);
    // }
}
