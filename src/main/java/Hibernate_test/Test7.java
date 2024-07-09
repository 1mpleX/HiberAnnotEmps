package Hibernate_test;

import Hibernate_test.entity.Employee;
import Hibernate_test.entity.EmployeeTest;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test7 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(EmployeeTest.class)
                .buildSessionFactory();


        try{
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            List<Employee> emp = session.createQuery("from EmployeeTest").list();
            System.out.println(session);
            System.out.println(emp);

            session.getTransaction().commit();

        }finally {
            factory.close();
        }
    }
}
