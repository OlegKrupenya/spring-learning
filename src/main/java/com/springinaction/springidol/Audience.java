package com.springinaction.springidol;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @author oleh.krupenia.
 */
@Aspect
public class Audience {
    @Pointcut(
            "execution(* com.springinaction.springidol.Performer.perform(..))")
    public void performance() {
    }

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint joinpoint){
        try {
            System.out.println("Theaudienceistakingtheirseats.");
            System.out.println("Theaudienceisturningofftheircellphones");
            long start=System.currentTimeMillis();
            joinpoint.proceed();
            long end=System.currentTimeMillis();
            System.out.println("CLAPCLAPCLAPCLAPCLAP");
            System.out.println("Theperformancetook"+(end-start)
                    + "milliseconds.");
        } catch(Throwable t){
            System.out.println("Boo!Wewantourmoneyback!");
        }
    }
}
