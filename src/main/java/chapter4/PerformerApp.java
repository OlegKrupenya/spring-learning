package chapter4;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author oleh.krupenia.
 */
public class PerformerApp {
    public static void main(String[] args) {
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("spring-idol2.xml");

        Performer p1 = (Performer) context.getBean("ken");
        p1.perform();

        ((Contestant) p1).receiveAward();
    }
}
