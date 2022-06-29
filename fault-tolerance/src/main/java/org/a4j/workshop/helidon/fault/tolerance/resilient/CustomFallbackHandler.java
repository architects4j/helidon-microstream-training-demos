package org.a4j.workshop.helidon.fault.tolerance.resilient;

import org.eclipse.microprofile.faulttolerance.ExecutionContext;
import org.eclipse.microprofile.faulttolerance.FallbackHandler;

import java.lang.reflect.Method;
import java.util.logging.Logger;

public class CustomFallbackHandler implements FallbackHandler<String> {

    private static final Logger LOGGER = Logger.getLogger(CustomFallbackHandler.class.getName());

    @Override
    public String handle(ExecutionContext context) {
        Method method = context.getMethod();
        LOGGER.info("Issue on the method " + method + " with the error: " + context.getFailure().getMessage());

        return "Executing the fallback message";
    }
}
