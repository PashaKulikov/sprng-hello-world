package ru.learnup.spring.helloworld.services;

import ru.learnup.spring.helloworld.services.interfaces.Logger;

import java.util.List;

public class MyService {

    private List<Logger> loggers;




    public void doSmth(){

        loggers.get(0).print("service starts");

        System.out.println("поехали");

        loggers.get(1).print("service finished");

    }
}

