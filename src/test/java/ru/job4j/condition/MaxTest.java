package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMaxTwo1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxTwo7To5Then7() {
        int left = 7;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxTwo5To5Then5() {
        int left = 5;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxThree1To2To3Then3() {
        int first = 1;
        int second = 2;
        int third = 3;
        int result = Max.max(first, second, third);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxThree3To5To2Then5() {
        int first = 3;
        int second = 5;
        int third = 2;
        int result = Max.max(first, second, third);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxThree7To7To7Then7() {
        int first = 7;
        int second = 7;
        int third = 7;
        int result = Max.max(first, second, third);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxFour5To1To2To4Then5() {
        int first = 5;
        int second = 1;
        int third = 2;
        int four = 4;
        int result = Max.max(first, second, third, four);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxFour4To3To8To1Then8() {
        int first = 4;
        int second = 3;
        int third = 8;
        int four = 1;
        int result = Max.max(first, second, third, four);
        int expected = 8;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxFour4To3To8To1Then10() {
        int first = 4;
        int second = 3;
        int third = 8;
        int four = 10;
        int result = Max.max(first, second, third, four);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxFour3To3To3To3Then3() {
        int first = 3;
        int second = 3;
        int third = 3;
        int four = 3;
        int result = Max.max(first, second, third, four);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }
}