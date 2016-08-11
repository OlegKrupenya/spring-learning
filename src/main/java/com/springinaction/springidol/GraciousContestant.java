package com.springinaction.springidol;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author oleh.krupenia.
 */
@Aspect
public class GraciousContestant implements Contestant {
    /**
     * <aop:aspect ref="ken">
     <aop:pointcut id="performance"
     expression="execution(* chapter4.Performer.perform(..))" />
     <aop:after pointcut-ref="performance" method="receiveAward"/>
     */
    @Override
    public void receiveAward() {
        System.out.println("receiving the award");
    }

    @Pointcut("execution(* com.springinaction.springidol."
            + "Performer.perform(..)))")
    public void awarding() {

    }
}
