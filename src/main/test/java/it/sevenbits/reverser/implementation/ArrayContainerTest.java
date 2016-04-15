package it.sevenbits.reverser.implementation;


import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


/**
 * Created by Maxim on 15.04.2016.
 */
public class ArrayContainerTest {


    private final Integer[] INTEGER_ARRAY = new Integer[] {1, 2, 3};
    private ArrayContainer<Integer> integerArrayContainer;


    @Before
    public void setUp() {
        integerArrayContainer = new ArrayContainer<Integer>(INTEGER_ARRAY);
    }


    @Test (expected = IllegalArgumentException.class)
    public void testSetArray01() {
        integerArrayContainer.setArray(null);
    }


}
