package com.example.springhiberannotation.Tests;


import com.example.springhiberannotation.MainClasses.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Dog myDog = context.getBean("dog", Dog.class);
//        Dog yourDog = context.getBean("dog", Dog.class);
//        System.out.println("Перменные ссылаются на один и тот же объект? "+(myDog==yourDog));
//        System.out.println(myDog);
//        System.out.println(yourDog);
        myDog.say();
        context.close();
    }
}
