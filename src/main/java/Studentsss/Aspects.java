//package Studentsss;
//
//import org.aspectj.lang.annotation.AfterReturning;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//
//@Component
//@Aspect
//public class Aspects {
//
//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsAdvice() {
//        System.out.println("Before getStudentsAdvice");
//    }
//
//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterGetStudentsAdvice(List<Student> students) {
//
//        Student firstStudent = students.get(0);
//        String nameSurnmae = "Mr.";
//        nameSurnmae+=firstStudent.getNameSurname();
//        firstStudent.setNameSurname(nameSurnmae);
//
//        double avgStudents = firstStudent.getAvg();
//        avgStudents+=2;
//        firstStudent.setAvg(avgStudents);
//
//        int course = firstStudent.getCourse();
//        course+=1;
//        firstStudent.setCourse(course);
//
//
//        System.out.println("After getStudentsAdvice");
//    }
//
//}
