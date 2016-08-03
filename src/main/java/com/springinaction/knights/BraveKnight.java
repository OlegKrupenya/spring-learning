package com.springinaction.knights;

/**
 * @author oleh.krupenia.
 */
public class BraveKnight implements Knight {
    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() throws QuestException {
        quest.embark();
    }
}