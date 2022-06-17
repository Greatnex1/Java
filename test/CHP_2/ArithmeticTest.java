package CHP_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticTest {
ArithmeticMethod test;
@BeforeEach
    void up(){
    test = new ArithmeticMethod();
}
    @Test
    public  void testSquareArithmetic(){
    int result = test.calculateArithmetic(6);
    assertEquals(36,result);
    }
    @Test
    public void testSquareOneArithmetic(){
    int rest = test.calculateArithmeticSecond(9);
    assertEquals(81,rest);
    }
    @Test
    public void testArithmeticSum(){
    int big = test.calculateArithmeticSum(7, 9 );
    assertEquals(16,big);
    }
    @Test
    public void testArithmeticDifference(){
    int small = test.calculateArithmeticDifference(90, 45);
    assertEquals(45,small);
    }
}
