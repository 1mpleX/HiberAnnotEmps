package com.example.springhiberannotation.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.example.springhiberannotation.aop")
@EnableAspectJAutoProxy
public class MyConfig {
}
