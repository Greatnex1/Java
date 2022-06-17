package TestCode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
            Assertions.assertEquals(0,result);

            //        int p = work.userInput(2)

        }
        @Test
        public void testUserInputTwo(){
            int value = 7;
            work.setUserInputTwo(value);
            String resultone= work.getUserInputTwo();
            System.out.println(resultone);
            Assertions.assertEquals("Try Again", resultone);
        }

    }
