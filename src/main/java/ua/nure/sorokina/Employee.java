package ua.nure.sorokina;

import ua.nure.sorokina.utils.TimeUtils;

import java.math.BigDecimal;
import java.math.MathContext;

public abstract class Employee {
    private final long id;
    private final String firstName;
    private final String lastName;

    /* monthly salary with 100-percent hours worked */
    private int rate;
    /* actual hours of work per month */
    private int actualHoursOfWork;

    public Employee(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee(long id, String firstName, String lastName, int rate, int actualHoursOfWork) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.rate = rate;
        this.actualHoursOfWork = actualHoursOfWork;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) throws IllegalArgumentException {
        if (rate < 0) {
            throw new IllegalArgumentException("Invalid value: salary must be positive!");
        }
        this.rate = rate;
    }

    public int getActualHoursOfWork() {
        return actualHoursOfWork;
    }

    public void setActualHoursOfWork(int actualHoursOfWork)
            throws IllegalArgumentException {
        if (actualHoursOfWork < 0) {
            throw new IllegalArgumentException("Invalid value: hours of work must be positive!");
        }
        this.actualHoursOfWork = actualHoursOfWork;
    }

    public double getActualWorkTimePercentage(int month, int year) {
        int workHours = TimeUtils.getWorkHoursPerMonth(month, year);
        double percentage = (double) actualHoursOfWork / workHours;

        return Math.round(percentage * 100.) / 100.;
    }

    public abstract double getSalary(int month, int year);
}
