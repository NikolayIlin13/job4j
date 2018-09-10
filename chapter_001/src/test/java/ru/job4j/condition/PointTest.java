package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void testDistanceFromOnePointToAnother() {
        Point a = new Point(0, 1);
        Point b = new Point(2, 5);
        double actual = a.distanceTo(b);
        double expected = Math.sqrt(20);
        assertThat(actual, is(expected));
    }
}