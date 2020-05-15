package sktest.spring.demo;

import org.shaneking.spring.demo.SpringMvcUnitApplication;
import org.shaneking.spring.test.SKSpringMvcUnit;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = SpringMvcUnitApplication.class)
public class SpringMvcUnit extends SKSpringMvcUnit {
}
