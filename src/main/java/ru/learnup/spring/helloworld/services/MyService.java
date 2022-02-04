package ru.learnup.spring.helloworld.services;

import ru.learnup.spring.helloworld.services.interfaces.Logger;

import java.util.List;

public class MyService {

    private List<Logger> loggers;

    public void setLoggers(List<Logger> loggers) {
        this.loggers = loggers;
    }

    public void doSmth(){

        for (Logger logger : loggers) {

            logger.print(" поехали");
        }


    }
}

