package sktest.spring.demo;

import org.shaneking.spring.demo.SpringUnitApplication;
import org.shaneking.spring.test.SKSpringUnit;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = SpringUnitApplication.class)
public class SpringUnit extends SKSpringUnit {
}
