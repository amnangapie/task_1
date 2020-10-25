package ua.nure.sorokina.utils;

import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeUtilsTest {

    @Test
    void getWorkdaysPerMonth() {
        int workdays = TimeUtils.getWorkdaysPerMonth(Calendar.SEPTEMBER, 2020);
        assertEquals(22, workdays);
    }

    @Test
    void getWorkdaysPerMonthWithHolidays() {
        int workdays = TimeUtils.getWorkdaysPerMonth(Calendar.DECEMBER, 2020);
        assertEquals(21, workdays);
    }


    @Test
    void getWorkHoursPerMonth() {
        int workhours = TimeUtils.getWorkHoursPerMonth(Calendar.DECEMBER, 2020);
        assertEquals(168, workhours);
    }
}