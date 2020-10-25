package ua.nure.sorokina;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class AccountantTest {

    Set<Employee> employees = new HashSet<>();
    Employee developer = new Developer(1457, "John", "Smith", 700, 160);
    Employee manager = new Manager(1458, "Sam", "Black", 1000, 192);

    int month = Calendar.OCTOBER;
    int year = 2020;

    {
        employees.add(developer);
        employees.add(manager);
    }

    @Test
    void calculateSalaries() {
        Map<Employee, Double> salaries
                = Accountant.calculateSalaries(employees, month, year);

        assertEquals(salaries.get(developer), 665);
        assertEquals(salaries.get(manager), 1000);
    }
}