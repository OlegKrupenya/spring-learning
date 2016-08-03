package com.springinaction.knights;

/**
 * @author oleh.krupenia.
 */
public class SlayDragonQuest implements Quest {
    public SlayDragonQuest() {
    }

    @Override
    public void embark() {
        System.out.println("SlayDragonQuest");
    }
}
