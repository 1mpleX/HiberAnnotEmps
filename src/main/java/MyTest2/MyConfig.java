package MyTest2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("MyTest2")
@EnableAspectJAutoProxy
public class MyConfig {
}
