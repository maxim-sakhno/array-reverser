package it.sevenbits.reverser.implementation;


import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


/**
 * Created by Maxim on 15.04.2016.
 */
public class ArrayReverserTest {


    private final Integer[] INTEGER_ARRAY = new Integer[] {1, 2, 3};
    private final Integer[] REVERSED_INTEGER_ARRAY = new Integer[] {3, 2, 1};
    private final Integer[] EMPTY_INTEGER_ARRAY = new Integer[0];
    private ArrayContainer<Integer> integerArrayContainer;
    private ArrayContainer<Integer> emptyIntegerArrayContainer;
    private ArrayReverser arrayReverser;


    @Before
    public void setUp() {
        integerArrayContainer = new ArrayContainer<Integer>(INTEGER_ARRAY);
        emptyIntegerArrayContainer = new ArrayContainer<Integer>(EMPTY_INTEGER_ARRAY);
        arrayReverser = new ArrayReverser();
    }


    @Test
    public void testReverseArray01() {
        arrayReverser.reverseArray(integerArrayContainer);
        Assert.assertArrayEquals(REVERSED_INTEGER_ARRAY, integerArrayContainer.getArray());
    }


    @Test
    public void testReverseArray02() {
        arrayReverser.reverseArray(emptyIntegerArrayContainer);
        Assert.assertArrayEquals(EMPTY_INTEGER_ARRAY, emptyIntegerArrayContainer.getArray());
    }


}
