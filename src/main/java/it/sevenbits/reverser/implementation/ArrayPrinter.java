package it.sevenbits.reverser.implementation;


import it.sevenbits.reverser.IArrayContainer;
import it.sevenbits.reverser.IArrayPrinter;


/**
 * This class contains method to print the array.
 */
public class ArrayPrinter implements IArrayPrinter {


    /**
     * Prints array which contains in arrayContainer.
     * @param arrayContainer contain array to print.
     * @param <T> type of element of the array.
     */
    public <T> void printArray(final IArrayContainer<T> arrayContainer) {
        T[] array = arrayContainer.getArray();
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


}
