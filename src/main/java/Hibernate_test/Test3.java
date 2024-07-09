package Hibernate_test;


import Hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try{
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            List<Employee> myList = session.createQuery("from Employee").getResultList();
            for(Employee loop: myList){
                if(loop.getSalary()<1000) {
                    System.out.println(loop);
                }
            }

            session.getTransaction().commit();
            System.out.println("DONE!!!");

        }finally {
            factory.close();
        }
    }
}
