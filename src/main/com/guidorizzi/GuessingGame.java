package com.guidorizzi;

import java.util.Random;

public class GuessingGame {
    private final int randomNumber = new Random().nextInt(10) + 1 ;
    private int counter = 0;


    public String guess(int guessedNumber) {
        counter++;
        if (counter == 4 && guessedNumber != getRandomNumber()) {
            return "You didn't get it in four tries. Game Over.";
        }
        return guessedNumber == getRandomNumber() ? "You got it" : "You didn't get it";
    }

    public int getRandomNumber(){
        return randomNumber;
    }

}
