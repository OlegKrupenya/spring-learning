package com.springinaction.springidol;

import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author oleh.krupenia.
 */
@Qualifier("stringed")
public class SomeSonet implements Poem {
    @Override
    public void recite() {
        System.out.println("ok");
    }
}
