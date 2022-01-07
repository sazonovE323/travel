package com.sazonovEvgeniy.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Utility class for store information about calculations (created Employees). Can be used as a history of calculations.
 */
public class DataStorage {
    private static final List<IEmployee> employees = new ArrayList<>();

    /**
     * Method to add employee to storage and if it's size more than 10, remove an extra element.
     * @param employee
     */
    public static void addEmployee(IEmployee employee) {
        employees.add(employee);
        if(employees.size() > 10) {
            employees.remove(0);
        }
    }

    public static List<IEmployee> getEmployees() {
        return employees;
    }
}
