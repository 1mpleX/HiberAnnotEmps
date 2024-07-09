package com.example.springhiberannotation.Tests;


import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext2.xml");
//        Dog myDog = context.getBean("myPet", Dog.class);
//        myDog.setName("Белка");
//        Dog yourDog = context.getBean("myPet", Dog.class);
//        yourDog.setName("Стрелка");
//
//        System.out.println(myDog.getName()+"\n"+yourDog.getName());
//
//
//        System.out.println("переменные ссылаются на один и тот же объект? "+(myDog==yourDog));
//        System.out.println(myDog);
//        System.out.println(yourDog);
//        context.close();


    }
}
//singleton - переменные ссылаются на один и тот же объект, бин уже создан
//prototype - при вызове бина - создаются отдельные объекты
