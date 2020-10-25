package ua.nure.sorokina;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class DeveloperTest {

    Developer developer;
    int month = Calendar.OCTOBER;
    int year = 2020;

    @BeforeEach
    void setUp() {
        developer = new Developer(1457, "John", "Smith");
        developer.setRate(700);
    }

    @Test
    void getSalary() {
        developer.setActualHoursOfWork(160);

        assertEquals(665, developer.getSalary(month, year));
    }

    @Test
    void getSalaryOverwork() {
        developer.setActualHoursOfWork(192);

        assertEquals(798, developer.getSalary(month, year));
    }
}