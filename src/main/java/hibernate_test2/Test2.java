package hibernate_test2;

import hibernate_test2.entity.Detail;
import hibernate_test2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        try{
            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Grisha", "Petrov", "HR", 900);
            Detail detail = new Detail("Moscow", "752426", "grha@gmail.com");
            detail.setEmployee(employee);
            employee.setEmpDetail(detail);
            session.beginTransaction();
            session.save(detail);
            session.getTransaction().commit();
            System.out.println("Done!!!");
        }finally {
            factory.close();
        }

    }
}
