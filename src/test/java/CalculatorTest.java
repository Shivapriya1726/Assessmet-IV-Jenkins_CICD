import org.testng.Assert;
import org.testng.annotations.Test;

import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.add(3, 5);
        assert result == 8 : "Addition test failed!";
    }

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(10, 4);
        assert result == 6 : "Subtraction test failed!";
    }

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(2, 6);
        assert result == 12 : "Multiplication test failed!";
    }

    @Test
    public void testDivision() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(10, 2);
        assert result == 5.0 : "Division test failed!";
    }
}

