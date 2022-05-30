package tdd;

import ExcerciseThree.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

public class CarTest {
    Car venz;

    @BeforeEach
    void setUp() {
        venz = new Car("volx", 2001, 60.0);
    }
    @Test
    public void testName(){
        venz.setName(" ");
        String has = venz.getName();
        assertNull(null, has);
    }
}
