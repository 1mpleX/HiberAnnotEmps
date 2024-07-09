package com.example.springhiberannotation.MainClasses;

import org.springframework.stereotype.Component;

@Component("dogBean")
public class Dog implements Pet{
//    private String name;
    public Dog(){
        System.out.println("Dog bean is created! ");
    }
    @Override
    public void say(){
        System.out.println("Bow-Wow! ");
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

//    @PostConstruct
//    protected void init(){
//        System.out.println("Class: dog, init method \n");
//    }
//
//    @PreDestroy
//    private void destroy(){
//        System.out.println("\nClass: dog, destroy method ");
//    }
}
