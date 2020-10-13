package com.sheepsonit;
import org.junit.Test;
import static org.junit.Assert.*;

public class ExercisesTest {

    @Test
    public void sum() {
        assertEquals(16,Exercises.sum(new int[] {1,3,5,7}));
    }

    @Test
    public void countElements1() {
        assertEquals(0,Exercises.countElements(new int[]{}));
    }

    @Test
    public void countElements2() {
        assertEquals(1,Exercises.countElements(new int[]{2}));
    }

    @Test
    public void countElements3() {
        assertEquals(2,Exercises.countElements(new int[]{123,27}));
    }

    @Test
    public void max1() {
        assertEquals(123,Exercises.max(new int[]{123,27}));
    }

    @Test
    public void max2() {
        assertEquals(567,Exercises.max(new int[]{123,27,43,567}));
    }
}