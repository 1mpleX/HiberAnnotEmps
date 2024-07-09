package Hibernate_test;

import Hibernate_test.entity.EmployeeTest;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test6 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(EmployeeTest.class)
                .buildSessionFactory();

        try{

            Session session = factory.getCurrentSession();
            session.beginTransaction();
            List<EmployeeTest> list = session.createQuery("from EmployeeTest ").getResultList();
            System.out.println("\n");
//            EmployeeTest empl = new EmployeeTest("Nikitos", "Mahmedov", "Krutoi", 500);
//            session.save(empl);
//            for(EmployeeTest employeeTest: list){
//                if(employeeTest.getSalary()>500){
//                    session.delete(employeeTest);
//                }
//            }

            System.out.println(list.stream().count()+"\n"+list);
            System.out.println("\nDone!\n");


            session.getTransaction().commit();


        }finally{
            factory.close();
        }
    }
}
