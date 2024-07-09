package Hibernate_test;

import Hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try{
            Session session = factory.getCurrentSession();
//            Employee emp = new Employee("Elena", "Pavlovna", "ITYandex", 190000);
//            session.beginTransaction();
//            session.save(emp);
//            session.getTransaction().commit();


            session = factory.getCurrentSession();
                session.beginTransaction();
            for (int i = 1; i < 10; i++) {
                Employee employee = session.get(Employee.class, i);
                System.out.println(employee);
            }
                session.getTransaction().commit();
        }finally{
            factory.close();
        }
    }
}
