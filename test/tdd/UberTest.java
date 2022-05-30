package tdd;

import TestCode.Uber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UberTest {
    Uber work;
    @BeforeEach
    void v (){

        work = new Uber();
    }

    @Test
    public void testUserInputOne(){
        int num = 1;
        work.setUserInput(num);
        int result = work.getUserInput();
        assertEquals(0,result);

//        int p = work.userInput(2)

    }
    @Test
    public void testUserInputTwo(){
        int value = 7;
        work.setUserInputTwo(value);
        String resultone= work.getUserInputTwo();
        System.out.println(resultone);
        assertEquals("Try Again", resultone);
    }

}
