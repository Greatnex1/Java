package tdd;

import CHP_7.TicTacToe;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicTacToeSpec {
    TicTacToe game;
    @BeforeEach
    void good(){
        game = new TicTacToe();
    }

        @Test
        public void checkWinnerTest (){
        String go = "XXX";
       game. setCheckWinner (go);
 String call = game.getCheckWinner();
 assertEquals("XXX", call);


    }


    }

