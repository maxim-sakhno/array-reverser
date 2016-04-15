package it.sevenbits.reverser.implementation;


import it.sevenbits.reverser.IArrayContainer;


/**
 * This class contains an array.
 * @param <T>
 */
public class ArrayContainer<T> implements IArrayContainer<T> {


    private T[] array;


    /**
     * Constructor.
     * @param array initial array.
     */
    public ArrayContainer(final T[] array) {
        setArray(array);
    }


    /**
     * Setter
     * @param array new array.
     * @throws IllegalArgumentException if array is null.
     */
    public void setArray(final T[] array) throws IllegalArgumentException {
        if (array == null) {
            throw new IllegalArgumentException("Class ArrayContainer: Argument array is null.");
        }
        this.array = array;
    }


    /**
     * Getter.
     * @return array.
     */
    public T[] getArray() {
        return array;
    }


}
