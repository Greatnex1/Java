package CHP_6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Divisibility {
    Divisible test;
    @BeforeEach
    void up(){
        test = new Divisible();
    }
    @Test
    public void testNumbersDivisibleByFive(){
        boolean  result= test.isDivisible(24);
        assertFalse(result);
    }
}
