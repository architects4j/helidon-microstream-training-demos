package org.a4j.workshop.microstream.helidon.demo;



import org.a4j.workshop.microstream.helidon.demo.client.ServiceController;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 *
 */
@ApplicationPath("/data")

@ApplicationScoped
public class DemoRestApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {

        Set<Class<?>> classes = new HashSet<>();

        // resources
        
        classes.add(ServiceController.class);
        
        

        return classes;
    }
}
