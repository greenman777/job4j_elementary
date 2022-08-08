package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when13to58then6dot40() {
        double expected = 6.40;
        Point a = new Point(1, 3);
        Point b = new Point(5, 8);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when39to40then9dot05() {
        double expected = 9.05;
        Point a = new Point(3, 9);
        Point b = new Point(4, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when99to11then11dot31() {
        double expected = 11.31;
        Point a = new Point(9, 9);
        Point b = new Point(1, 1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when3d000to202then2dot82() {
        double expected = 2.82;
        Point a = new Point(0, 0, 0);
        Point b = new Point(2, 0, 2);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when3d132to58then8dot12() {
        double expected = 8.12;
        Point a = new Point(1, 3, 2);
        Point b = new Point(5, 8, 7);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when3d390to40then12dot08() {
        double expected = 12.08;
        Point a = new Point(3, 9, 0);
        Point b = new Point(4, 0, 8);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when3d99to11then13dot85() {
        double expected = 13.85;
        Point a = new Point(9, 9, 9);
        Point b = new Point(1, 1, 1);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}