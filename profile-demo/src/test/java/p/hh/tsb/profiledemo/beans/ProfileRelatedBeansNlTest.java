package p.hh.tsb.profiledemo.beans;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(properties = "spring.profiles.active=nl")
public class ProfileRelatedBeansNlTest {

    @Autowired(required = false)
    private CnComponent cnComponent;

    @Autowired(required = false)
    private NlComponent nlComponent;

    @Test
    public void test() {
        assertNull(cnComponent);
        assertNotNull(nlComponent);
    }
}
