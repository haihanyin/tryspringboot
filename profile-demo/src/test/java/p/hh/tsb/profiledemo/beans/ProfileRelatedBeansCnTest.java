package p.hh.tsb.profiledemo.beans;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(properties = "spring.profiles.active=cn")
public class ProfileRelatedBeansCnTest {

    @Autowired(required = false)
    private CnComponent cnComponent;

    @Autowired(required = false)
    private NlComponent nlComponent;

    @Test
    public void test() {
        assertNotNull(cnComponent);
        assertNull(nlComponent);
    }
}
