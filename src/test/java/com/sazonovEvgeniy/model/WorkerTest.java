package com.sazonovEvgeniy.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class WorkerTest {
    Worker worker;

    @Test
    public void getSalary() {
        worker = new Worker(150, 100, 20);
        assertEquals(21000, worker.getSalary());
    }
}