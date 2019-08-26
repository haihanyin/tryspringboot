package p.hh.tsb.profiledemo.properties;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(properties = "spring.profiles.active=nl")
public class GreetingPropertiesNlTest {

    @Autowired
    private GreetingProperties greetingProperties;

    @Test
    public void test() {
        assertEquals("dag", greetingProperties.getGreeting());
    }


}