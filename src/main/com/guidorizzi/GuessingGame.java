package com.guidorizzi;

public class GuessingGame {

    public String guess(int guessedNumber) {
        return guessedNumber >= 0 ? "You got it" : "You didn't get it";
    }

    public int getRandomNumber(){
        return 0;
    }

}
