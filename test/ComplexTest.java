import demo.parallel.Complex;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @Test
    void testMinus() {
        Complex c1 = new Complex(4, 3);
        Complex c2 = new Complex(2, 1);
        Complex result = c1.minus(c2);

        assertEquals(2, result.getRe(), "Real part should be 2");
        assertEquals(2, result.getIm(), "Imaginary part should be 2");
    }

    @Test
    void testMinusWithNegativeResult() {
        Complex c1 = new Complex(2, 1);
        Complex c2 = new Complex(4, 3);
        Complex result = c1.minus(c2);

        assertEquals(-2, result.getRe(), "Real part should be -2");
        assertEquals(-2, result.getIm(), "Imaginary part should be -2");
    }

    @Test
    void testPow() {
        Complex c = new Complex(1, 1);
        Complex result = c.pow(2);

        assertEquals(0, result.getRe(), "Real part should be 0");
        assertEquals(2, result.getIm(), "Imaginary part should be 2");
    }

    @Test
    void testPowZeroExponent() {
        Complex c = new Complex(2, 3);
        Complex result = c.pow(0);

        assertEquals(1, result.getRe(), "Real part should be 1");
        assertEquals(0, result.getIm(), "Imaginary part should be 0");
    }

}