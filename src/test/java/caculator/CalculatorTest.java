package caculator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        Assert.assertEquals(calc.add(2, 3), 5);
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(calc.subtract(5, 3), 2);
    }
}
// This is a test commit to trigger CI
