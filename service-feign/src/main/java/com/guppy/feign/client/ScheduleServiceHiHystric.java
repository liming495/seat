package com.guppy.feign.client;

import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @author Guppy
 */
@Component
public class ScheduleServiceHiHystric implements ScheduleServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
