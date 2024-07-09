package MyTest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configu.class);

        Airplane airplane = (Airplane) context.getBean("airplane");
        airplane.returning();

        context.close();
    }
}
