package com.company;

import org.junit.Test;

import static com.company.Main.sort;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void test1() {
        int[] expected = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9,10, 11, 12, 13, 14, 15 , 16, 17, 18, 19, 20};
        int[] input = new int[]{10, 19, 13, 4, 6, 8, 15 ,5, 12, 18, 1, 3, 7, 14, 20, 17, 2, 9, 11, 16};
        assertArrayEquals(expected, sort(input));
    }

    @Test
    public void test2() {
        int[] expected = new int[]{  -1, 6, 9, 76, 141, 346, 346, 436, 546, 573, 653, 658,764, 789, 2143, 3465, 4574, 4574, 6789, 7645};
        int[] input = new int[]{764, 346, 346, 7645, 789, 4574, 141, 6789, 2143, 4574, 3465, 658, 653, 6, 546, 76, -1, 436, 573, 9};
        assertArrayEquals(expected, sort(input));
    }
    @Test
    public void test3() {
        int[] expected = new int[20];
        int[] input = new int[20];
        assertArrayEquals(expected, sort(input));
    }
    @Test
    public void test4() {
        int[] expected = new int[]{ -46756, -9876, -4567, -2345, -987, -732, -463, -436, -345, -325, -235, -213, -98, -87, -76, -76, -43, -7, -3,-1};
        int[] input = new int[]{-1, -7, -325, -345, -46756, -987, -3, -463, -9876, -87, -235, -43, -76, -213, -2345, -732, -4567, -76, -98, -436};
        assertArrayEquals(expected, sort(input));
    }
    @Test
    public void test5() {
        int[] expected = new int[]{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] input = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        assertArrayEquals(expected, sort(input));
    }
}