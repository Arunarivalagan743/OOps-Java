package Genrics;

class CustomArraylistGenrices<T> {
/*
If we use GENERICS:

class CustomArrayList<T> {

    private T[] data;

    public CustomArrayList() {
        data = (T[]) new Object[5];
    }

    public void add(T value) { }

    public T get(int index) { }

}

Why generics?
- T allows storing ANY type (Integer, String, User, etc.)
- Type safety at compile time
- No casting needed while getting elements

Without generics:
- Limited to one datatype
- Less reusable
- More errors in large projects
*/

    private T[] data;   // internal array of generic type
    private int size;   // number of elements present

    // default constructor
    public void CustomArrayList() {
        // Java does NOT allow direct creation of generic arrays
        // So we create Object[] and cast it to T[]
        data = (T[]) new Object[5];
        size = 0;
    }

    // add element at the end
    public void add(T value) {
        if (size == data.length) {
            resize();
        }
        data[size] = value;
        size++;
    }

    // get element by index
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return data[index];
    }

    // remove element by index
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        T removed = data[index];

        // shift elements to the left
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }

        size--;
        return removed;
    }

    // return current size
    public int size() {
        return size;
    }

    // resize the array when full
    private void resize() {
        T[] newData = (T[]) new Object[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }

        data = newData;
    }
}
