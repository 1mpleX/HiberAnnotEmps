package MyTest2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Caw {
    @Value("Murka")
    String name;

    @Value("13")
    int age;

    @Value("M")
    char gender;

    public void getInfoAboutCaw(String nam, int ag, char gende){
        System.out.println(name+" "+age+" "+gender);
    }

}
