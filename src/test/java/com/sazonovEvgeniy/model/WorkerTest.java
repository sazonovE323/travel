package com.sazonovEvgeniy.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class WorkerTest {
    Worker worker;

    @Test
    public void getSalary() {
        worker = new Worker(150, 100, 20);
        // Worker salary: rate * hours + 2 * rate * overtime hours = 150 * 100 + 2 * 150 * 20 = 21000;
        assertEquals(21000, worker.getSalary());
    }
}