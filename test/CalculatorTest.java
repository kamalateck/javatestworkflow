import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();

        assertEquals(5, calculator.add(2, 3));
    }


    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();

        assertEquals(6, calculator.multiply(2, 3));
    }
}