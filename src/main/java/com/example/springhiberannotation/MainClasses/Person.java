package com.example.springhiberannotation.MainClasses;

import org.springframework.beans.factory.annotation.Value;

//@Component("personBean")
public class Person {

//    @Autowired
//    @Qualifier("catBean")
    private Pet pet;
//    @Value("KTO-TO")
    @Value("${person.surname}")
    private String surname;
//    @Value("20")
    @Value("${person.age}")
    private int age;

//    @Autowired()
//    public Person(@Qualifier("catBean") Pet pet) {
//        System.out.println("Person bean with param created! ");
//        this.pet = pet;
//    }

    public Person(Pet pet) {
        System.out.println("Person bean with param created! ");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surName) {
        System.out.println("Class Person: set surname");
        this.surname = surName;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }

//    public Person() {
//        System.out.println("Person bean is created! ");
//    }

    /*
    pet -> setPet
    pet -> Pet
    pet -> SetPet
    */

//    @Autowired
//    @Qualifier("dogBean")
    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hi, my pet");
        pet.say();
    }
}
