//package com.example.springcourse.aop.aspects;
//
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.stereotype.Component;
//
//@Component
//@Aspect
//public class LoggingAndSecurityAspect {
//
//    @Pointcut("execution(* com.example.springcourse.aop.UniLibrary.return*())")
//    private void uniLibraryReturnMethod() {}
//
//    @Pointcut("execution(* com.example.springcourse.aop.UniLibrary.get*())")
//    private void uniLibraryGetMethod() {}
//
//    @Pointcut("uniLibraryGetMethod() || uniLibraryReturnMethod()")
//    private void uniLibraryGetAndReturnMethod() {}
//
//    @Before("uniLibraryReturnMethod()")
//    public void beforeReturnUniLibraryMethodAdvice() {
//        System.out.println("Before ReturnUniLibrary Method");
//    }
//
//    @Before("uniLibraryGetMethod()")
//    public void beforeGetUniLibraryMethodAdvice() {
//        System.out.println("Before GetUniLibrary Method");
//    }
//
//    @Before("uniLibraryGetAndReturnMethod()")
//    public void beforeUniLibraryGetAndReturnMethodAdvice() {
//        System.out.println("Before UniLibrary GetAndReturn Method");
//    }
//
////    @Pointcut("execution(* *(..))")
////    private void pointcut() {}
////
////    @Before("pointcut()")
////    public void beforeLoggingGetBookAdvice(){
////        System.out.println("beforeGetBookAdvice: попытка взять книгу/журнал");
////    }
////
////    @Before("pointcut()")
////    public void beforeSecirityGetBook(){
////        System.out.println("beforeSecirityGetBook: Ппопытка взять книгу/журнал");
////    }
//
////    @Before("execution ( * *())")
////    public void beforeReturnBookAdvice(){
////        System.out.println("Попытка взять книгу из школы");
////    }
//}
//
////    @Before("execution(public void com.example.springcourse.aop.SchoolLibrary.getBook())")
////    public void beforeGetBookAdvice(){
////        System.out.println("beforeGetBookAdvice: "+"попытка взять книгу");
////    }
