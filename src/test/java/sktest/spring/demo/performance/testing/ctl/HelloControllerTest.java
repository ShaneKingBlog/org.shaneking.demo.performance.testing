package sktest.spring.demo.performance.testing.ctl;

import org.junit.Test;
import sktest.spring.demo.SpringMvcUnit;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class HelloControllerTest extends SpringMvcUnit {

  @Test
  public void string() throws Exception {
    mockMvc.perform(get("/hello/string")).andExpect(status().isOk()).andDo(print()).andExpect(content().string("Hello world!"));
  }

  @Test
  public void mapParallelStream() throws Exception {
    performJJ("/hello/mapParallelStream");
  }
}
