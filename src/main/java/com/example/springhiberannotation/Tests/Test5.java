package com.example.springhiberannotation.Tests;

import com.example.springhiberannotation.MainClasses.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.say();
        context.close();
    }
}
