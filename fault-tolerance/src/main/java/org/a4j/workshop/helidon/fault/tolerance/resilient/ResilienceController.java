package org.a4j.workshop.helidon.fault.tolerance.resilient;

import org.eclipse.microprofile.faulttolerance.CircuitBreaker;
import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.faulttolerance.Timeout;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/resilience")
@ApplicationScoped
public class ResilienceController {

    @Fallback(fallbackMethod = "fallback") // better use FallbackHandler
    @Timeout(500)
    @GET
    public String checkTimeout() {
        try {
            Thread.sleep(700L);
        } catch (InterruptedException e) {
            //
        }
        return "Never from normal processing";
    }

    @Fallback(CustomFallbackHandler.class)
    @Timeout(500)
    @GET
    @Path("custom")
    public String handler() {
        try {
            Thread.sleep(700L);
        } catch (InterruptedException e) {
            //
        }
        return "Never from normal processing";
    }
    public String fallback() {
        return "Fallback answer due to timeout";
    }


    @CircuitBreaker(successThreshold = 10, requestVolumeThreshold = 4, failureRatio=0.75,delay = 1000)
    /**
     * The above code-snippet means the method serviceA applies the CircuitBreaker policy,
     * which is to open the circuit once 3 (4x0.75) failures occur among the rolling window of 4 consecutive
     * invocations. The circuit will stay open for 1000ms and then back to half open.
     * After 10 consecutive successful invocations, the circuit will be back to close again.
     * When a circuit is open, A CircuitBreakerOpenException will be thrown.
     */
    @GET
    @Path("circuit")
    public Person serviceA() {
        throw new RuntimeException("");
    }
// https://www.eclipse.org/community/eclipse_newsletter/2017/september/article4.php
}
