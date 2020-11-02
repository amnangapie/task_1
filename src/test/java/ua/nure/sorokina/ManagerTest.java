package ua.nure.sorokina;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    Manager manager;
    int month = Calendar.OCTOBER;
    int year = 2020;

    @BeforeEach
    void setUp() {
        manager = new Manager(1457, "John", "Smith");
        manager.setRate(700);
    }

    @Test
    void getSalaryFull() {
        manager.setActualHoursOfWork(192);

        assertEquals(700, manager.getSalary(month, year));
    }

    @Test
    void getSalary() {
        manager.setActualHoursOfWork(160);

        assertEquals(665, manager.getSalary(month, year));
    }
}