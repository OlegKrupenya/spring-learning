package com.springinaction.springidol;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author oleh.krupenia.
 */
public class Audience {
    public void takeSeats(){
        System.out.println("The audience is taking their seats.");
    }
    public void turnOffCellPhones(){
        System.out.println("The audience is turning off their cell phones");
    }
    public void applaud(){
        System.out.println("CLAP CLAP CLAP CLAP CLAP");
    }
    public void demandRefund(){
        System.out.println("Boo! We want our money back!");
    }
}