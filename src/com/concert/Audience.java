package com.concert;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audience {

   /* @Before("execution(* *.performance(..))")
    public void silenceCellPhones() {
        System.out.println("Silencing cell phones");
    }

    @Before("execution(* *.performance(..))")
    public void takeSeats() {
        System.out.println("Taking seats");
    }

    @AfterReturning("execution(* *.performance(..)))")
    public void applause() {
        System.out.println("CLAP CLAP CLAP!!!");
    }

    @AfterThrowing("execution(* *.performance(..))")
    public void demandRefund() {
        System.out.println("Demand a refund");
    }*/

   @Pointcut("execution(* *.performance(..))")
   public void performance(){}

   /* @Before("performance()")
    public void silenceCellPhones() {
        System.out.println("Silencing cell phones");
    }

    @Before("performance()")
    public void takeSeats() {
        System.out.println("Taking seats");
    }

    @AfterReturning("performance()")
    public void applause() {
        System.out.println("CLAP CLAP CLAP!!!");
    }

    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("Demand a refund");
    }*/

   @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint joinPoint) {
       try {
           System.out.println("Silencing cell phones");
           System.out.println("Taking seats");
           joinPoint.proceed();
           System.out.println("CLAP CLAP CLAP CLAP!!!");
       }catch (Throwable e) {
           e.printStackTrace();
       }
   }
}
