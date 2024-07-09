package com.example.springhiberannotation.Tests;

import com.example.springhiberannotation.MainClasses.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CfgWithAnnotation1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
//        Cat cat = context.getBean("catBean",Cat.class);
//        cat.say();

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        System.out.println(person.getAge());


        context.close();
    }
}
