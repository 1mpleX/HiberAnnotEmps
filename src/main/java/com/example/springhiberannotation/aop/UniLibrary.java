package com.example.springhiberannotation.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstracLibrary {

    public void getBook(){
        System.out.println("Мы берем книгу из университета ");
    }

    public void returnBook(){
        System.out.println("Мы вернули книгу в университет");
    }

    public void getMagazine(){
        System.out.println("Мы берем журнал из университета");
    }

    public void returnMagazine(){
        System.out.println("Мы венули журнал в университет");
    }

    public void addBook(){
        System.out.println("Мы добавляем журнал в университет");
    }

    public void addMagazine(){
        System.out.println("Мы lj,fdkztv журнал в университет");
    }
}
