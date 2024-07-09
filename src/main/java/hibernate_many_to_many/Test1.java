package hibernate_many_to_many;

import hibernate_many_to_many.entity.Children;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .addAnnotatedClass(Section.class)
                .addAnnotatedClass(Children.class)
                .configure()
                .buildSessionFactory();

        try{

//            Session session = factory.getCurrentSession();
//            Section section1 = new Section("football");
//            Children children1 = new Children("Danilka", 5);
//            Children children2 = new Children("Maximka", 10);
//            Children children3 = new Children("Egorka", 7);
//
//            section1.addChild(children1);
//            section1.addChild(children2);
//            section1.addChild(children3);
//
//            session.beginTransaction();
//            session.save(section1);
//            session.getTransaction().commit();
//            System.out.println("Done!!!");
            //**********************************************
//            Session session = factory.getCurrentSession();
//
//            Section section1 = new Section("Chess");
//            Section section2 = new Section("Swim");
//            Section section3 = new Section("Taekwondo");
//
//            Children children3 = new Children("Ilya", 13);
//
//            children3.addSectionToChild(section1);
//            children3.addSectionToChild(section2);
//            children3.addSectionToChild(section3);
//
//            session.beginTransaction();
//            session.save(children3);
//            session.getTransaction();
//            session.getTransaction().commit();
//            System.out.println("Done!!!");
            //************************************************
            Session session = factory.getCurrentSession();

            session.beginTransaction();

            Section section = session.get(Section.class, 1);
            session.delete(section);

            session.getTransaction().commit();
            System.out.println("Done!!!");
        }finally{
            factory.close();
        }

    }
}
