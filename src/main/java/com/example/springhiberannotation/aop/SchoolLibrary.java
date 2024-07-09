package com.example.springhiberannotation.aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstracLibrary {

    public void getBook(){
        System.out.println("Берем книгу из школы");
    }
}
