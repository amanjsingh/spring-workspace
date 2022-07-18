package com.pluralsight.util;

import org.springframework.beans.factory.FactoryBean;

import java.util.Calendar;

public class CalendarFactory implements FactoryBean<Calendar> {

    private Calendar calendarInstance = Calendar.getInstance();

    public void addDays(int num){
        calendarInstance.add(Calendar.DAY_OF_YEAR, num);
    }

    @Override
    public Calendar getObject() throws Exception {
        return calendarInstance;
    }

    @Override
    public Class<?> getObjectType() {
        return Calendar.class;
    }
}
