package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DrillTest {
    @Test
    public void utmeTest() {
        Drill calculator = new Drill();
        int test = calculator.copy(3, 2000);
        assertEquals(6000, 8000, test);

    }

    @Test
    public void tTest() {
        Drill calculator = new Drill();
        int test = calculator.copy(9, 1800);
        assertEquals(16200, test);

    }

    @Test
    public void uTest() {
        Drill calculator = new Drill();
        int test = calculator.copy(29, 1600);
        assertEquals(46400, test);

    }

    @Test
    public void yTest() {
        Drill calculator = new Drill();
        int test = calculator.copy(49, 1500);
        assertEquals(73500, test);

    }

    @Test
    public void bTest() {
        Drill calculator = new Drill();
        int test = calculator.copy(99, 1300);
        assertEquals(128700, test);

    }

    @Test
    public void rTest() {
        Drill calculator = new Drill();
        int test = calculator.copy(199, 1200);
        assertEquals(238800, test);
    }

    @Test
    public void dTest() {
        Drill calculator = new Drill();
        int test = calculator.copy(499, 1100);
        assertEquals(548900, test);
    }

    @Test
    public void fTest() {
        Drill calculator = new Drill();
        int test = calculator.copy(500, 1000);
        assertEquals(500000, test);

    }
}