package ch2.unitTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class Calculator2Test {
    @Test
    void addtest() {
        Calculator2 calc = new Calculator2();

        //test data and expected results
        int a = 5, b = 7;
        int expected = 12;

        //actual results
        int actual = calc.add(5, 7);

        assertEquals(expected, actual);
    }

    @Test
    void multest() {
        Calculator2 calc = new Calculator2();

        //test data and expected results
        int a = 5, b = 7;
        int expected = 35;

        //actual results
        int actual = calc.mul(5, 7);

        assertEquals(expected, actual);


    }
}
