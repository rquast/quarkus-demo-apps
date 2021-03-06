package helloworld;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@ApplicationScoped
public class HelloGreeter {

    public String greet(String first, String last) {
        return String.format("Hello %s %s.%n", first, last);
    }

    public String bye(String first, String last) {
        return String.format("Fare well, %s %s.%n", first, last);
    }

}
