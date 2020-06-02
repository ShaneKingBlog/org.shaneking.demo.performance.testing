package sktest.spring.demo;

import org.shaneking.spring.demo.DemoApplication;
import org.shaneking.spring.test.SKSpringMvcUnit;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = DemoApplication.class)
public class SpringMvcUnit extends SKSpringMvcUnit {
}
