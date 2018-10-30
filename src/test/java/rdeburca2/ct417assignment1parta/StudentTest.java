/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rdeburca2.ct417assignment1parta;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 *
 * @author Rumhann de Búrca
 */
public class StudentTest {
    
    
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

     @Test
    public void studentTest() {
        DateTimeFormatter dateTimeFor = DateTimeFormat.forPattern("dd/mm/yyyy");
        DateTime dob = dateTimeFor.parseDateTime("30/07/1997");
        Student student = new Student("Rumhann de Búrca", 22, 15551603, dob);
        String expected = "Rumhann de Búrca22";
        assertEquals(expected, student.getUsername());
    }
}
