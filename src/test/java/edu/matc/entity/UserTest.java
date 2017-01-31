package edu.matc.entity;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.*;

/**
 * Created by student on 1/24/17.
 */
public class UserTest {

    User user;

    @Before
    public void setUp(){
        user = new User("TestFirst", "TestLast","5", "2000-08-01");
    }

    @Test
    public void calculateDate() throws Exception{
        assertEquals(16, user.calculateDate());
    }
}