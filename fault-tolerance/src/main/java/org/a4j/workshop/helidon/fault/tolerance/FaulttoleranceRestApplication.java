package org.a4j.workshop.helidon.fault.tolerance;




import org.a4j.workshop.helidon.fault.tolerance.resilient.ResilienceController;


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
public class FaulttoleranceRestApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {

        Set<Class<?>> classes = new HashSet<>();

        // resources
        classes.add(HelloController.class);
        
        
        
        classes.add(ResilienceController.class);
        
        
        
        
        return classes;
    }
}
