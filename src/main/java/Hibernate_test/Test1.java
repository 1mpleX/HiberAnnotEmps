package Hibernate_test;

import Hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try{
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            session.get("Employee", 1);
            session.getTransaction().commit();
            System.out.println("DONE!!!");
        }finally {
            factory.close();
        }

    }
}
