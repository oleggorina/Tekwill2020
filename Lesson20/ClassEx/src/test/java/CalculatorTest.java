import org.junit.*;

public class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    public void multiply() {
        int result = calculator.multiply(2, 5);
        int exResult = 10;
        Assert.assertEquals(exResult, result);
    }
}