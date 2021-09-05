package sktest.demo.performance.testing.ctl;

import org.junit.jupiter.api.Test;
import org.shaneking.demo.DemoPerformanceTestingApplication;
import org.shaneking.leon.test.SKSpringMvcUnit;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = DemoPerformanceTestingApplication.class)///not need this line if package is org.shaneking.demo...
public class HelloControllerTest extends SKSpringMvcUnit {

  @Test
  public void string() throws Exception {
    mockMvc.perform(get("/hello/string")).andExpect(status().isOk()).andDo(print()).andExpect(content().string("Hello world!"));
  }

  @Test
  public void mapParallelStream() throws Exception {
    performJJ("/hello/mapParallelStream");
  }
}
