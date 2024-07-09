//package MyTest2;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.stereotype.Component;
//
//@Component
//@Aspect
//public class MyPointCuts {
//
//    @Pointcut("execution(* get*())")
//    private void myPointCut() {}
//
//    @Before("myPointCut()")
//    public void befroeInformationAdvice(JoinPoint joinPoint) {
//        System.out.println(joinPoint.getSignature().getName());
//        Object[] args = joinPoint.getArgs();
//
//
//
//
//        if (joinPoint.getSignature().getName().equals("getInfoAboutCaw")) {
//
//            System.out.println();
//        }
//    }
//
//}
