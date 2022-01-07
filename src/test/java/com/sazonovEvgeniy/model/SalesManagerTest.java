package com.sazonovEvgeniy.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class SalesManagerTest {
    SalesManager salesManager;

    @Test
    public void getSalary() {
        salesManager = new SalesManager(10000, 1000, 25);
        // Sales manager salary: base salary + bonus * count = 10000 + 1000 * 25 = 35000;
        assertEquals(35000, salesManager.getSalary());
    }
}