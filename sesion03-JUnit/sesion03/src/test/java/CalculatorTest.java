import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class CalculatorTest {
    private int a, b;
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();

        a = ThreadLocalRandom.current().nextInt();
        b = ThreadLocalRandom.current().nextInt();
    }

    @org.junit.jupiter.api.Test
    void testAdd() {
        int result = calculator.add(a, b);

        assertEquals( a + b, result, "Resultado incorrecto de la suma");
    }

    @org.junit.jupiter.api.Test
    void testAddThrowsExceptionWhenIsCalledWithInvalidParams() {
        String c = "hello";

        assertThrows(Exception.class, () -> {

            int result = calculator.add(a, b);

            assertEquals( a + b, result, "Resultado incorrecto de la suma");
        });
    }

    @Test
    void testMultiply() {
        int additionResult = calculator.add(a, b);

        assumeTrue(additionResult == a+b);

        int multiplicationResult = calculator.multiply(a, b);

        Assertions.assertEquals(a * b, multiplicationResult, "Resultado incorrecto de la multiplicación");
    }
}