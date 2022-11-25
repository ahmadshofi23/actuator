package com.example.monitoring;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class OtherService implements HealthIndicator {

    private boolean isRunning = true;

    @Override
    public Health health() {
        if(isOtherServiceHealthGood()){
            return Health.up()
            .withDetail("OtherService", "OtherService is up and running").build();
        }
        return Health.down()
            .withDetail("OtherService", "OtherService is down and stop").build();
    }

    public boolean isOtherServiceHealthGood(){
        //check database health
        return isRunning = !isRunning;
    }
}
