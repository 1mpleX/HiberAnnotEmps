package Hibernate_test;

import Hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test5 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try{
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            Employee emp = session.get(Employee.class, 1);
            session.createQuery("update Employee set department='JAVIST' where id='2'").executeUpdate();

            session.getTransaction().commit();
            System.out.println("Done!");
        }finally{
            factory.close();
        }

    }
}
