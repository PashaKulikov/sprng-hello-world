package ru.learnup.spring.helloworld.services;

public class MyService {

    private MyLogger logger;


    public MyService(MyLogger logger) {
        this.logger = logger;
    }

    public void doWork(){
        logger.log("service starts");

        System.out.println("поехали");

        logger.log("service finished");

    }
}

