package it.sevenbits.reverser;


/**
 * Contains method to print array.
 */
public interface IArrayPrinter {


    /**
     * Must print array.
     * @param arrayContainer contain array.
     * @param <T> type of elements of array.
     */
    <T> void printArray(final IArrayContainer<T> arrayContainer);


}
