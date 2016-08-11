package chapter4;

import org.aspectj.lang.JoinPoint;

/**
 * @author oleh.krupenia.
 */
public class Instrmentalist implements Performer {
    @Override
    public void perform() {
        System.out.println("Sining hey hey, hey");
    }
}
