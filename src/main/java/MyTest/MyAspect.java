//package MyTest;
//
//import MyTest2.Caw;
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.stereotype.Component;
//
//import java.util.Arrays;
//
//@Component
//@Aspect
//public class MyAspect {
//
//    @Pointcut("execution(* *())")
//    private void MyPointcut() {}
//
//    @Before("MyPointcut()")
//    public void beforeReturnAdvice(JoinPoint joinPoint) {
//        System.out.println("Before Method: " + joinPoint.getSignature().getName());
//
//
//    }
//
//}
