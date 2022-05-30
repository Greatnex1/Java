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

        tested = new RectangleClassMethod();
    }

    @Test
    public void testPerimeter() {
      tested.setLength(10);
      tested.setWidth(10);
      double result = tested.perimeter();
      assertEquals(40, result);
    }

    @Test
    public void testArea(){
        tested.setWidth(12);
        tested.setLength(12);
        double answer = tested.area();
        assertEquals(144, answer);

    }

//
//    @Test
//    void testThatExceptionsIsThrown() {
//        assertThrows(IllegalArgumentException.class, () -> {
//            tested.setLength(144.0);
//        });

    }


