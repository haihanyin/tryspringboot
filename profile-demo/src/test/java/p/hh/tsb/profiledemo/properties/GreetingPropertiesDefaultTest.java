package p.hh.tsb.profiledemo.properties;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.CORBA.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GreetingPropertiesDefaultTest {

    @Autowired
    private GreetingProperties greetingProperties;

    @Test
    public void test() {
        assertEquals("hello", greetingProperties.getGreeting());
    }


}