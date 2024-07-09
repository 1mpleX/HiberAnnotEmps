package MyTest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Airplane {

    @Value("letun")
    String name;

    @Value("black")
    String color;

    @Value("20")
    int year;

    public void returning(){
        System.out.println(name+" "+color+" "+year);
    }

}
