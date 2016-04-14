package it.sevenbits.reverser.implementation;


import it.sevenbits.reverser.IArrayContainer;
import it.sevenbits.reverser.IArrayReverser;


/**
 * This class contains method to reverse elements in the array.
 */
public class ArrayReverser implements IArrayReverser {


    /**
     * This method reverses elements in the array.
     * @param arrayContainer contains array to reverse.
     * @param <T> type of elements in the array.
     */
    public <T> void reverseArray(final IArrayContainer<T> arrayContainer) {
        T[] array = arrayContainer.getArray();
        for (int leftElementIndex = 0; leftElementIndex < array.length / 2; ++leftElementIndex) {
            int rightElementIndex = array.length - 1 - leftElementIndex;
            T temp = array[leftElementIndex];
            array[leftElementIndex] = array[rightElementIndex];
            array[rightElementIndex] = temp;
        }
    }


}
