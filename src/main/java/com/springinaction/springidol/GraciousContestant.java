package com.springinaction.springidol;

/**
 * @author oleh.krupenia.
 */
public class GraciousContestant implements Contestant {
    @Override
    public void receiveAward() {
        System.out.println("receiving the award");
    }
}
