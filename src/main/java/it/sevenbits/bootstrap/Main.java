package it.sevenbits.bootstrap;

import it.sevenbits.reverser.implementation.ArrayContainer;
import it.sevenbits.reverser.implementation.ArrayPrinter;
import it.sevenbits.reverser.implementation.ArrayReverser;

/**
 * Demonstate classes in package reverser.
 */
final class Main {


    private Main() {

    }


    /**
     * Main method.
     * @param args of command line.
     */
    public static void main(final String[] args) {
        ArrayPrinter arrayPrinter = new ArrayPrinter();
        ArrayReverser arrayReverser = new ArrayReverser();
        ArrayContainer<Integer> integerArrayContainer = new ArrayContainer<Integer>(new Integer[] {1, 2, 3});
        arrayPrinter.printArray(integerArrayContainer);
        arrayReverser.reverseArray(integerArrayContainer);
        arrayPrinter.printArray(integerArrayContainer);
    }


}
