package com.sazonovEvgeniy.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EngineerTest {
    Engineer engineer;

    @Test
    public void getSalary() {
        engineer = new Engineer(30000, 20000);
        assertEquals(50000, engineer.getSalary());
    }
}