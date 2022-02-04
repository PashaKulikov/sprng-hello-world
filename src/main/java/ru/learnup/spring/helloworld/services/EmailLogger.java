package ru.learnup.spring.helloworld.services;

import ru.learnup.spring.helloworld.services.interfaces.Logger;

public class EmailLogger implements Logger {
    @Override
    public void print(Object obj){
        System.out.println("Email" + obj);
    }
    @Override
    public void print(String msg) {
        System.out.println("Email" + msg);
    }
}
