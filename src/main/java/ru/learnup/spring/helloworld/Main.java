package ru.learnup.spring.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.learnup.spring.helloworld.services.MyService;

public class Main {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("myConfig.xml");

       ctx.getBean(MyService.class).doSmth();
    }
}
