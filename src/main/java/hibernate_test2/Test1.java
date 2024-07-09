package hibernate_test2;

import hibernate_test2.entity.Detail;
import hibernate_test2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        try{

            Session session = factory.getCurrentSession();

            session.beginTransaction();
            System.out.println("\n");
            Employee emp = new Employee("Max", "Takoi", "google", 431);
            Detail detail = new Detail("Moscow", "74635268596", "maxtaloi@gmail.com");
            emp.setEmpDetail(detail);
            session.save(emp);

//            Employee emp = session.get(Employee.class, 4);
//            session.delete(emp);

//            Employee emp = session.get(Employee.class, 1);
//            System.out.println(emp+"\n"+emp.getEmpDetail()+"\n");
//            System.out.println("DONE!!!");
            session.getTransaction().commit();

        }finally {
            factory.close();
        }

    }
}
