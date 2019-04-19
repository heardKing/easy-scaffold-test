package com.cuixx.es.personal.calendar.service;

import com.cuixx.es.common.service.BaseService;
import com.cuixx.es.personal.calendar.entity.Calendar;
import com.cuixx.es.personal.calendar.repository.CalendarRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.util.Date;

@Service
public class CalendarService extends BaseService<Calendar, Long> {

    private CalendarRepository getCalendarRepository() {
        return (CalendarRepository) baseRepository;
    }

    public void copyAndRemove(Calendar calendar) {
        delete(calendar);

        Calendar copyCalendar = new Calendar();
        BeanUtils.copyProperties(calendar, copyCalendar);
        copyCalendar.setId(null);
        save(copyCalendar);
    }

    //2013 10 11   10-20   -3 > now
    //     10 11  10-19
    public Long countRecentlyCalendar(Long userId, Integer interval) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        Date nowTime = new Time(calendar.getTimeInMillis());
        calendar.set(java.util.Calendar.HOUR_OF_DAY, 0);
        calendar.set(java.util.Calendar.MINUTE, 0);
        calendar.set(java.util.Calendar.SECOND, 0);

        return getCalendarRepository().countRecentlyCalendar(userId, calendar.getTime(), nowTime, interval);
    }
}
