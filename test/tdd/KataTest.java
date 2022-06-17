//package tdd;
//
//import org.junit.jupiter.api.Test;
//
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//import static tdd.Kata.noOfFactorsOf;
//
//public class KataTest {
//
//    @Test
//
//    public void additionTest() {
//        Kata calculator = new Kata();
//        int result = calculator.add(2, 6);
//        assertEquals(8, result);
//        assertEquals(66, calculator.add(54, 12));
//    }
//
//    @Test
//    public void substractionTest() {
//        Kata calculator = new Kata();
//        int result = calculator.substract(4, 2);
//        assertEquals(2, result);
//
//    }
//
//    @Test
//    public void subTest() {
//        Kata calculator = new Kata();
//        int o = calculator.substract(2, 4);
//        assertEquals(-2, o);
//
//    }
//
//    @Test
//    public void productTest() {
//        Kata calculator = new Kata();
//        int m = calculator.product(6, 2);
//        assertEquals(12, m);
//    }
//
//    @Test
//    public void quotientTest() {
//        Kata calculator = new Kata();
//        int k = calculator.quotient(10, 0);
//        assertEquals(0, k);
//    }
//
//    @Test
//    public void gradeTest() {
//
//        Kata calculator = new Kata();
//        String grade = calculator.gradeScore(55);
//        assertEquals("F", grade);
//    }
//
//    @Test
//
//    public void numberFactorTest(){
//        int factors = noOfFactorsOf(5);
//        assertEquals(2, factors);
//
//        factors = noOfFactorsOf(10);
//        assertEquals(4, factors);
//
//    }
//    @Test
//    public void primeNumberTest(){
//        boolean isPrime= Kata.isPrime(5);
//        assertTrue(isPrime);
//    }
//}
//
//
//
//
//
//
//
