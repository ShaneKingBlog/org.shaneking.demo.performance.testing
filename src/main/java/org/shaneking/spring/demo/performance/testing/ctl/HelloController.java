package org.shaneking.spring.demo.performance.testing.ctl;

import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
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

  @PostMapping("/mapStream")
  public Map<String, String> mapStream(@RequestBody Map<String, String> req) {
    Map<String, String> rtnMap = Maps.newHashMap();
    req.keySet().stream().forEach(s -> rtnMap.put(s, req.get(s)));
    return rtnMap;
  }

  @PostMapping("/mapParallelStream")
  public Map<String, String> mapParallelStream(@RequestBody Map<String, String> req) {
    Map<String, String> rtnMap = Maps.newHashMap();
    req.keySet().parallelStream().forEach(s -> rtnMap.put(s, req.get(s)));
    return rtnMap;
  }
}
