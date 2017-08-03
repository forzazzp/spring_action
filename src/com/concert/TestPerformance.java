package com.concert;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestPerformance {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConcertConfig.class);
        Performance performance = applicationContext.getBean(Performance.class);
        performance.performance();
    }
}
