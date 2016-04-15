package it.sevenbits.reverser.implementation;


import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


/**
 * Created by Maxim on 15.04.2016.
 */
public class ArrayReverserTest {


    private ArrayReverser arrayReverser;


    @Before
    public void setUp() {
        arrayReverser = new ArrayReverser();
    }


    @Test
    public void testArrayReverser01() {
        ArrayContainer<Float> floatArrayContainer = new ArrayContainer<Float>(new Float[] {1.2F, 2.3F, 4.5F});
        arrayReverser.reverseArray(floatArrayContainer);
        Assert.assertArrayEquals(new Float[] {4.5F, 2.3F, 1.2F}, floatArrayContainer.getArray());
    }


    @Test
    public void testArrayReverser02() {
        ArrayContainer<String> stringArrayContainer = new ArrayContainer<String>(new String[0]);
        arrayReverser.reverseArray(stringArrayContainer);
        Assert.assertArrayEquals(new String[0], stringArrayContainer.getArray());
    }


    @Test
    public void testArrayReverser03() {
        ArrayContainer<Integer> integerArrayContainer = new ArrayContainer<Integer>(new Integer[] {1, 2, 1});
        arrayReverser.reverseArray(integerArrayContainer);
        Assert.assertArrayEquals(new Integer[] {1, 2, 1}, integerArrayContainer.getArray());
    }


}
