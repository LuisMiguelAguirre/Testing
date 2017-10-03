package com.example.admin.testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Admin on 10/3/2017.
 */

public class CalculationTest {

    private Calculation calculation;
    private Addition addition;

    @Before
    public void setup(){
        addition = mock(Addition.class);
        calculation = new Calculation(addition);
        calculation.setVal1(0);
        calculation.setVal2(0);

    }

    @Test
    public void should_add_the_input_numbers(){

        when(addition.add(0, 0)).thenReturn(500);

        assertEquals(calculation.addition(), 510);

    }

    @Test
    public void should_susbtract_the_input_numbers(){
        assertEquals(calculation.susbtraction(), 4);
    }

    @Test
    public void should_divide_the_input_numbers(){
        assertEquals(calculation.division(), 2.25, 1.0);
    }

    @After
    public void tearDown(){
        calculation.clear();
    }

}
