package com.cydeo.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("OTH")
public class OverTimeHours implements HoursRepository{
    @Override
    public int getHours() {
        return 15;
    }
}
