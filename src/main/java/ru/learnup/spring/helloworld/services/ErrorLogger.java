package ru.learnup.spring.helloworld.services;

import ru.learnup.spring.helloworld.services.interfaces.Logger;

public class ErrorLogger implements Logger {
    @Override
    public void print(Object obj){
        System.err.println(obj);
    }
    @Override
    public void print(String msg) {
        System.err.println(msg);
    }
}
