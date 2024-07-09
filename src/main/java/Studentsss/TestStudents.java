package Studentsss;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class TestStudents {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        University university = context.getBean(University.class);
        university.addStudent();
        List<Student> arl = university.getStudents();
        System.out.println(arl);
        context.close();
    }
}
