package com.example.springhiberannotation.Tests;

import com.example.springhiberannotation.Config.MyConfig;
import com.example.springhiberannotation.MainClasses.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Person person = context.getBean("personBean", Person.class);
        Person person2 = context.getBean("personBean", Person.class);
//        person.callYourPet();
//        Pet cat = context.getBean("catBean", Cat.class);
//        Pet yourCat = context.getBean("catBean",Cat.class);
//        cat.say();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
//        System.out.println(person.getClass());
        context.close();
    }
}
