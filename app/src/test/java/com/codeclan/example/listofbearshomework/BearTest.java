package com.codeclan.example.listofbearshomework;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 24/05/2017.
 */
public class BearTest {

    @Test
    public void canGetRanking() {
        Bear sharpToothMammal = new Bear(7, "Sloth Bear");
        assertEquals(7, sharpToothMammal.getRanking());
    }

    @Test
    public void canGetType() {
        Bear sharpToothMammal = new Bear(7, "Sloth Bear");
        assertEquals("Sloth Bear", sharpToothMammal.getType());
    }

}