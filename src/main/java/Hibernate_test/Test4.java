package Hibernate_test;

import Hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test4 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try{

            Session session = factory.getCurrentSession();
            session.beginTransaction();

            session.createQuery("update Employee set salary=1000 "+"where salary>1000 ").executeUpdate();

            session.getTransaction().commit();
            System.out.println("Done!!!");
        }finally {
            factory.close();
        }

    }
}
