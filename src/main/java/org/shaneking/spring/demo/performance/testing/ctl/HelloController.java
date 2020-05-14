package org.shaneking.spring.demo.performance.testing.ctl;

import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.shaneking.skava.util.Map0;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/hello")
@Slf4j
public class HelloController {

  @GetMapping("/string")
  public String string() {
    log.debug("debug");
    return "Hello world!";
  }

  @PostMapping("/map")
  public Map<String, String> map() {
    return Map0.newHashMap(Lists.newArrayList("Hello"), Lists.newArrayList("World"));
  }
}
