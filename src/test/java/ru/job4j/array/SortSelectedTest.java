package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSortArrayOf5elements() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf3elements() {
        int[] data = new int[] {7, 4, 6};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {4, 6, 7};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf8elements() {
        int[] data = new int[] {1, 4, 2, 12, 9, 4, 6, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 4, 6, 9, 12};
        Assert.assertArrayEquals(expected, result);
    }
}