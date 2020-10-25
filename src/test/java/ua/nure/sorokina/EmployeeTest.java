package ua.nure.sorokina;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    Employee employee;

    @BeforeEach
    void setUp() {
        employee = Mockito.mock(Employee.class, Mockito.CALLS_REAL_METHODS);
        employee.setRate(700);
        employee.setActualHoursOfWork(192);
    }

    @Test
    void setRate() {
        employee.setRate(500);

        assertEquals(500, employee.getRate());
    }

    @Test
    void setNegativeRate() {
        final IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class, () -> { employee.setRate(-500); });

        assertEquals("Invalid value: salary must be positive!", exception.getMessage());
    }

    @Test
    void setActualHoursOfWork() {
        employee.setActualHoursOfWork(160);

        assertEquals(160, employee.getActualHoursOfWork());
    }

    @Test
    void setNegativeActualHoursOfWork() {
        final IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class, () -> { employee.setActualHoursOfWork(-10); });

        assertEquals("Invalid value: hours of work must be positive!", exception.getMessage());
    }

    @Test
    void getActualWorkTimePercentage() {
        assertEquals(1.14,
                employee.getActualWorkTimePercentage(Calendar.OCTOBER, 2020));

        employee.setActualHoursOfWork(193);
        assertEquals(1.15,
                employee.getActualWorkTimePercentage(Calendar.OCTOBER, 2020));
    }
}