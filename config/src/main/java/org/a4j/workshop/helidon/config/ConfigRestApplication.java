package org.a4j.workshop.helidon.config;



import org.a4j.workshop.helidon.config.config.ConfigTestController;


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
public class ConfigRestApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {

        Set<Class<?>> classes = new HashSet<>();

        // resources
        classes.add(HelloController.class);
        
        
        classes.add(ConfigTestController.class);
        
        
        
        
        
        return classes;
    }
}
