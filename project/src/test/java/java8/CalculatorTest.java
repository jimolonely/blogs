package java8;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jimo on 18-7-10.
 */
public class CalculatorTest {
    @Test
    public void test() throws Exception {
        //lambda:  final Calculator calculator = (a, b) -> a - b
        final Calculator calculator = new Calculator() {

            @Override
            public int minus(int a, int b) {
                return a - b;
            }
        };

        assertEquals(3, calculator.add(2, 1));
        assertEquals(1, calculator.minus(2, 1));
    }

}