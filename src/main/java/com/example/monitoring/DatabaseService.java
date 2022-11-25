package com.example.monitoring;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class DatabaseService  implements HealthIndicator {

    @Override
    public Health health() {
        if(isDatabaseHealthGood()){
            return Health.up()
            .withDetail("DatabaseService", "Database is up and running").build();
        }
        return Health.down()
            .withDetail("DatabaseService", "Database is down and stop").build();
    }

    public boolean isDatabaseHealthGood(){
        //check database health
        return true;
    }
    
}
