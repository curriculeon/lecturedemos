package com.github.perschola;

/**
 * Created by leon on 2/4/2020.
 */
public enum GameMenuDecision {
    GOFISH(() -> new GoFishGame().start()),
    BLACKJACK(()-> new BlackJackGame().start()),
    POKER(()->new PokerGame().start());

    private final Runnable runnable;

    GameMenuDecision(Runnable runnable) {
        this.runnable = runnable;
    }



    public void playGame() {
        runnable.run();
    }
}
