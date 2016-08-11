package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author oleh.krupenia.
 */
public class PerformerMain {
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "spring-idol.xml");
        Performer performer = (Performer) ctx.getBean("poeticDuke");
        performer.perform();
        ((Contestant) performer).receiveAward();
        System.out.println(ctx.getBean("theStage"));
    }
}
