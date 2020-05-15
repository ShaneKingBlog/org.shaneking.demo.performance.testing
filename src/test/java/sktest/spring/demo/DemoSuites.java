package sktest.spring.demo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import sktest.spring.demo.performance.testing.ctl.HelloControllerTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({HelloControllerTest.class})
public class DemoSuites {
}
