package it.sevenbits.reverser.implementation;


import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


/**
 * Created by Maxim on 15.04.2016.
 */
public class ArrayPrinterTest {


    private final Integer[] INTEGER_ARRAY = new Integer[] {1, 2, 3};
    private ArrayContainer<Integer> integerArrayContainer;
    private ArrayPrinter arrayPrinter;
    private ByteArrayOutputStream out;


    @Before
    public void setUp() {
        integerArrayContainer = new ArrayContainer<Integer>(INTEGER_ARRAY);
        arrayPrinter = new ArrayPrinter();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }


    @Test
    public void testPrintArray01() {
        arrayPrinter.printArray(integerArrayContainer);
        Assert.assertEquals("1 2 3 \n", getOut());
    }


    private String getOut() {
        return new String(out.toByteArray());
    }


}
