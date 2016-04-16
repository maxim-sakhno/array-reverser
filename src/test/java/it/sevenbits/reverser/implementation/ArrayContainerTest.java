package it.sevenbits.reverser.implementation;


import org.junit.Test;
import org.junit.Assert;


/**
 * Created by Maxim on 15.04.2016.
 */
public class ArrayContainerTest {


    @Test (expected = IllegalArgumentException.class)
    public void testArrayContainer01() {
        new ArrayContainer<Integer>(new Integer[] {1, 2, 3}).setArray(null);
    }


    @Test
    public void testArrayContainer02() {
        ArrayContainer<Double> doubleArrayContainer = new ArrayContainer<Double>(new Double[] {1.1, 2.2, 3.3});
        doubleArrayContainer.setArray(new Double[] {4.4, 5.5, 6.6});
        Assert.assertArrayEquals(new Double[] {4.4, 5.5, 6.6}, doubleArrayContainer.getArray());
    }


    @Test
    public void testArrayContainer03() {
        ArrayContainer<String> stringArrayContainer = new ArrayContainer<String>(new String[] {"aaa", "bbb", "ccc"});
        stringArrayContainer.setArray(new String[] {});
        Assert.assertArrayEquals(new String[] {}, stringArrayContainer.getArray());
    }


    @Test (expected = IllegalArgumentException.class)
    public void testArrayContainer04() {
        new ArrayContainer<Boolean>(null);
    }


    @Test
    public void testArrayContainer05() {
        ArrayContainer<Byte> byteArrayContainer = new ArrayContainer<Byte>(new Byte[] {1, 2, 3});
        Assert.assertArrayEquals(new Byte[] {1, 2, 3}, byteArrayContainer.getArray());
    }


}
