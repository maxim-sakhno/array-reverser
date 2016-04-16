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


    private ByteArrayOutputStream out;
    private ArrayPrinter arrayPrinter;


    @Before
    public void setUp() {
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        arrayPrinter = new ArrayPrinter();
    }


    @Test
    public void testArrayPrinter01() {
        arrayPrinter.printArray(new ArrayContainer<Short>(new Short[] {}));
        Assert.assertEquals("\n", getOut());
    }


    @Test
    public void testArrayPrinter02() {
        arrayPrinter.printArray(new ArrayContainer<Long>(new Long[] {1L, 2L ,3L}));
        Assert.assertEquals("1 2 3 \n", getOut());
    }


    @Test
    public void testArrayPrinter03() {
        arrayPrinter.printArray(new ArrayContainer<Character>(new Character[] {'a', 'b', 'c'}));
        Assert.assertEquals("a b c \n", getOut());
    }


    private String getOut() {
        return new String(out.toByteArray());
    }


}
