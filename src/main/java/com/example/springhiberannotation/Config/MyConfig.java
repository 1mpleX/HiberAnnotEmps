package com.example.springhiberannotation.Config;

import com.example.springhiberannotation.MainClasses.Cat;
import com.example.springhiberannotation.MainClasses.Person;
import com.example.springhiberannotation.MainClasses.Pet;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:application.properties")
//@ComponentScan("com.example.springcourse")
public class MyConfig {

    @Bean
//    @Scope("prototype")
    public Pet catBean(){
        return new Cat();
    }

    @Bean
//    @Scope("prototype")
    public Person personBean(){
        return new Person(catBean());
    }
}
