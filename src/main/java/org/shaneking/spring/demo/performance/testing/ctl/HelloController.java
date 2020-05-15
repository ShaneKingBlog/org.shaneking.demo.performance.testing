package org.shaneking.spring.demo.performance.testing.ctl;

import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.shaneking.skava.util.Map0;
import org.springframework.web.bind.annotation.*;

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
  public Map<String, String> map(@RequestBody Map<String, String> req) {
    return Map0.newHashMap(Lists.newArrayList("Hello"), Lists.newArrayList("World"));
  }
}
