package MyTest2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Starting {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Caw caw = (Caw) context.getBean("caw");

        caw.getInfoAboutCaw(caw.name, caw.age, caw.gender);
        context.close();

    }
}
