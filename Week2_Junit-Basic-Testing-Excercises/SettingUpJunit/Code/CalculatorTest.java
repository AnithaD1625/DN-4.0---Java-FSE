import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        assertEquals(1, calc.subtract(4, 3));
    }

    @Test
    public void testMultiply() {
        Calculator calc = new Calculator();
        assertEquals(20, calc.multiply(4, 5));
    }

    @Test
    public void testDivide() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.divide(10, 5));
    }

    @Test
    public void testDivideByZero() {
        Calculator calc = new Calculator();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(5, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}
