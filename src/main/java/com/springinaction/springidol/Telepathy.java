package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author oleh.krupenia.
 */
public class Telepathy {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "spring-idol.xml");
        Thinker thinker = (Thinker) ctx.getBean("thinker");
        MindReader magician = (MindReader) ctx.getBean("magician");
        thinker.thinkOfSomething("I'm thinking...");
        System.out.println(magician.getThoughts());
    }
}
