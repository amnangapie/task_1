package ua.nure.sorokina;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Employee> employees = new HashSet<>();
        Employee developer = new Developer(1457, "John", "Smith", 700, 160);
        Employee manager = new Manager(1458, "Sam", "Black", 1000, 192);
        employees.add(developer);
        employees.add(manager);

        Map<Employee, Double> salaries
                = Accountant.calculateSalaries(employees, Calendar.OCTOBER, 2020);

        System.out.println(developer);
        System.out.println("Salary for october: " + salaries.get(developer));
        System.out.println(manager);
        System.out.println("Salary for october: " + salaries.get(manager));
    }
}
