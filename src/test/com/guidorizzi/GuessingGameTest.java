package com.guidorizzi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessingGameTest {

    private GuessingGame game;

    @BeforeEach
    void setUp() {
        game = new GuessingGame();
    }


    @Test
    public void testSimpleWinSituation(){
        int randomNum = game.getRandomNumber();
        String message = game.guess(randomNum);
        assertEquals("You got it", message);
    }

    @Test
    public void testOneWrongNegGuessSituation(){
        String message = game.guess(-5);
        assertEquals("You didn't get it", message);
    }

    @Test
    public void testOneWrongPosGuessSituation(){
        int randomNum = game.getRandomNumber();
        String message = game.guess(randomNum + 1);
        assertEquals("You didn't get it", message);
    }

    @Test
    public void testRandomNumberGeneration(){
        // 1 2 3 4 5 6 7 8 9 10 = options
        // 1 1 1 1 0 1 0 1 1 1  = nums appeared
        int[] rndNumCount = new int[11];
        for(int counter=0; counter<10; counter++) {
            GuessingGame game = new GuessingGame();
            int randomNum = game.getRandomNumber();
            rndNumCount[randomNum] = 1;
        }

        int sum = 0;
        for (int counter=0; counter<11; counter++){
            sum = sum + rndNumCount[counter];

        }
        System.out.println(sum);
        assertEquals(10, sum);
    }
}
