package hibernate_one_to_many;

import hibernate_one_to_many.entity.Department;
import hibernate_one_to_many.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {


        SessionFactory factory = new Configuration()
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .configure()
                .buildSessionFactory();

        try {
//            Session session = factory.getCurrentSession();
//            Department department = new Department("IT", 900, 400);
//            Employee emp1 = new Employee("Danila", "Dubinkin", 400);
//            Employee emp2 = new Employee("Max", "Ivanov", 400);
//
//            department.addEmployeeToDepartment(emp1);
//            department.addEmployeeToDepartment(emp2);

//            session.beginTransaction();
//            session.save(department);
//            session.getTransaction().commit();
//            System.out.println("Done!!!");


            Session session = factory.getCurrentSession();

            session.beginTransaction();

            Employee emp = session.get(Employee.class, 2);
            session.delete(emp);
            session.getTransaction().commit();
            System.out.println("\nDone!\n");
        } finally {
            factory.close();
        }
    }
}
