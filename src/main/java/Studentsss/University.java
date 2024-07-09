package Studentsss;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudent() {
        Student student = new Student("Danila Dubinkin", 3.3, 2);
        Student student1 = new Student("Max Kakoy", 4.3, 3);
        Student student2 = new Student("Ilya Krutoi", 5.1, 4);
        students.add(student);
        students.add(student1);
        students.add(student2);
    }

    public List<Student> getStudents() {
        System.out.println("info about students: " + students);
        return students;
    }
}
