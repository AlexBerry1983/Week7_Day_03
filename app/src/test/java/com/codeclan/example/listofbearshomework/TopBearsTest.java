package com.codeclan.example.listofbearshomework;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

/**
 * Created by user on 24/05/2017.
 */
public class TopBearsTest {

    @Test
    public void canGetArraylist() {
        TopBears topBears = new TopBears();
        assertThat(topBears.getList(), instanceOf(ArrayList.class));
    }

}