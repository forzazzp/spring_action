package com.springaction.knights;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {

    public static void main(String[] args) {
        //通过knight.xml文件获取bean
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("knight.xml");
        //通过java配置文件获取bean
        //ApplicationContext applicationContext = new AnnotationConfigApplicationContext(KnightConfig.class);
        //Knight knight = (Knight) applicationContext.getBean("knight");
        Knight knight = applicationContext.getBean(Knight.class);
        knight.embarkOnQuest();
    }
}
