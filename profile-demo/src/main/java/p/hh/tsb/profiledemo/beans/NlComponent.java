package p.hh.tsb.profiledemo.beans;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("nl")
public class NlComponent {

}
