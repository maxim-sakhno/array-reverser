package it.sevenbits.reverser;


/**
 * Contains method to reverse array.
 */
public interface IArrayReverser {


    /**
     * Must reverse array.
     * @param arrayContainer contain array.
     * @param <T> type of elements of array.
     */
    <T> void reverseArray(final IArrayContainer<T> arrayContainer);


}
