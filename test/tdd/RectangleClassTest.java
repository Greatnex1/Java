package tdd;

import CHP_8.RectangleClassMethod;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleClassTest {
    RectangleClassMethod tested;

    @BeforeEach
    void setUp() {

        tested = new RectangleClassMethod(2,5);
    }

    @Test
    public void testPerimeter() {
      double result = tested.perimeter();
      assertEquals(14, result);
    }

    @Test
    public void testArea(){
        double answer = tested.area();
        assertEquals(10, answer);

    }

//
//    @Test
//    void testThatExceptionsIsThrown() {
//        assertThrows(IllegalArgumentException.class, () -> {
//            tested.setLength(144.0);
//        });

    }


