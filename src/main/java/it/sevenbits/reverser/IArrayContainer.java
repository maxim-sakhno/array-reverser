package it.sevenbits.reverser;


/**
 * Must contain array.
 * @param <T> type of elements of array.
 */
public interface IArrayContainer<T> {


    /**
     * Setter.
     * @param array new array.
     */
    void setArray(final T[] array);


    /**
     * Getter.
     * @return contained array.
     */
    T[] getArray();


}
